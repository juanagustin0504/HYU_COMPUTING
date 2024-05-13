package day0513;

public class abc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int[] a = {3, 4, 5};
//		printa(a);
		
//		int b = printsum(3, 2);
		
//		System.out.println(sumab(2, 3) + sumab(1, 2));
		
//		System.out.println(sumab((int)sumab(2, 3), 3));
		// sumab(sumab(sumab(sumab(~~~)))); 같은 구조는 메모리를 많이 차지 함.
		
//		int[] a = makearray(4);
//		int[] b = makearray(100);
		
//		for(int i = 1; i < 100; i++) {
//			System.out.println(makearray(i));
//		}
		
		int[][] a = new int[100][];
		for(int i = 1; i <= a.length; i++) {
			a[i - 1] = makearray(i);
		}

	}
	
	public static void printa(int[] a) {
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
	
	public static int printsum(int a, int b) {
		int c = a + b;
		return c;
	}
	
	public static double sumab(int a, int b) {
		double c = a + b;
		return c;
	}
	
	public static int[] makearray(int size) {
		int[] c = new int[size];
		return c;
	}

}
