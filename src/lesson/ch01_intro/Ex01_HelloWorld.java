package lesson.ch01_intro;

// class 이름은 대문자로 시작.
public class Ex01_HelloWorld {
	
	/**
	 * document 주석 - API Document 작성에 사용
	 * @param args
	 */
	// method 이름 main은 소문자로 시작
	public static void main(String[] args) {
		// syso, sysout 입력 후 ctrl + space : 문장 자동완성
		System.out.println("Hello World!!!");	// 문장 끝에는 반드시 ;를 붙이기
		/*
		 * 주석
		 */
		System.out.println("안녕하세요!!!" + "여러분!!!");	//printline 안에는 하나의 문자열만 올 수 있고, 다수일 경우는 +연산자 사용
//		System.out.println();			// ctrl + / : 문장을 주석처리(토글)
	}

}
