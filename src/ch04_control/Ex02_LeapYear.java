package ch04_control;

import java.util.Scanner;

public class Ex02_LeapYear {

	public static void main(String[] args) {
		System.out.print("연도 입력> ");
		Scanner scan = new Scanner(System.in);
		String inputStr = scan.nextLine();
		int year = Integer.parseInt(inputStr);
		scan.close();
		String yearStr = (year % 4 == 0) ? ((year % 100 == 0) ? ((year % 400 == 0) ? "윤년" : "평년") : "윤년") : "평년";
		System.out.printf("%d는 %s입니다.", year, yearStr);
	}

}