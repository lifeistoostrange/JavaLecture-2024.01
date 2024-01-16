package ch04_control;

import java.util.Scanner;

public class Ex13_diamond {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("출력할 별의 행(홀수)의 수 입력 >");
		String inputStr = scan.nextLine();
		int num = Integer.parseInt(inputStr) / 2;

		for (int i = 0; i <= num; i++) {
			for (int j = 1; j <= num - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 2 * i + 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = num - 1; i >= 0; i--) {
			for (int j = 1; j <= num - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 2 * i + 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		scan.close();
	}
}
