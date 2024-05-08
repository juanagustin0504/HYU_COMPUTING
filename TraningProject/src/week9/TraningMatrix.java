package week9;

public class TraningMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 행열 연습
//		int[][] a = {{3, 2, 1},
//					 {2, 1, 3},
//					 {2, 2, 4}};
//		
//		int[][] b = {{3, 2},
//					 {1, 2},
//					 {1, 4}};
//		
//		int[][] c = new int[a.length][b[0].length];
		
		// 1번
//		c[0][0] = a[0][0] * b[0][0] + a[0][1] * b[1][0] + a[0][2] * b[2][0];
//		c[0][1] = a[0][0] * b[0][1] + a[0][1] * b[1][1] + a[0][2] * b[2][1];
//		
//		c[1][0] = a[1][0] * b[0][0] + a[1][1] * b[1][0] + a[1][2] * b[2][0];
//		c[1][1] = a[1][0] * b[0][1] + a[1][1] * b[1][1] + a[1][2] * b[2][1];
//		
//		c[2][0] = a[2][0] * b[0][0] + a[2][1] * b[1][0] + a[2][2] * b[2][0];
//		c[2][1] = a[2][0] * b[1][0] + a[2][1] * b[1][1] + a[2][2] * b[2][1];
		
		// 2번
//		for(int i = 0; i < a.length; i++) {
//			c[i][0] = a[i][0] * b[0][0] + a[i][1] * b[1][0] + a[i][2] * b[2][0];
//			c[i][1] = a[i][0] * b[0][1] + a[i][1] * b[1][1] + a[i][2] * b[2][1];
//			
//		}
		
		// 3번
//		for(int i = 0; i < a.length; i++) {
//			for(int j = 0; j < a[i].length; j++) {
//				c[i][0] += a[i][j] * b[j][0];
//				c[i][1] += a[i][j] * b[j][1];
//			}
//		}
		
		// 4번(최종)
//		for(int i = 0; i < a.length; i++) {
//			for(int j = 0; j < b[i].length; j++) {
//				c[i][j] = 0;
//				for(int k = 0; k < a[i].length; k++) {
//					c[i][j] += a[i][k] * b[k][j]; 
//				}
//			}
//		}
		
		
		/** c 출력
		 * 12 14 
		 * 10 18 
		 * 12 24 
		 */
//		for(int i = 0; i < c.length; i++) {
//			for(int j = 0; j < c[i].length; j++) {
//				System.out.print(c[i][j] + " ");
//			}
//			System.out.println();
//		}
		
		
		

	}

}
