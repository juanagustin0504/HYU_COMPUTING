package Monday;

public class Test1 {

	public static void main(String[] args) {
		/**
		 * Date: 2024.03.11
		 * Description: First Class
		 */
//		int a = 3; // 정수형 변수 a에 3값을 저장
//		int b = a;
//		int c;
		// ============================
		
		// 1. 설명하기 위한 주석
		// 2. 오류 찾기 위한 주석
		// 3. 시진핑 주석
		
//		System.out.println(a);
		
		// ============================
		
		// String java_str = "java수업" => 20bytes // 글자당 2bytes
		
		// ============================
		
		// final float PI = 3.14f;
		// Math.pow(2, 4); => 2의 4승
		// Math.pow(2, 0.5); => 루트 2
		
		// ============================
		
		// 숫자 + 문자열 = 문자열
		// 1 + "ㅁㄴㅇㄹ" = "1ㅁㄴㅇㄹ"
		
		// ============================ 
		// Type casting (conversion)
		double b = 4; // 암시적 캐스팅 implicit casting
		double c = (double) 4; // 명시적 캐스팅 explicit casting
		
		// long -> float 정보손실
		// double -> float //
		// int(4byte) -> char(2byte) 명시적 캐스팅하면 들어감 (char)x;
		
		char ch1 = '0';
		int i = 2;
		ch1 = (char) i; // ㄹㅇ
		
		float f = 4/(float)i;
		System.out.println(f);
		// '/', '%' 값은 정수
		
		// ================================
		// 증감연산자 += -= *= /=
		// 증감식
		// ++ -- +=1 -=1
		// a++: 후연산자
		// ++a: 전연산자
		
	}

}
