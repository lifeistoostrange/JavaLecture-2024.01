package ch04_control;

import java.util.Scanner;

public class Ex11_For {

	public static void main(String[] args) {
		// 1에서 100까지의 합
		int sum = 0;

		for (int i = 0; i <= 100; i++) {
			sum += i;
		}

		System.out.println(sum);

		// 1에서 100까지 홀수의 합
		int oddSum = 0;
		for (int i = 1; i < 100; i += 2) {
			oddSum += i;
		}
		System.out.println(oddSum);

		// 자기자신을 제외한 약수의 합, 24
		int divSum = 0, num = 28;
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				divSum += i;
			}
		}
		System.out.printf("%d 의 약수의 합은 %d 입니다.\n", num, divSum);

		// 초기식, 증감식에 여러개의 변수를 사용하는 방법
		for (int i = 1, k = 2; i * k < 10; i++, k++) {
			System.out.printf("i = %d, k = %d\n", i, k);
		}

		// 사용자가 5번 입력한 문자열을 받은 뒤, 공백을 사이에 넣고 하나의 문자열로 만들어서 출력
		Scanner scan = new Scanner(System.in);
		String text = "";

		for (int i = 0; i < 5; i++) {
			System.out.printf("입력하세요 >");
			String line = scan.nextLine();
			text += line + " ";
		}
		scan.close();

		System.out.printf("입력하신 정보는 %s입니다\n", text);

		// 강화 반복문
		String[] fruits = { "apple", "bannana", "cherry" };
		for (String fruit : fruits) {
			System.out.println(fruit);
		}
	}

}
