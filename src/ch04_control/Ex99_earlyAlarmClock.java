package ch04_control;

import java.util.Scanner;

public class Ex99_earlyAlarmClock {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("몇시에 알람을 맞추시겠습니까?");
		String inputHour = scan.nextLine();
		System.out.print("몇분에 알람을 맞추시겠습니까?");
		String inputMinute = scan.nextLine();
		scan.close();
		
		int currentHour = Integer.parseInt(inputHour);
		int currentMinute = Integer.parseInt(inputMinute);
		
		currentMinute -= 45;
		if (currentMinute < 0) {
			currentHour --;
			currentMinute += 60;
		}
		if (currentHour < 0) {
			currentHour = 23;
		}
		
		
		
		System.out.printf("당신은 어차피 일찍 못일어나니 %d시 %d분에 알람을 맞췄습니다\n", currentHour, currentMinute);
	}

}
