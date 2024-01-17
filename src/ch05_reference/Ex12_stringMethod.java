package ch05_reference;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Scanner;

public class Ex12_stringMethod {

	public static void main(String[] args) {
		String str1 = "Hello Java";
		String str2 = "안녕하세요? 반갑습니다.";
		System.out.println();

		/* String의 길이 - 속성이 아닌 메소드형태*/
		System.out.println(str1.length() + ", " + str2.length());

		/* 해당 위치의 문자열 검색*/
		System.out.println(str2.charAt(0) + ", " + str2.charAt(7));
		/* 주민등록번호 입력받은 뒤 성별 구별*/
		String idNumber = "010624-4123456";
		char gender = idNumber.charAt(7);
		switch (gender) {
		case 1:
		case 3:
			System.out.println("남성");
			break;
		case 2:
		case 4:
			System.out.println("여성");
			break;
		}

		/* 문자열의 위치 검색*/
		System.out.println(str1.indexOf("Java") + ", " + str2.indexOf('반'));
		if (str1.toLowerCase().indexOf("java") >= 0) {
			System.out.println("문장 안에 java가 있습니다");
		}

		System.out.println("apple pineapple".lastIndexOf("pp"));

		/* 문자열 변환 (to String)*/
		boolean a = true;
		int b = 123;
		double c = 3.14;
		char d = 'a';
		// 명시적 변환
		System.out.println(String.valueOf(a) + ", " + String.valueOf(b) + ", " +
							String.valueOf(c) + ", " + String.valueOf(d));
		// 암묵적 변환
		System.out.println(a + ", " + b + ", " + c + ", " + d);
		
		/*문자열 배열 변환, 문자열 --> byte[], char[]*/
		byte[] byteStr1 = str1.getBytes();
		byte[] byteStr2 = str2.getBytes(Charset.defaultCharset());
		System.out.println(Arrays.toString(byteStr1));
		System.out.println(Arrays.toString(byteStr2));			// UTF-8은 초성 중성 종성 각 1바이트씩 할당
		System.out.println(Arrays.toString(str2.toCharArray()));
		
		/*문자열 내용 비교*/
		System.out.println(str1.equals("Hello World"));
		System.out.println(str1.equalsIgnoreCase("hello java"));
		
		
	}

}
