package ch14_exeption;

import ch12_interface.sec01_abstract_class.Animal;
import ch12_interface.sec01_abstract_class.Cat;
import ch12_interface.sec01_abstract_class.Dog;

public class Ex02_Unchecked {

	public static void main(String[] args) {
		try {
			System.out.println(3 / 0);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}

		int[] intArray = new int[3];
		try {
			System.out.println(intArray[3]);

		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}

		String str = null;
		try {
			System.out.println(str.length());

		} catch (Exception e) {
			e.printStackTrace();
		}

		str = "100won";
		try {
			int value = Integer.parseInt(str);

		} catch (NumberFormatException e) {
			e.printStackTrace();
		}

		Animal a1 = new Cat();
		Animal a2 = new Dog();

		System.out.println("end of program");
	}

}
