package week5;

public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 실습1.pdf
		
		// 1. 변수 x값이 4일 때, 이차방정식 x^2 + 2x + 5의 값을 출력하시오.
		System.out.println("1. 변수 x값이 4일 때, 이차방정식 x^2 + 2x + 5의 값을 출력하시오.");
		
		int x = 4;
		System.out.println(Math.pow(x, 2) + (2 * x) + 5);
		
		System.out.println();
		
		// 2. '안녕!'을 5번 출력하시오.
		System.out.println("2. '안녕!'을 5번 출력하시오.");
		
		System.out.println("안녕!");
		System.out.println("안녕!");
		System.out.println("안녕!");
		System.out.println("안녕!");
		System.out.println("안녕!");
		
		System.out.println();
		
		// 3. 변수 language에 'JAVA'을 저장하고,
		// 이름이 version인 변수에는 문자열 "3.96"을 저장한 후,
		// 이들 변수를 이용하여 'JAVA 3.96'을 출력하세요.
		System.out.println("3. 변수 language에 'JAVA'을 저장하고,");
		System.out.println("이름이 version인 변수에는 문자열 \"3.96\"을 저장한 후,");
		System.out.println("이들 변수를 이용하여 'JAVA 3.96'을 출력하세요.");
		
		String language = "JAVA";
		String version = "3.96";
		System.out.println(language + " " + version);
		
		System.out.println();
		
		// 4. 섭씨온도 32°C 를 변환공식을 이용하여 화씨온도 °F로 변환하여 출력하세요.
		// 변환공식 : F = (9/5)*C + 32
		System.out.println("4. 섭씨온도 32°C 를 변환공식을 이용하여 화씨온도 °F로 변환하여 출력하세요.");
		
		float C = 32.0f;
		float F = 0.0f;
		F = (9.0f/5) * C + 32;
		System.out.println("°F = " + F);
		
		System.out.println();
		
		// 5. 반지름 r이 5이고 π가 3.14일 때 원면적과 원둘레를 출력하세요.
		// πr^2, 2πr
		System.out.println("5. 반지름 r이 5이고 π가 3.14일 때 원면적과 원둘레를 출력하세요.");
		
		final float PI = 3.14f;
		int r = 5;
		float circleArea = PI * r * r;
		float circleLine = 2 * PI * r;
		
		System.out.println("원면적: " + circleArea);
		System.out.println("원둘레: " + circleLine); // 31.400002 ,,?
		
		System.out.println();
		
		// 6. 10,000초가 몇 시, 몇 분, 몇 초 인지를 변환하여 출력하세요.
		System.out.println("6. 10,000초가 몇 시, 몇 분, 몇 초 인지를 변환하여 출력하세요.");
		
		int time = 10000;
		int minute = time / 60;
		int second = time % 60;
		int hour = minute / 60;
		minute %= 60;
		
		System.out.println(hour + "시간 " + minute + "분 " + second + "초");
		
		System.out.println();
		
		// 7. 변수 a에 1을 저장한 다음 1씩 증가시키면서 다음과 같이 3단을 출력하시오.
		System.out.println("7. 변수 a에 1을 저장한 다음 1씩 증가시키면서 다음과 같이 3단을 출력하시오.");
		
		int a = 1;
		System.out.println("3 x " + a + " = " + 3 * a++);
		System.out.println("3 x " + a + " = " + 3 * a++);
		System.out.println("3 x " + a + " = " + 3 * a++);
		System.out.println("3 x " + a + " = " + 3 * a++);
		System.out.println("3 x " + a + " = " + 3 * a++);
		System.out.println("3 x " + a + " = " + 3 * a++);
		System.out.println("3 x " + a + " = " + 3 * a++);
		System.out.println("3 x " + a + " = " + 3 * a++);
		System.out.println("3 x " + a + " = " + 3 * a);
		
		
	}

}
