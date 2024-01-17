package ch05_reference;

import java.time.LocalDateTime;
import java.util.Arrays;

public class Ex13_stringMethod2 {

	public static void main(String[] args) {
		String str1 = "Hello Java";
		String str2 = "안녕하세요? 반갑습니다.";

		/*대소문자 전환(.toUpperCase, .toLowerCase*/
		System.out.println(str1.toUpperCase());

		/*문자열 대체(.replace)*/
		String str3 = str2.replace("안녕하세요", "안녕").replace("반갑습니다", "방가방가");
		System.out.println(str3);
		System.out.println(str3.replace("방가", "하이")); // 중복되는 모든 문자열 대체 가능
		String regExp = str2.replaceAll("[?.]", "*"); // 대체하고싶은것을 정규식으로도 표현 가능
		System.out.println(regExp);

		/*문자열 일부 발췌(.substring)*/
		String dateTime = "2024-01-17 14:20:05";
		String date = dateTime.substring(0, 11);
		String time = dateTime.substring(11);
		System.out.println(dateTime.substring(0, 10) + ", " + time);
		String now = LocalDateTime.now().toString();
		System.out.println(now);
		date = now.substring(0, 10);
		time = now.substring(11, 11 + 8);
		System.out.println(date + ", " + time);

		// 주민등록번호부터 생년월일 (yyyy-mm-dd) 표시하기
		String ssn1 = "880927-1234567", ssn2 = "010117-4123456";
		System.out.println("19" + ssn1.substring(0, 2) + "-" + ssn1.substring(2, 4) + "-" + ssn1.substring(4, 6));
		System.out.println("20" + ssn2.substring(0, 2) + "-" + ssn2.substring(2, 4) + "-" + ssn2.substring(4, 6));

		String ymd1 = "";
		if (ssn1.charAt(7) == '1' || ssn1.charAt(7) == '2') {
			ymd1 = "19";
		} else {
			ymd1 = "20";
		}
		ymd1 += ssn1.substring(0, 2) + "-" + ssn1.substring(2, 4) + "-" + ssn1.substring(4, 6);
		System.out.println(ymd1);
		String ymd2 = (ssn2.charAt(7) == 1 || ssn2.charAt(7) == 2) ? "19" : "20";
		ymd2 += ssn2.substring(0, 2) + "-" + ssn2.substring(2, 4) + "-" + ssn2.substring(4, 6);
		System.out.println(ymd2);

		/*문자열을 분할해서 배열로 반환 (.split)*/
		String fruitStr = "감, 배, 귤, 밤";
		String[] fruits = fruitStr.split(", ");
		System.out.println(Arrays.toString(fruits));
		
		fruitStr = "감, 배; 귤: 밤";
		fruits = fruitStr.split("[,;:] ");
		System.out.println(Arrays.toString(fruits));
		
		String pathStr = "C:\\Program Files\\Common Files\\Oracle\\Java\\javapath;C:\\Windows\\system32;C:\\Windows;C:\\Windows\\System32\\Wbem;C:\\Windows\\System32\\WindowsPowerShell\\v1.0\\;C:\\Windows\\System32\\OpenSSH\\;C:\\Program Files\\Git\\cmd;C:\\msys64\\mingw64\\bin;C:\\Program Files\\nodejs\\;C:\\Users\\human-10\\AppData\\Local\\Microsoft\\WindowsApps;;C:\\Users\\human-10\\AppData\\Local\\Programs\\Microsoft VS Code\\bin;C:\\Users\\human-10\\AppData\\Roaming\\npm";
		String[] pathArray = pathStr.split(";");
		for (String path: pathArray) {
			System.out.println(path.replace("\\", "/"));
		}
		
		/*문자열 배열을 하나의 문자로 생성*/
		System.out.println(String.join(" -:- ", "감, 배; 귤: 밤".split("[,;:] ")));
		
		/*문자열 좌우의 공백 제거*/
		String dirtyText = "\t 자바 프로그래밍	\t \r\n";
		String cleanText = dirtyText.trim();
		System.out.println(cleanText + ", " + cleanText.length());
	}

}
