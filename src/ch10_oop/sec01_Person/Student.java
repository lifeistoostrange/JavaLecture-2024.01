package ch10_oop.sec01_Person;

public class Student extends Person {
	int studentId;
	
	public void study() {
		System.out.println(name + "이/가 공부를 합니다.");
	}
}
