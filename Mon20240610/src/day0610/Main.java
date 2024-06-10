package day0610;

import java.io.IOException;
import java.io.PrintWriter;

class Sample {
	int a = 3;
}

class Shape {
	
	double[][] points;
	int[][] cells;
	int nth;
	double r;
	
	Shape(int nth, double r) {
		this.nth = nth;
		this.r = r;
	}
	
	void ngon() {
		double theta = 360.0 / nth * Math.PI / 180;
		points = new double[nth + 1][3];
		cells = new int[nth][3];
		points[0][0] = 0;
		points[0][1] = 0;
		points[0][2] = 0;
		
		for(int i = 0; i < nth; i++) {
			points[i + 1][0] = r * Math.cos(i * theta);
			points[i + 1][1] = r * Math.sin(i * theta);
			points[i + 1][2] = 0;
		}
		
		for(int i = 0; i < nth - 1; i++) {
			cells[i][0] = 0;
			cells[i][1] = i + 1;
			cells[i][2] = i + 2;
		}
		cells[nth - 1][0] = 0;
		cells[nth - 1][1] = nth;
		cells[nth - 1][2] = 1;
	}
	
}

class VtuManager {
	void makeVtu(String fileName, double[][] points, int[][] cells) throws IOException {
		PrintWriter pt = new PrintWriter(fileName);
		pt.println("# vtk DataFile Version 2.0");
		pt.println("test");
		pt.println("ASCII");
		pt.println("DATASET UNSTRUCTURED_GRID");
		
		pt.println("POINTS " + points.length + " float");
		for(int i = 0; i < points.length; i++) {
			pt.println(points[i][0] + " " + points[i][1] + " " + points[i][2]);
		}
		
		pt.println("CELLS " + cells.length + " " + (cells.length * 4));
		for(int i = 0; i < cells.length; i++) {
			pt.println("3 " + cells[i][0] + " " + cells[i][1] + " " + cells[i][2]);	
		}
		
		
		pt.println("CELL_TYPES " + cells.length);
		for(int i = 0; i < cells.length; i++) {
			pt.println("5");
		}
		
		
		pt.close();
	}
}

public class Main {
	
	public static void main(String[] args) throws IOException {
		
//		Sample sp = new Sample();
//		
//		int[] a = new int[3];
//		a[0] = 3; a[1] = 2; a[2] = 4;
//		
//		Sample[] sp1 = new Sample[3];
//		sp1[0] = new Sample();
//		sp1[1] = new Sample();
//		sp1[2] = new Sample();
//		sp1[2].a = 10;
		
		// 0-8
		// 9-17
		// 18-25
		
		
		//=======n각형 돌리기=========
		int nth = 8;
		int repeat = 20;
		double[][] total_points = new double[(nth + 1) * repeat][3];
		int[][] total_cells = new int[nth * repeat][3];
		
		for(int k = 0; k < repeat; k++) {
			
			Shape sp = new Shape(nth, 2.0 - k * 0.1);
			sp.ngon();
			
			for(int i = 0; i < sp.points.length; i++) {
				total_points[i+(nth+1)*k][0] = sp.points[i][0];
				total_points[i+(nth+1)*k][1] = sp.points[i][1];
				total_points[i+(nth+1)*k][2] = sp.points[i][2];
			}
			
			for(int i = 0; i < nth; i++) {
				total_cells[i + nth * k][0] = sp.cells[i][0] + (nth + 1) * k;
				total_cells[i + nth * k][1] = sp.cells[i][1] + (nth + 1) * k;
				total_cells[i + nth * k][2] = sp.cells[i][2] + (nth + 1) * k;
			}
			
		}
		
		VtuManager vtuManager = new VtuManager();
		vtuManager.makeVtu("homework.vtu", total_points, total_cells);
		
		
		
		
//		VtuManager vtuManager = new VtuManager();
//		vtuManager.makeVtu("nth.vtu", sp.points, sp.cells);
//		
//		vtuManager.makeVtu("rot0.vtu", sp.points, sp.cells);
//		
//		double theta = 10 * Math.PI / 180;
//		
//		for(int j = 0; j <36; j++) {
//			for(int i = 0; i < sp.points.length; i++) {
//				double x2 = sp.points[i][0] * Math.cos(theta) - sp.points[i][1] * Math.sin(theta);
//				double y2 = sp.points[i][0] * Math.sin(theta) + sp.points[i][1] * Math.cos(theta);
//				sp.points[i][0] = x2;
//				sp.points[i][1] = y2;
//			}
//			vtuManager.makeVtu("rot" + (j + 1) + ".vtu", sp.points, sp.cells);
//		}
		
		
		//==========삼각형 돌리기============
//		double[][] points = {{0,0,0},{1,0,0},{1,1,0}};
//		int[][] cells = {{0,1,2}};
//		
//		VtuManager vtuManager = new VtuManager();
//		vtuManager.makeVtu("rot0.vtu", points, cells);
//		
//		// 삼각형 돌리기 (삼각함수)
//		double theta = 10 * Math.PI / 180;
//		
//		for(int j = 0; j <36; j++) {
//			for(int i = 0; i < points.length; i++) {
//				double x2 = points[i][0] * Math.cos(theta) - points[i][1] * Math.sin(theta);
//				double y2 = points[i][0] * Math.sin(theta) + points[i][1] * Math.cos(theta);
//				points[i][0] = x2;
//				points[i][1] = y2;			
//			}
//			vtuManager.makeVtu("rot" + (j + 1) + ".vtu", points, cells);
//		}
		
		
//		points[0][0] = points[0][0] * Math.co	s(theta) - points[0][1] * Math.sin(theta);
//		points[0][1] = points[0][0] * Math.sin(theta) + points[0][1] * Math.cos(theta);
//		points[1][0] = points[1][0] * Math.cos(theta) - points[1][1] * Math.sin(theta);
//		points[1][1] = points[1][0] * Math.sin(theta) + points[1][1] * Math.cos(theta);
//		points[2][0] = points[2][0] * Math.cos(theta) - points[2][1] * Math.sin(theta);
//		points[2][1] = points[2][0] * Math.sin(theta) + points[2][1] * Math.cos(theta); 
		
		
		
//		for(int i = 0; i < 5; i++) {
//			manager.makeVtu("tri" + i + ".vtu", points, cells);
//			// points[0][0]
//			// 첫번째는 점 번호
//			// 두번째는 xyz, 0: x, 1: y, 2: z
//			points[0][1] += 0.1;
//			points[1][1] += 0.1;
//			points[2][1] += 0.1;
//		}
//		manager.makeVtu("tri0.vtu", points, cells);
//		points[0][0] += 0.1;
//		manager.makeVtu("tri1.vtu", points, cells);
//		points[0][0] += 0.1;
//		manager.makeVtu("tri2.vtu", points, cells);
//		points[0][0] += 0.1;
//		manager.makeVtu("tri3.vtu", points, cells);
//		points[0][0] += 0.1;
//		manager.makeVtu("tri4.vtu", points, cells);
		
	}

}
