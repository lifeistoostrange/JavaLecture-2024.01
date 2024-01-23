package ch14_exeption.sec09_class;

public class Main {

	public static void main(String[] args) throws MyExeption {
		MyExeption me1 = new MyExeption();
		MyExeption me2 = new MyExeption("내가만든 예외클래스");

//		throw me1;
//		throw me2;
//		throw new MyExeption("예외 발생");

//		throw new MyRuntimeExeption("의도적 런타임 예외 발생");
		try {
			for (int i = 0; i <= 100000; i++) {
				for (int j = 0; j <= 100000; j++) {
					if (i == 100 && j == 100) {
						throw new MyExeption();
					}
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("다중 반복문 탈출");
		}
	}

}
