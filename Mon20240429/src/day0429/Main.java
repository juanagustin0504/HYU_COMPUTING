package day0429;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 정적 배열: 크기 고정
		// 동적 배열: 크기 변경 가능
		
//		int[] a = {1, 4, 7};
		// 정적배열 장점
		// Access 속도가 매우 빠름
		// 배열을 만들 때 100개를 만들 상황이 생긴다면
		// 초기 배열 크기도 100으로 설정해야 됨.
		// ㅈㄴ비효율적
		// 근데 속도는 ㅈ나 빠름
		// 메모리 충분한 사람들
		
		// 동적배열 장점
		// 속도는 느림
		// 효율적
		
		// 포인터 타입
		int[] a = new int[3]; 
		// new int[3]을 먼저함. 메모리 랜덤한 곳. 16진수
		// a라는 곳에 첫번째 메모리 주소가 들어감
		// 포인터 타입 4byte. 메모리주소(16진수).
		// 1. 임의 메모리 공간에 int 3개짜리로 선언하고 처음 메모리 주소를 변환
		// 2. 메모리 주소를 0에 저장, 이대 a는 포인터 타입으로 주소만 저장할 수 있음.
		// '참조'라고 한다. (메모리 주소를 저장함) reference
		
		System.out.println(a);
				
		
	}

}
