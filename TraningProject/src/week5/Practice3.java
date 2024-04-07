package week5;

public class Practice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 실습3.pdf

		// 1. 808057 이라는 숫자가 있다. 이 수는 2개의 소수를 곱하여 계산된 수이다.
		// 2개의 소수를 프로그래밍하여 찾으세요.

		System.out.println("1. 808057 이라는 숫자가 있다. 이 수는 2개의 소수를 곱하여 계산된 수이다.");
		System.out.println("2개의 소수를 프로그래밍하여 찾으세요.");

		int value = 808057; // 구하려는 두 소수의 곱셈 값
		boolean flag = false; // 값을 찾으면 루프 탈출을 위한 플래그 변수
		// 최소 소수는 2 이므로 2x2(i*j) 부터 시작함.
		// 반복은 자신의 절반을 넘어가지 않도록 반복함 (2로 나눠지기 때문)
		for (int i = 2; i <= value / 2; i++) {
			for (int j = 2; j <= value / 2; j++) {
				if (i * j == value) {
					if (isPrime(i) && isPrime(j)) {
						System.out.println(i + " x " + j + " = " + value);
						flag = true;
						break;
					} // end of if(i&j)
				} // end of if(i*j)
			} // end of for(j)

			if (flag) {
				break;
			}
		} // end of for(i)

		System.out.println();

		// 2. 1부터 100까지의 소수를 모두 더하는 프로그램을 완성하세요.
		System.out.println("2. 1부터 100까지의 소수를 모두 더하는 프로그램을 완성하세요.");

		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (isPrime(i)) {
//				System.out.println(sum + " + " + i); // for debugging
				sum += i;
			}

		}

		System.out.println(sum);

		System.out.println();

		// 3. 1 x 2 x 3 x 4 x 5 x 6 x 7 를 계산하는 프로그램을 완성하세요.
		System.out.println("3. 1 x 2 x 3 x 4 x 5 x 6 x 7 를 계산하는 프로그램을 완성하세요.");

		int sum3 = 1;
		for (int i = 1; i < 7; i++) {
			sum3 *= i + 1;
		}

		System.out.println(sum3);

		System.out.println();

		// 4. 다음과 같이 출력되도록 while문 2개를 써서 프로그램을 완성하세요.
		// (-> 기호까지 모두 출력되어야 함.)
		System.out.println("4. 다음과 같이 출력되도록 while문 2개를 써서 프로그램을 완성하세요.");
		System.out.println("(-> 기호까지 모두 출력되어야 함.)");

		int i = 0, j = 0;
		while (i < 5) {
			j = 5 - i;
			System.out.print(j + "->");

			while (j > 0) {
				System.out.print(j--);
			}
			i++;

			System.out.println();
		}

		System.out.println();

		// 5. 다음과 같이 출력되도록 while문을 쓴 프로그램을 완성하세요.
		System.out.println("5. 다음과 같이 출력되도록 while문을 쓴 프로그램을 완성하세요.");

		int k = 1, l = 5;
		while (k < 6) {
			// 정수 계산보다 문자열로 만들기 위해 "" 추가
			System.out.print("" + k++ + l-- + "/");
		}

		System.out.println();
		System.out.println();

		// 6. 다음과 같이 출력되도록 while문을 쓴 프로그램을 완성하세요.
		/*
		 * ----------* 
		 * ---------** 
		 * --------*** 
		 * -------**** 
		 * ------***** 
		 * -----******
		 * ----******* 
		 * ---******** 
		 * --********* 
		 * -**********
		 * ***********
		 */
		System.out.println("6. 다음과 같이 출력되도록 while문을 쓴 프로그램을 완성하세요.");

		final int HEIGHT = 10;

		int x = 0;

		while (x <= HEIGHT) {
			int y = HEIGHT - x;
			while (y > 0) {
				System.out.print(" ");
				y--;
			}

			y = 0;
			while (y <= x) {
				System.out.print("*");
				y++;
			}

			System.out.println();
			x++;
		}

	} // end of main

	/**
	 * 소수 판별 함수
	 * 
	 * @param x: 판별할 정수
	 * @return 소수 판별 여부(Boolean)
	 */
	public static boolean isPrime(int x) {

		boolean isPrime = true;

		if (x <= 1) return false; // 1 이하인 수는 소수 아님.
		else if (x <= 3) return true; // 2, 3은 소수임.
		else if (x % 2 == 0 || x % 3 == 0) return false; // 2와 3으로 나눠지면 소수 아님.

		// 위에서 2, 3으로 나누는 것을 했기 때문에 5부터 시작
		for (int i = 5; i * i <= x; i++) {
			// 반복을 줄이기 위해 x의 제곱근만큼 반복
			if (x % i == 0) { // 나눠지면 소수가 아님
				isPrime = false;
				break;
			}
		}

		return isPrime;
	} // end of isPrime

}
