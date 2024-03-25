package day0325;

public class LoopTest1 {

	public static void main(String[] args) {
		// 2024.03.25
//		int i = 0;
//		while (i < 10) {
//			System.out.println("1+" + (i + 1) + "=" + (i + 2));
//			i++;
//		}
//		int i = 0;
//		while (i < 9) {
//			System.out.println("2x" + (i + 1) + "=" + 2 * (i + 1));
//			i++;
//		}
		
//		int i = 0;
//		while (i < 3) {
//			int j = 0;
//			while (j < i + 1) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
		int i = 0;
		while(i < 8) {
			int j = 0;
			while(j < 9) {
				System.out.println((i + 2) + "x" + (j + 1) + "=" + (i + 2) * (j + 1));
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
