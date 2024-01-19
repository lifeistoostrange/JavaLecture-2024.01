package ch09_modifier.sec02_access.xyz;

import ch09_modifier.sec02_access.abc.A;

public class D extends A {
	void xyz() {
		System.out.println(a + b);		//다른 패키지 A 클래그의 a, b 사용가능, c, d 사용불가능
		
	}
}
