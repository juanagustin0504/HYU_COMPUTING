package day0513;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// H.W.2 Answer
		int[][] a = {{2, 1, 2}, {2, 3, 1}};
		int[][] b = {{6, 2, 1}, {1, 2, 4}};
		int[][] c = new int[a.length][a[0].length];
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[0].length; j++) { 
				c[i][j] = a[i][j] + b[i][j];
			}
		}

		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[0].length; j++) { 
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
		
		/** Method
		 * 독립변수, 종속변수
		 * f(x) = 3x + 2 => x: 독립변수, f(x): x에 따라 값이 바뀌는 종속변수
		 * 1. void 형 => method 안에 내내용을 실행하고 끝
		 * 2. return 형 => method 안의 내용을 실행하고 값을 return
		 */
		
		// 깊은 참조, 얕은 참조
		// deep copy, shallow copy
		// 매개변수로 값을 다 복사, 매개변수로 값의 포인터 주소를 전달
		
		/**
		 * Shallow copy
		 * call by reference
		 * 메모리 주소만 copy
		 */
		
		/**
		 * Deep copy
		 * call by value
		 * 값을 copy
		 */
		

	}

}
