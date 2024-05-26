package week12;

public class Main {
	public static void main(String[] args) {
		int[][] a = {{2, 4, 5},
			 		 {7, 8, 2},
			 		 {2, 7, 3}};

		int[][] b = {{1, 4, 5},
				     {2, 7, 4},
			 		 {3, 8, 7}};

		Matrix mtrx = new Matrix(a, b);
		
		System.out.println("a, b 행렬구조 출력");
		mtrx.printMatrix();
		
		System.out.println();
		System.out.println("a, b 행렬의 합 출력");
		
		int[][] result = mtrx.resultPlus();
		
		for(int i = 0; i < result.length; i++) {
			for(int j = 0; j < result[i].length; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("a, b 행렬의 차 출력");
		
		result = mtrx.resultMinus();
		
		for(int i = 0; i < result.length; i++) {
			for(int j = 0; j < result[i].length; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("a, b 행렬의 곱 출력");
		
		result = mtrx.resultMulti();
		
		for(int i = 0; i < result.length; i++) {
			for(int j = 0; j < result[i].length; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}

	}
}

class Matrix {
	int[][] a;
	int[][] b;

	// 생성자
	Matrix(int[][] a, int[][] b) {
		this.a = a;
		this.b = b;
	}

	// a, b 행열의 합을 계산 후 리턴
	int[][] resultPlus() {

		int[][] c = new int[a.length][a[0].length];

		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[0].length; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}

		return c;
	}

	// a, b 행열의 차를 계산 후 리턴
	int[][] resultMinus() {

		int[][] c = new int[a.length][a[0].length];

		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[0].length; j++) {
				c[i][j] = a[i][j] - b[i][j];
			}
		}

		return c;
	}

	// a, b 행열의 곱을 계산 후 리턴
	int[][] resultMulti() {

		int[][] c = new int[a.length][b[0].length];

		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < b[0].length; j++) {
				c[i][j] = 0;
				for(int k = 0; k < a[i].length; k++) {
					c[i][j] += a[i][k] * b[k][j]; 
				}
			}
		}

		return c;
	}

	// a, b 두 행렬을 출력
	void printMatrix() {
		// print a matrix
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println();

		// print b matrix
		for(int i = 0; i < b.length; i++) {
			for(int j = 0; j < b[i].length; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
	}
}