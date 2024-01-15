package ch02_type;

import java.io.IOException;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) throws IOException {
		// 하나의 문자를 읽을 때 사용하나, 사용빈도가 낮음
//		int keyCode = System.in.read();					// '5'
//		System.out.println("keyCode : " + keyCode);		// 0x35 == 3 * 16 + 5 = 53
		
		Scanner scan = new Scanner(System.in);
		System.out.print("입력하세요> ");
		String inputText = scan.nextLine();				// Enter 입력 전까지의 문자열 읽기
		System.out.println(inputText + 33);
	}

}
