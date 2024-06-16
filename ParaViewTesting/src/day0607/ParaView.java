package day0607;

import java.io.IOException;
import java.io.PrintWriter;

public class ParaView {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int nth = 8;
		int repeat = 20; // 반복 횟수
		double theta = 360.0 / nth * Math.PI / 180;
		double[][] points = new double[(nth * repeat + 1)][3];
		int[][] cells = new int[nth * repeat][3];
		
		// Midpoint
		points[0][0] = 0;
		points[0][1] = 0;
		points[0][2] = 0;
		
		// Set Points
		for(int j = 0; j < repeat; j++) {
			for(int i = 0; i < nth; i++) {
				points[i + 1 + (j * nth)][0] = (j + 1) * 0.1 * Math.cos(i * theta);
				points[i + 1 + (j * nth)][1] = (j + 1) * 0.1 * Math.sin(i * theta);
				points[i + 1 + (j * nth)][2] = 0;
			}
		}
		
		// Make Triangle
		for(int j = 0; j < repeat; j++) {
			for(int i = 0; i < nth - 1; i++) {
				cells[i + (nth * j)][0] = 0;
				cells[i + (nth * j)][1] = i + 1 + (nth * j);
				cells[i + (nth * j)][2] = i + 2 + (nth * j);
			}
			cells[nth * (j + 1) - 1][0] = 0;
			cells[nth * (j + 1) - 1][1] = nth + (nth * j);
			cells[nth * (j + 1) - 1][2] = 1 + (nth * j);
		}
		
		
		PrintWriter pt = new PrintWriter("maketri.vtu");
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





//package day0607;
//
//import java.io.IOException;
//import java.io.PrintWriter;
//
//public class ParaView {
//
//	public static void main(String[] args) throws IOException {
//		// TODO Auto-generated method stub
//		int nth = 8;
//		double theta = 360.0 / nth * Math.PI / 180;
//		double[][] points = new double[(nth * 2 + 1)][3];
//		int[][] cells = new int[nth * 2][3];
//		
//		// Midpoint
//		points[0][0] = 0;
//		points[0][1] = 0;
//		points[0][2] = 0;
//		
//		for(int i = 0; i < nth; i++) { // Large octagon
//			points[i + 1][0] = 2 * Math.cos(i * theta);
//			points[i + 1][1] = 2 * Math.sin(i * theta);
//			points[i + 1][2] = 0;
//		}
//		
//		for(int i = 0; i < nth; i++) { // Small octagon
//			points[i + 1 + nth][0] = 1 * Math.cos(i * theta);
//			points[i + 1 + nth][1] = 1 * Math.sin(i * theta);
//			points[i + 1 + nth][2] = 0;
//		}
//		
//		
//		// Large octagon
//		for(int i = 0; i < nth - 1; i++) {
//			cells[i][0] = 0;
//			cells[i][1] = i + 1;
//			cells[i][2] = i + 2;
//		}
//		cells[nth - 1][0] = 0;
//		cells[nth - 1][1] = nth;
//		cells[nth - 1][2] = 1;
//		
//		// Small octagon
//		for(int i = 0; i < nth - 1; i++) {
//			cells[i + nth][0] = 0;
//			cells[i + nth][1] = i + 1 + nth;
//			cells[i + nth][2] = i + 2 + nth;
//		}
//		cells[nth * 2 - 1][0] = 0;
//		cells[nth * 2 - 1][1] = nth + nth;
//		cells[nth * 2 - 1][2] = 1 + nth;
//		
//		
//		
//		PrintWriter pt = new PrintWriter("maketri.vtu");
//		pt.println("# vtk DataFile Version 2.0");
//		pt.println("test");
//		pt.println("ASCII");
//		pt.println("DATASET UNSTRUCTURED_GRID");
//		
//		pt.println("POINTS " + points.length + " float");
//		for(int i = 0; i < points.length; i++) {
//			pt.println(points[i][0] + " " + points[i][1] + " " + points[i][2]);
//		}
//		
//		pt.println("CELLS " + cells.length + " " + (cells.length * 4));
//		for(int i = 0; i < cells.length; i++) {
//			pt.println("3 " + cells[i][0] + " " + cells[i][1] + " " + cells[i][2]);	
//		}
//		
//		
//		pt.println("CELL_TYPES " + cells.length);
//		for(int i = 0; i < cells.length; i++) {
//			pt.println("5");
//		}
//		
//		
//		pt.close();
//	
//
//	}
//
//}
