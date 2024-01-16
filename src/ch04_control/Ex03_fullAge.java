package ch04_control;

import java.time.LocalDate;
import java.util.Scanner;

public class Ex03_fullAge {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println(today);
		int year = today.getYear();
		int month = today.getMonthValue();
		int date = today.getDayOfMonth();
//		System.out.printf("%d %d %d", year, month, day);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("생년> ");
		int birthYear = Integer.parseInt(scan.nextLine());
		System.out.println("생월> ");
		int birthMonth = Integer.parseInt(scan.nextLine());
		System.out.println("생일> ");
		int birthDate = Integer.parseInt(scan.nextLine());
		
		int koreanAge = year - birthYear + 1;
		System.out.printf("이전 한국식 나이는 %d세 이며\n", koreanAge);
		
		int realAge = year - birthYear;
		if (birthMonth > month || (birthMonth == month && birthDate > date)) {
			realAge--;
		}
		
		System.out.printf("현재 %s 기준으로 만 %d세 입니다.", today, realAge);
	}

}
