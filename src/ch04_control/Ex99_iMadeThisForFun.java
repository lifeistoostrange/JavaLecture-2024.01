package ch04_control;

import java.util.Scanner;

public class Ex99_iMadeThisForFun {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("몇시에 알람을 맞추시겠습니까?");
		String inputHour = scan.nextLine();
		System.out.print("몇분에 알람을 맞추시겠습니까?");
		String inputMinute = scan.nextLine();
		System.out.print("몇분이나 덜 자고싶나요?");
		String inputHowMuchEarly = scan.nextLine();
		scan.close();
		
		int currentHour = Integer.parseInt(inputHour);
		int currentMinute = Integer.parseInt(inputMinute);
		int howMuchEarly = Integer.parseInt(inputHowMuchEarly);
		
		currentHour = currentHour - (howMuchEarly / 60);
		currentMinute = currentMinute - (howMuchEarly % 60);
		
		if (currentMinute < 0) {
			currentMinute = 60 + currentMinute;
			currentHour--;
		}
		if (currentHour < 0)
			currentHour = 24 + currentHour;
		
		System.out.printf("당신은 %d분 덜 자기로 선택했고 어차피 못들을 알람이지만 %d시 %d분에 알람을 설정해놨습니다.\n", howMuchEarly, currentHour, currentMinute);
	}

}
