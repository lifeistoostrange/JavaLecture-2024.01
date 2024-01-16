package ch02_type;

public class Ex03_TypeConversion {

	public static void main(String[] args) {
		/*
		 * 자동 타입변환(Promotion): 자료형 승급
		 * 		byte -> short -> int -> long -> float -> double -> String
		 */
		short a = 256;
		int b = a;
		long c = b;
		float d = c;
		double e = d;
		System.out.printf("%d, %d, %.1f, %.1f", b, c, d, e);
		/*
		 * 강제 타입변환(Casting): 자료형 다운그레이드 (표시가능한 범위를 벗어날 경우 불가능)
		 */
		long f = 250L;
		int g = (int) f;
		short h = (short) g;
		double i = 3.14;
		double j = (float) i;
		System.out.printf("%d, %d, %.2f, %.2f", g, h, i, j);
		System.out.printf("(int) i: " + (int) i);

		// 연산에서의 자동 타입변환
		long k = a + b + c;		// short + int + long
		double l = d + e;		// float + double
		double m = a / b;		
		System.out.printf("k: " + k + ", l: " + l + ", m: " + m);
		
	}

}
