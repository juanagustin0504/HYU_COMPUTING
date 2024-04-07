package week5;

public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 실습2.pdf
		
		// 1. 다음과 같이 출력하시오.
		System.out.println("1. 다음과 같이 출력하시오.");
		for (int i = 0; i < 5; i++) {
			System.out.println(i + 1);
		}
		
		System.out.println();
		
		// 2. 다음과 같이 출력하시오.
		System.out.println("2. 다음과 같이 출력하시오.");
		for (int i = 0; i < 7; i++) {
			System.out.print(i * 2 + 1 + " ");
		}
		
		System.out.println();
		System.out.println();
		
		// 3. while문을 통하여 i가 1부터 100까지 loop되도록 완성하시오.
		// 그리고 10보다 크고 20보다 작을 때만 출력하도록 코딩하시오.
		System.out.println("3. while문을 통하여 i가 1부터 100까지 loop되도록 완성하시오.");
		System.out.println("그리고 10보다 크고 20보다 작을 때만 출력하도록 코딩하시오.");
		
		int i = 1;
		while (i <= 100) {
			if (i > 10 && i < 20) {
				System.out.println(i);
			}
			i++;
		}
		
		System.out.println();
		
		// 4. 1부터 10까지 모두 더한 값을 while을 통하여 코딩하고, 결과를 출력하시오.
		System.out.println("4. 1부터 10까지 모두 더한 값을 while을 통하여 코딩하고, 결과를 출력하시오.");
		
		int sum = 0;
		int j = 1;
		while (j <= 10) {
			sum += j++;
		}
		
		System.out.println(sum);
		
		System.out.println();
		
		// 5. 다음을 출력하시오 (- 는 띄어쓰기임)
		/*
		  -----*
		  ----***
		  ---*****
		  --*******
		  -*********
		  ***********
		 */
		System.out.println("5. 다음을 출력하시오.");
		
		final int HEIGHT = 5;
		
		for (int k = 0; k <= HEIGHT; k++) {
			for (int l = HEIGHT - k; l > 0; l--) {
				System.out.print(" ");
			}
			
			for (int l = 0; l <= k * 2; l++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

}
