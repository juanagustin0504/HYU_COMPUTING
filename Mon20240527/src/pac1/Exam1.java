package pac1;

class test { // default: package 내에서만 공개
	int a = 3;
	public int b = 4;
	private int c = 5;
	class tt1 {
		private int b = 4;
		int c = 15;
	}
	void tt2() {
		tt1 tt3 = new tt1();
		System.out.println(tt3.c);
	}
}

public class Exam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test t1 = new test();
		t1.a = 10;
		System.out.println(t1.a);
	}

}
