package day0603;

import java.io.IOException;
import java.io.PrintWriter;

public class Exam1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
//		double[][] points = {{0,0,0},{1,0,0},{1,1,0}}; // 꼭지점 zyx 좌표
//		int[][] cells = {{0,1,2}}; // 반시계 방향의 도형 정의
		
//		double[][] points = {{0,0,0},{1,0,0},{1,1,0},{0,1,0},
//							 {0,0,1},{1,0,1},{1,1,1},{0,1,1}};
//		int[][] cells = {{0,1,2},{0,2,3},{5,6,1},{6,2,1},
//						 {3,2,6},{7,3,6},{0,3,7},{0,7,4},
//						 {5,1,4},{1,0,4},{7,6,4},{6,5,4}};
		
		int nth = 8;
		double theta = 360.0 / nth * Math.PI / 180;
		double[][] points = new double[nth + 1][3];
		int[][] cells = new int[nth][3];
		points[0][0] = 0;
		points[0][1] = 0;
		points[0][2] = 0;
		
//		points[1][0] = 2*Math.cos(0*theta);
//		points[1][1] = 2*Math.sin(0*theta);
//		points[1][2] = 0;
		
		for(int i = 0; i < nth; i++) {
			points[i + 1][0] = 2 * Math.cos(i * theta);
			points[i + 1][1] = 2 * Math.sin(i * theta);
			points[i + 1][2] = 0;
		}
		
		cells[0][0] = 0;
		cells[0][1] = 1;
		cells[0][2] = 2;
		
		for(int i = 0; i < nth - 1; i++) {
			cells[i][0] = 0;
			cells[i][1] = i + 1;
			cells[i][2] = i + 2;
		}
		cells[nth - 1][0] = 0;
		cells[nth - 1][1] = nth;
		cells[nth - 1][2] = 1;
		
		
		PrintWriter pt = new PrintWriter("maketri.vtu");
		pt.println("# vtk DataFile Version 2.0");
		pt.println("test");
		pt.println("ASCII");
		pt.println("DATASET UNSTRUCTURED_GRID");
		
		pt.println("POINTS " + points.length + " float");
		for(int i = 0; i < points.length; i++) {
			pt.println(points[i][0] + " " + points[i][1] + " " + points[i][2]);
		}
//		pt.println(points[0][1] + " " + points[0][1] + " " + points[0][2]);
//		pt.println(points[1][1] + " " + points[1][1] + " " + points[1][2]);
//		pt.println(points[2][1] + " " + points[2][1] + " " + points[2][2]);
//		pt.println("0 0 0");
//		pt.println("1 0 0");
//		pt.println("1 1 0");
		
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
