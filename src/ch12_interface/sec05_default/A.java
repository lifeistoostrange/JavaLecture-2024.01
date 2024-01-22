package ch12_interface.sec05_default;

public interface A {
	
	
	void abc();
	
	// 고객사 요청에 의해 def() method 추가 필요
	default void def() {
		System.out.println("Interface A에서 공통된 메소드를 추가하였음");
	}
	
	public static void ghi() {
		System.out.println("Interface A에서 실행하는 정적 메소드");
	}
}
