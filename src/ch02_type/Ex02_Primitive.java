package ch02_type;

public class Ex02_Primitive {

	public static void main(String[] args) {
		// boolean
		boolean a = true, b = false;
		System.out.println("a: " + a + ", b: " + b);

		/*
		 * 정수 계열 
		 * 		1. byte: 	1바이트 -128 ~ 127 
		 * 		2. short: 	2바이트 -32768 ~ 32767 
		 * 		3. int: 	4바이트 -2147483648 ~ 2147483647 
		 * 		4. long: 	8바이트 -9223372036854775808 ~ 9223372036854775807
		 * 
		 * 주의사항 
		 * 		-숫자값(literal)(ex -123, 57)은 기본적으로 int타입 
		 * 		-long 타입의 숫자값 뒤에는 L 작성 (ex 15L)
		 */
		byte w = 10;
		short x = 1024;
		int y = 1000000;
		long z = 300000000L;
		System.out.printf("%d, %d, %d, %d\n", w, x, y, z); // format d: 정수, f: 실수, s: 문자열

		/*
		 * 실수 계열 
		 * 		1. float: 4바이트 유효자리 - 소수점 아래 7자리 
		 * 		2. double: 8바이트 유효자리 - 소수점 아래 15자리
		 * 
		 * 주의사항 
		 * 		- 숫자값(ex pi, e)은 기본적으로 double 
		 * 		- float 타입의 숫가잢 뒤에는 F 작성 (ex 3.14F)
		 */
		float f1 = 1.0000001F, f2 = 1.00000001F;
		double d1 = 1.000000000000001, d2 = 1.0000000000000001;
		System.out.println("f1: " + f1 + ", f2: " + f2);
		System.out.println("d1: " + d1 + ", d2: " + d2);
		
		// 문자: 1글자
		char eng = 'A', kor = '안';
		System.out.println("eng: " + eng + ", kor: " + kor);
	}

}
