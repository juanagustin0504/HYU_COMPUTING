package day0610;

//파일을 만들기 위한 class import
import java.io.IOException;
import java.io.PrintWriter;

//도형 만드는 class
class makeshape {
	double[][] points; // 전역변수: 꼭짓점(x,y,z) 배열
	int[][] cells; // 도형(삼각형) 그리는 순서를 저장한 배열
	int nth; // n각형
	double r; // 반지름 길이

	// 생성자 (class 이름이랑 같아야함) : n각형, 반지름을 받음
	makeshape( int nth, double r) {
		// 매개변수로 받은 nth를 전역변수 nth에 저장함. 
		// 구분짓기 위해 this. 사용
		this.nth = nth; 
		// 매개변수로 받은 r를 전역변수 r에 저장함.
		this.r = r; 
	}

	// 가지고 있는 points, cells, nth, r을 이용해 도형 만드는 method
	void ngon() {
		// 라디안으로 변환한 theta
		double theta = 360.0 / nth * Math.PI / 180;
		points = new double[nth+1][3]; // nth각형 + 중앙점(nth + 1)
		cells = new int[nth][3]; // 삼각형 그리는 순서를 저장한 배열

		points[0][0] = 0; // x
		points[0][1] = 0; // y
		points[0][2] = 0; // z
		// 중앙을 제외한 꼭짓점을 저장함
		for(int i=0; i<nth; i++) {
			points[i+1][0] = r*Math.cos(i*theta); // x
			points[i+1][1] = r*Math.sin(i*theta); // y
			points[i+1][2] = 0;                // z
		}

		// 삼각형 그리는 순서를 저장
		for(int i=0; i<nth-1; i++) {
			cells[i][0] = 0;    // 첫번째 점
			cells[i][1] = i+1;  // 두번째 점 
			cells[i][2] = i+2;  // 세번째 점
		}
		// 마지막 삼각형은 패턴이 없어서 따로 저장
		cells[nth-1][0] = 0;   // 첫번째 점
		cells[nth-1][1] = nth; // 두번째 점
		cells[nth-1][2] = 1;   // 세번째 점
	}
}

//vtu 파일 만드는 클래스
class makefile {
	// vtu 만드는 메소드
	// filename: 파일이름
	// points: 꼭짓점 배열
	// cells: 삼각형 그리는 순서를 저장한 배열
	// throws IOException: PrintWriter를 사용하기 위해 사용
	void makevtu(String filename, double[][] points, int[][] cells) throws IOException {
		PrintWriter pt = new PrintWriter(filename);      
		pt.println("# vtk DataFile Version 2.0");
		pt.println("test");
		pt.println("ASCII");
		pt.println("DATASET UNSTRUCTURED_GRID");      
		pt.println("POINTS "+ points.length +" float");
		for(int i=0; i<points.length; i++) {
			pt.println(points[i][0] + " " + points[i][1] + " " + points[i][2]);
		}      
		pt.println("CELLS "+cells.length+" "+cells.length*4);
		for(int i=0; i<cells.length; i++) {
			pt.println("3 " + cells[i][0] + " " +cells[i][1] + " " +cells[i][2]);
		}      
		pt.println("CELL_TYPES "+cells.length);
		for(int i=0; i<cells.length; i++) {
			pt.println("5");
		}      
		pt.close();
	}
}

//public class, java파일 이름과 같아야 함
public class Main {

	public static void main(String[] args) throws IOException {

		int nth = 8; // 8각형
		int num = 20;// 20번 반복
		// 모든 꼭짓점을 합친 배열
		double[][] total_points = new double[(nth+1)*num][3];
		// 모든 삼각형의 그리는 순서를 저장한 배열
		int[][] total_cells = new int[ nth * num ][3];

		// num번 만큼 반복하는 배열
		for(int k=0; k<num; k++) {   
			// 도형 만드는 클래스 인스턴스(nth, 반지름 사용)
			makeshape ms = new makeshape(nth, 2.0 - k*0.1);
			// 도형 생성하는 method 호출
			ms.ngon();

			// 점의 수만큼 반복
			// 번호 수를 이어주기 위해 (nth+1)*k
			// 1번째 도형은 0~8
			// 2번째 도형은 9~17
			// 3번째 도형은 18~25
			for(int i=0; i<ms.points.length; i++) {
				total_points[i+(nth+1)*k][0] = ms.points[i][0];
				total_points[i+(nth+1)*k][1] = ms.points[i][1];
				total_points[i+(nth+1)*k][2] = ms.points[i][2];
			}

			// 도형 순서 누적해서 저장
			for(int i=0; i<nth; i++) {
				total_cells[i + nth*k][0] = ms.cells[i][0] + (nth+1)*k;
				total_cells[i + nth*k][1] = ms.cells[i][1] + (nth+1)*k;
				total_cells[i + nth*k][2] = ms.cells[i][2] + (nth+1)*k;
			}
		}

		// 파일 만들어주는 클래스 인스턴스
		makefile mf = new makefile();
		// 파일 만들어줘
		// 이름은 "homework.vtu"
		// 점들은 total_points 에 있는 점들로
		// 도형은 total_cells 순서로 만들어줘
		mf.makevtu("homework.vtu", total_points, total_cells);
		//===================================================

		// 도형을 0도 돌림
		mf.makevtu("rot0.vtu", total_points, total_cells);
		// rot0.vtu ~ rot359.vtu 저장할거야

		//   // 돌리는거.
		//   makeshape ms = new makeshape();
		//   ms.ngon();


		//   makefile mf = new makefile();
		//   mf.makevtu("nth.vtu", ms.points, ms.cells);
		//   
		//   mf.makevtu("rot0.vtu", ms.points, ms.cells);
		//   
		double theta = 1*Math.PI/180;

		for(int j=0; j<360; j++) {

			for(int i=0; i<total_points.length; i++) {
				double x2 = total_points[i][0] * Math.cos(theta) - total_points[i][1]*Math.sin(theta);
				double y2 = total_points[i][0] * Math.sin(theta) + total_points[i][1]*Math.cos(theta);
				total_points[i][0] = x2;
				total_points[i][1] = y2;
			}
			mf.makevtu("rot"+(j+1)+".vtu", total_points, total_cells);

		}

		double[][] points = {{0,0,0}, {0,1,0}, {1,0,0}};
		int[][] cells = {{0,2,1}};

		for(int i=0; i<5; i++) {         
			mf.makevtu("tri"+i+".vtu", points, cells);   
			points[0][1] += 0.1;
			points[1][1] += 0.1;
			points[2][1] += 0.1;
		}

	}

}

