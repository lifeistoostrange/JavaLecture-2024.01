package ch05_reference;

public class Ex11_string {

	public static void main(String[] args) {
		// 생성
		String str1 = new String("문자열");
		String str2 = "문자열";				// 만약 객체의 값을 변경할 경우 새로운 객체를 생성하여 작성

		byte[] bytes = { 72, 101, 108, 108, 111, 32, 74, 97, 118, 97 };
		String str3 = new String(bytes);
		System.out.printf("%s, %s, %s\n", str1, str2, str3);

		String str4 = "문자열"; 				// literal이 동일하기 때문에 str2와 주소값 동일
		System.out.println(str2 == str4);
		
		Person james = new Person("james", 29, "programmer");
		Person maria = new Person("maria", 23, "student");
		System.out.println(james + " - 123");		// Person class의 toString() method 적용
		System.out.println(maria + " - 456");
	}

}
