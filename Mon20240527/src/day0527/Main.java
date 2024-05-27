package day0527;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		abc ab = new abc();
		System.out.println(ab.a); // 가능
		// b는 private 변수이기 때문에 접근 불가
//		System.out.println(ab.b); // 불가능
		ab.ab(); // 가능
		
		// default: 같은 패키지 내에서 접근 가능
		// abc.java
		// def.java
		// def class 안에 있는 public, default 접근가능
		
		// 메모리 논리적 구조
		// static, stack, heap
		// static: 전역변수, static 변수
		// stack: 지역변수, 메소드, 재귀함수 등, 속도는 빠름, 용량 작음
		// heap: 배열성생 등등 속도는 느린 대신 용량이 큼
		// int[] a = new int[1000]; 
		// a 는 stack 에 저장
		// int[1000] heap 에 저장
		// 클래스 생성도 마찬가지
		// 정적변수는 초기값 필요함
		// 정적메소드는 인스턴스 필요없이 바로 사용가능
		
		// public class 안에서는
		// 모두 public이 붙어야함
		// 알려주기 싫은 메소드들은
		// 다른 클래스로 빼면되네
		// 같은 클래스 이름 사용 하면 x
		
		// 상속
		// private 상속안됨
		// c++ friend 는 된다네?
		// 절친이구만
		// 상속시
		// 부모의 생성자를 꼭 실행해야함
		// 부모가 생성자가 없다면 실행 안해도됨
		// 근데 컴파일러는 실행함 ㅋ
		// super();
		// super() 가장 먼저 실행 후 해야함
		// 교수님: 여러분들이 부모 없이 생겼겠어?
		// 시전..
		// this: 인스턴스 되엇을 때 첫번째 주소
		// 여러번 상속 받을 때
		// 가장 처음 생성된 객체의 주소..
		
	}

}

class abc {
	public int a = 4; // 외부에 공개 가능
	private int b = 5; // 해당 클래스에서만 사용가능
	public void ab() {
		System.out.println(a+b);
	}
}