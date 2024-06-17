package day0617;

import java.io.IOException;
import java.io.PrintWriter;

class makeshape {
	double[][] points;
	int[][] cells;
	int nth;
	double r;
	
	makeshape( int nth, double r) {
		this.nth = nth;
		this.r = r; 
	}
	
	void ngon() {
		double theta = 360.0 / nth * Math.PI / 180;
		points = new double[nth+1][3];
		cells = new int[nth][3];
		
		points[0][0] = 0; points[0][1] = 0; points[0][2] = 0;
		for(int i=0; i<nth; i++) {
			points[i+1][0] = r*Math.cos(i*theta);
			points[i+1][1] = r*Math.sin(i*theta);
			points[i+1][2] = 0;
		}

		for(int i=0; i<nth-1; i++) {
			cells[i][0] = 0; cells[i][1] = i+1; cells[i][2] = i+2;
		}
		cells[nth-1][0] = 0; cells[nth-1][1] = nth; cells[nth-1][2] = 1;
	}
}

class makefile {
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

public class main {

	public static void main(String[] args) throws IOException {

		makefile mf = new makefile();
		
		// 문제 1 ------------------------------------------------------
		makeshape ms = new makeshape(3, 1);
		ms.ngon();
		
		double theta = 90*Math.PI/180;
		
		for(int i = 0; i < ms.points.length; i++) {
			double x2 = ms.points[i][0] * Math.cos(theta) - ms.points[i][1]*Math.sin(theta);
			double y2 = ms.points[i][0] * Math.sin(theta) + ms.points[i][1]*Math.cos(theta);
			ms.points[i][0] = x2;
			ms.points[i][1] = y2;
		}
		
		
		
		mf.makevtu("tri.vtu", ms.points, ms.cells);
						
		// ------------------------------------------------------
		
		
		
		// 문제 2 ------------------------------------------------------
		
		makeshape ms2 = new makeshape(4, 1);
		ms2.ngon();
		
		theta = 45*Math.PI/180;
		
		for(int i = 0; i < ms2.points.length; i++) {
			double x2 = ms2.points[i][0] * Math.cos(theta) - ms2.points[i][1]*Math.sin(theta);
			double y2 = ms2.points[i][0] * Math.sin(theta) + ms2.points[i][1]*Math.cos(theta);
			ms2.points[i][0] = x2;
			ms2.points[i][1] = y2;
		}
		
		
		
		mf.makevtu("sq.vtu", ms2.points, ms2.cells);
				
		// ------------------------------------------------------
		
		
		
		// 문제 3 ------------------------------------------------------
		makeshape ms3 = new makeshape(5, 1);
		ms3.ngon();
		
		theta = 18*Math.PI/180;
		
		for(int i = 0; i < ms3.points.length; i++) {
			double x2 = ms3.points[i][0] * Math.cos(theta) - ms3.points[i][1]*Math.sin(theta);
			double y2 = ms3.points[i][0] * Math.sin(theta) + ms3.points[i][1]*Math.cos(theta);
			ms3.points[i][0] = x2;
			ms3.points[i][1] = y2;
		}
		
		
		
		mf.makevtu("pt.vtu", ms3.points, ms3.cells);
		
		// ------------------------------------------------------		
		
		
		
		// 문제 4 ------------------------------------------------------
		makeshape[] mss = new makeshape[3];
		mss[0] = ms;
		mss[1] = ms2;
		mss[2] = ms3;
		
		
		
		double[][] total_points = new double[15][3];
		int[][] total_cells = new int[48][3];
		
		int point_idx = 0;
		int cell_idx = 0;
		for(int i = 0; i < mss.length; i++) {
			for(int j = 0; j < mss[i].points.length; j++) {
				total_points[point_idx][0] = mss[i].points[j][0] + (i * 3);
				total_points[point_idx][1] = mss[i].points[j][1];
				total_points[point_idx][2] = mss[i].points[j][2];
				point_idx++;
			}
			
			for(int j = 0; j < mss[i].cells.length; j++) {
				total_cells[cell_idx][0] = mss[i].cells[j][0] + ((mss[i].nth) * i);
				total_cells[cell_idx][1] = mss[i].cells[j][1] + ((mss[i].nth) * i);
				total_cells[cell_idx][2] = mss[i].cells[j][2] + ((mss[i].nth) * i);
				cell_idx++;
			}
			 
		}
		
		
		
		mf.makevtu("total.vtu", total_points, total_cells);

		// ------------------------------------------------------

		
	}

}