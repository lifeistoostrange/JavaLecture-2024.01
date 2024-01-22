package ch12_interface.sec01_abstract_class;

public class Main {

	public static void main(String[] args) {
		// 추상 클래스는 객체 생성 불가
//		Animal animal  = new Animal(); 해당 명령어 사용 불거ㅏ능
		
		Cat cat = new Cat();
		cat.cry();
		
		Dog dog = new Dog();
		dog.cry();
		
		Animal animal = new Cat();                                                       
		animal.cry();
	}

}
