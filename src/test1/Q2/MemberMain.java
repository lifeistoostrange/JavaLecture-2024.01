package test1.Q2;

import java.util.ArrayList;

public class MemberMain {

	public static void main(String[] args) {
		ArrayList<Member> memberList = Member.getMemberList();

		// 변경된 정보 출력
		System.out.println("멤버 리스트");
		for (Member member : memberList) {
			member.printMember();
		}
	}

}
