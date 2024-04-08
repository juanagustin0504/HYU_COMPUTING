package day0408;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문제 풀이
		
		// 1-1
//		int x = 4;
//		System.out.println(Math.pow(x, 2) + 2 * x + 5);
		
		// 1-2
//		System.out.println("안녕!");
//		System.out.println("안녕!");
//		System.out.println("안녕!");
//		System.out.println("안녕!");
//		System.out.println("안녕!");
		
		// 1-3
//		String language = "JAVA";
//		String version = "3.96";
//		System.out.println(language + " " + version);
		
		// 1-4
//		double c = 32; // 암시적 캐스팅
//		int c1 = (int)32.0; // 명시적 캐스팅
//		
//		double f = (9.0/5)*c + 32;
//		System.out.println(f);
		
		// 1-5
		// 수학적으론 다 double
//		double r = 5;
//		double pi = 3.14;
//		
//		System.out.println(pi * Math.pow(r, 2));
//		System.out.println(2 * pi * r); // 무한소수 계산을 잘 못함;
		
		// 1-6
//		int hour = 10000 / 3600;
//		int minute = 10000 % 3600 / 60;
//		int second = (10000 % 3600) % 60;
//		System.out.println(hour + " " + minute + " " + second);
		
		// 1-7
//		System.out.println("3 x " + a + " = " + 3 * a++); print문 안에 증감연산자 사용x
//		int a = 1;
//		System.out.println("3 x " + a + " = " + 3 * a);
//		a++;
//		System.out.println("3 x " + a + " = " + 3 * a);
//		a++;
//		System.out.println("3 x " + a + " = " + 3 * a);
//		a++;
//		System.out.println("3 x " + a + " = " + 3 * a);
//		a++;
//		System.out.println("3 x " + a + " = " + 3 * a);
//		a++;
//		System.out.println("3 x " + a + " = " + 3 * a);
//		a++;
//		System.out.println("3 x " + a + " = " + 3 * a);
//		a++;
//		System.out.println("3 x " + a + " = " + 3 * a);
//		a++;
//		System.out.println("3 x " + a + " = " + 3 * a);
		
		// 2-1
//		for (int i = 0; i < 5; i++) {
//			System.out.println(i + 1);
//		}
		
		// 2-2
//		for (int i = 0; i < 7; i++) {
//			System.out.print(i * 2 + 1 + " ");
//		}
		
//		for (int i = 1; i < 14; i+=2) {
//			System.out.print(i + " ");
//		}
		
//		for (int i = 0; i < 14; i++) {
//			if (i % 2 == 1) {
//				System.out.print(i + " ");
//			}
//		}
		
		// 2-3
//		int i = 1;
//		while (i <= 100) {
//			if (i > 10 && i < 20) {
//				System.out.println(i);
//			}
//			
//			i++;
//		}
		
		// 2-4
//		int sum = 0;
//		int i = 0;
//		while (i < 10) {
//			sum += i;
//			i++;
//		}
//		
//		System.out.println(sum);
		
		// 2-5
//		for (int j = 0; j < 6; j++) {
//			for (int i = 0; i < 5 - j; i++) {
//				System.out.print(" ");
//			}
//			for (int i = 0; i < (2*j) + 1; i++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		// 3-1
//		int a = 10;
//		if (a % 1 == 0) -> 약수
//		int sum = 0;
//		int a = 'G';
//		for (int i = 0; i < a; i++) {
//			if (a % (i + 1) == 0) {
////				System.out.println(i + 1);
//				sum++;
//			}
//		}
//		
////		System.out.println(sum);
//		
//		if (sum == 2) {
//			System.out.println(a + ": 소수");
//		} else {
//			System.out.println(a + ": 합성수");
//		}
		
//		int a = 100;
//		for (int j = 2; j < a; j++) {
//			int sum = 0;
//			for (int i = 0; i < a; i++) {
//				if (j % (i + 1) == 0) {
////					System.out.println(i + 1);
//					sum++;
//				}
//			}
//			
//			if (sum == 2) {
//				System.out.println(j + ": 소수");
//			}
//		}
		
//		int a = 0;
//		for (;;) {
//			a++;
//			int sum = 0;
//			for (int i = 0; i < a; i++) {
//				if (a%(i+1) == 0) {
//					sum++;
//				}
//			}
//			
//			if(sum == 2) {
//				if (808057 % a == 0) {
//					System.out.println(a + " x " + 808057/a + " = " + 808057);
//					break;
//				}
//			}
//		}
		
//		int sum1 = 0;
//		for (int a = 2; a < 101; a++) {
//			int sum = 0;
//			for (int i = 0; i < a; i++) {
//				if (a % (i+1) == 0) {
//					sum++;
//				}
//			}
//			
//			if (sum == 2) {
////				System.out.println(a + ": 소수");
//				sum1 += a;
//			}
//		}
//		
//		System.out.println(sum1);
		
		// 3-3
		// 1*2*3*4*5*6*7
//		int sum = 1;
//		for (int i = 0; i < 7; i++) {
//			sum *= (i + 1);
//		}
//		System.out.println(sum);
		
		// 3-4
		int i = 0, j = 0;
		while (i < 5) {
			j = 5 - i;
			System.out.print(j + "->");

			while (j > 0) {
				System.out.print(j);
				j--;
			}
			i++;

			System.out.println();
		}
		
	}

}
