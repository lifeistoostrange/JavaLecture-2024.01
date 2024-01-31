package test1.Q2;

import java.util.ArrayList;

public class Member {
	private int mid;
	private String name;
	private int birthYear;
	private String tel;

	public Member() {
	}

	public Member(int mid, String name, int birthYear, String tel) {
		super();
		this.mid = mid;
		this.name = name;
		this.birthYear = birthYear;
		this.tel = tel;
	}

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public void printMember() {
		int age = java.time.Year.now().getValue() - birthYear;
		System.out.println("ID: " + mid + ", 이름: " + name + ", 나이: " + age + ", 전화번호: " + tel);
	}

	public static ArrayList<Member> getMemberList() {
		ArrayList<Member> list = new ArrayList<>();

		// Member 객체 생성 후 리스트에 추가
		Member james = new Member(1, "James", 1985, "010-9289-0372");
		Member maria = new Member(2, "Maria", 1990, "010-9496-0372");

		list.add(james);
		list.add(maria);

		return list;
	}

}
