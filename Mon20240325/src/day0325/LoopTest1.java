package day0325;

public class LoopTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		
		int i = 0;
		while (i < 3) {
			int j = 0;
			while (j < i + 1) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
