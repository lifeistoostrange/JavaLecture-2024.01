package ch04_control;

public class Ex04_swith {

	public static void main(String[] args) {
		String s = "Hello";
		System.out.println(s.equals("hello"));

		switch (s) {				// C에서는 switch 조건문에 문자열 사용 불가, Java는 가능
		case "Hello":{
			System.out.println(true);
			break;
		}
		case "hello": {
			System.out.println("대소문자 구분");
			break;
		}
		default: {
			System.out.println(false);
		}
			
		}
	}

}
