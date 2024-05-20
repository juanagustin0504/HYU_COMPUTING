package day0520;

public class Main {

	public static void main(String[] args) {
		
		// 레오나르도 deep copy리오
		// call by value
		
		// shallow copy
		// call by reference
		
		//
		// 인셉션
		// 
		
		// stack overflow 직전에서 프로그래밍을 돌리기,,?
		// LIFO(Last In First Out)
		
		// method overloading
		// 
		
		// 짱돌이 중요한 개념.
		// 나쁜 놈한테 던진다 -> 목적이 생김
		// 짱돌은 객체가 됨
		//
		
		// 자식이 생기면 마인크래프트 시키자
		// 마인크래프트에서 코드를 짜주자
		
		// class 를 instance 를 해야지만 object가 됩니다.
		// 목적 객체 물건
		
		// OOP
		// 1. 1개의 자바 클래스 안에는
		// 2. 1개의 public class 가 있음
		// 3. 클래스 안에는 변수 또는 메소드, class 등을
		// 	선언 할 수 있음
		// 전역변수니까(지역변수가 아니라 전역변수)
		// 저녁먹자 저녁 변수 쿸쿸
		// Test: 클래스, t1: 변수 이름, new Test(): 생성자
		Test t1 = new Test(); // 인스턴스 해버렸다~~ 캬 미쳣다
		t1.a = 5;
		t1.mn();
		
		// 그
		// class 가 타입을 만들어주는건데
		// 우리가 아라ㅐ쪽에
		// Test라는 클래스를 만들었으니까
		// 타입을 만들어주는거였으니까
		// 위에서 만든 t1은 Test 타입이라는거지
		// t1.mn(); t1이라는 변수 찾아가서 mn() 이라는 걸 실행
		// 
		
		Test t2 = new Test(); // 다른 인스턴스 생성
		System.out.println(t2.a); 
		// 따라서 t1.a = 5; 를 하더라도
		// t2.a 는 3이라는 값을 가지고 있음
		
		// 9시 10분 전 예상
		// 재문이가 저 시간보다 빨리끝나면
		// 밥먹으럭 갈수잇대
		// 아니면 못먹는다는데
		// 3명인데 한그릇에 한병씩?
		// 각자?
		// 잠만 그럼 3그릇시켜
		// 그거 전골처럼 나옴?
		// 뚝으로 안하고?
		// 뚝으로 해야 소주 많이 마실수잇는거아님?
		// 전골이 한그릇이면 한병이잖아
		// 4그릇?
		// 큰거하나 작은거 셋
		// 4갠데
		
		Test[] t = new Test[3];
		t[0] = new Test();
		t[1] = new Test();
		t[2] = new Test();
		
		for(int i = 0; i < t.length; i++) {
			t[i] = new Test();
		}
		
		// 티의 주소로 찾아가서 1번째 항목으로 찾아가서
		// t 찾아가서 t[1] 찾아가서 a 값을 바꿔라
		t[1].a = 5;
		
		// 안돼 내 뼈해장국,,
		// 30분이면,, 
		// 아니 우리가 한주 빨랐으면
		// 우리 한번 빠졋으니까
		// 맞춰진거아님?
		// 여긴 너무 누네띠네!
		// 문제가 문제가 
		
		Member member = new Member("park", 20);
		Member mb2 = new Member("kim", 100);
		System.out.println(member.name + " " + mb2.name);
		// 기승전 마크
		// 솔직히 28분전에만 끝내주시면
		// 뼈해 먹으러 갈 수 있지 않을까라는
		// 소신발언 해봅니다..
		
		// 생승자
		// this
		// 저녁변수
		// 저녁 공유함
		// a=a;
		// this 는 전역변수를 가르킴
		// 대답을 잘 해야 빨리 끝나지
		// 정공버리지마,,
		// this 인스턴스 될 때 메모리의 첫번째 주소
		// this: 자기 자신
		// 멘탈 갈린다 이거
		// 지금 생성자 안에서 this 불렀잖아
		// 현재 위치에서 자신의 클래스를 부른거지
		// 11eeff 가 주소
		// 생성자가 클래스 생성해준건데
		// 그 생성된 클래스의 주소
		// Temp t = new Temp(); t의 주소가 11eeff
		// 생성 되면서 this를 부르니까 t의 주소가 되고
		// t.a 를 하면 11eeff.a 
		// 코드가 4개가 잇는데
		
		
		
		Temp tp = new Temp(3);
		
		
		// 클래스에 집어넣고 싶지 않은데
		// 와 행렬 클래스 만들어서
		// + - x 
	}

}

class Matrix {
	int m, n;
	
	Matrix() {
		
	}
	// method 4개?
	// 덧셈, 뺄셈, 곱셈
	// 돌아갈까
	// 
}

class Test {
	int a = 3;
	void mn() {
		System.out.println(a);
	}
}

class Member {
	String name;
	int grade;
	// 생성자: 클래스 이름과 동일한 메소드
	// 인스턴스 하자마자 실행
	Member(String nm, int gd) {
		name = nm;
		grade = gd;
	}
}

class Temp {
	int a;
	Temp(int a) { // 16진수 주소값 아무거나 그냥 가져오신건데
		// 포인터변수 주소,,?
		this.a = a;
	}
}
