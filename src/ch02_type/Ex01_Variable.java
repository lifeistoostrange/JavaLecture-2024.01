package ch02_type;

public class Ex01_Variable {
	private static int num = 2;
	
	public static void main(String[] args) {
		int age;
		age = 21;
		int score = 88;		// 변수 선언과 동시에 초기화 진행 권장
		var value = age * score;	// Java 8에서는 사용할 수 없는 자료형
		System.out.println("age: " + age + ", score: " + score + ", value: " + value);
		
		
		/*
		 * 변수이름 규칙
		 * 		1. 영문 대소문자 및 한글 사용 가능
		 * 		2. 특수문자는 '_', '$'만 가능
		 * 		3. 숫자 사용 가능, 단 변수의 맨 앞에 작성 불가능
		 * 		4. 자바에서 사용중인 키워드 사용 불가
		 * 
		 * 권고사항
		 * 		1. 변수이름은 소문자로 시작
		 * 		2. 두개 이상의 단어조합일때 새 단어는 대문자로 시작
		 * 
		 * 상수 규칙
		 * 		1. 상수는 모든 글자를 대문자로 작성
		 * 		2. 두개 이상의 단어가 결합되었을때는 언더바 사용
		 */
		
		/*
		 * 변수의 생애주기(life cycle)
		 * 		1. 변수가 선언된 블록({}) 안에서만 유효
		 */
		if (age >= 19) {
			System.out.println("음주 허용");
			int num = 5;
			System.out.println(num);		// 블록 안에 있는 num의 값에서만 5로 할당
		}
		System.out.println(num);			// 클래스 선언 밑에 있는 2의 값
	}

}
