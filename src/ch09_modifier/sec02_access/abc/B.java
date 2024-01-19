package ch09_modifier.sec02_access.abc;

public class B {
	void abc() {
		A a = new A();
		System.out.println(a.a + a.b + a.c); 	// A 클래스의 a, b, c는 사용 가능하지만 d는 private라서 다른 클래스 사용 불가능
	}
	
}
