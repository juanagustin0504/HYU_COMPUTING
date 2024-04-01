package day0401;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2024.04.01
		
//		for(int i = 0; i < 3; i++ ) {
//			System.out.println(i);
//		}
		
		// System.out.println(i); 
		// 사용 불가 i는 for 블럭 끝나고 삭제
		
//		for(int i = 0; i < 3; i++) {
//			// block 에서 선언된 변수는 반복할 때 마다 생성되고 삭제된다
//			int j = i + 4;
//		}
		// System.out.println(j);
		
//		for(int i = 0; i < 3; i++) {
//			for(int j = 0; j < 2; j++) {
//				System.out.println(i + " " + j);
//			}
//		}
		
		// 반복문 + 조건
//		int i = 0;
//		while (i < 5) {
//			System.out.println(i+++1);
//		}
		
//		for (i = 0; i < 5; i++) {
//			System.out.println(i + 1);
//		}
		
//		=========================
//		int i = 0;
//		while (i < 100) {
//			if (i > 0 && i < 6) {
//				System.out.println(i);
//			}
//			i++;
//		}
		
//		for (int i = 0; i < 100; i++) {
//			if (i > 0 && i < 6) {
//				System.out.println(i);
//			}
//		}
//		============================
		
//		for (int i = 0; i < 10; i++) {
//			System.out.println(i + 1);
//		}
		
//		for (int i = 0; i < 10; i++) {
//			if ((i + 1) % 2 == 0) {
//				System.out.println(i + 1);
//			}
//		}
		
		// Code
//		for (int i = 0; i < 10; i++) {
//			if (i % 2 == 1) {
//				System.out.println(i);	
//			}
//		}
		
//		int i = 0;
//		for (;;) {
//			if (i > 0) {
//				if (i == 4) {
//					break;
//				}
//				
//				System.out.print(i);
//			}
//			
//			i++;
//		}
		
//		boolean flag = false; // boolean which = false;
//		
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < 5 ; j++) {
//				System.out.println(i + " " + j);
//				if (i == 1 && j == 3) {
//					flag = true;
//					break;
//				}
//			}
//			if (flag) break;
//		}
		
//		for (int i = 0; i < 5; i++) {
//			if (i == 2) {
//				continue;
//			}
//			
//			System.out.println(i);
//		}
		
//		for (int i = 0; i < 10; i++) {
//			if (i >2 && i < 5) {
//				continue;
//			}
//			System.out.println(i);
//		}
		
//		int i = 0;
//		while(i < 5) {
//			if (i == 3) {
//				// i++; 추가하면 loop 탈출할 수 있음
//				continue;
//			}
//			System.out.println(i++);
//		} // 무한반복
		

	}

}
