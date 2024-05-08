package week9;

public class TraningMatrix2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// H.W.2
		/**
		 * 2 4 5   1 4 5   3  8 10
		 * 7 8 2 + 2 7 4 = 9 15  6
		 * 2 7 3   3 8 7   5 15 10
		 */
		
		int[][] a = {{2, 4, 5},
					 {7, 8, 2},
					 {2, 7, 3}};
		
		int[][] b = {{1, 4, 5},
					 {2, 7, 4},
					 {3, 8, 7}};
		
		int m = a.length;
		int n = a[0].length;
		
		int[][] c = new int[m][n];
		
		// 합
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		
		// 합 결과
		System.out.println("합 결과");
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				System.out.printf("%3d", c[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		
		// 차
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				c[i][j] = a[i][j] - b[i][j];
			}
		}
		
		// 차 결과
		System.out.println("차 결과");
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				System.out.printf("%3d", c[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		
		// 곱
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				c[i][j] = a[i][j] * b[i][j];
			}
		}
		
		// 곱 결과
		System.out.println("곱 결과");
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				System.out.printf("%3d", c[i][j]);
			}
			System.out.println();
		}
		System.out.println();

	}

}
