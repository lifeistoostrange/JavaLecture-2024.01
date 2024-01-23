package ch14_exeption;


public class Ex03_UncheckedSolution {

	public static void main(String[] args) {
		int a = 3, b = 0;
		if (b == 0)
			System.out.println("can't divide number by 0");
		else
			System.out.println(a / b);

		int[] intArray = new int[3];
		int index = 3;
		if (index >= intArray.length)
			System.out.println("out of index boundary");
		else
			System.out.println(intArray[index]);
		
		String str = null;
		if (str != null)
			System.out.println(str.length());

		str = "100won";
		int value = Integer.parseInt(str.replace("won", ""));
		System.out.println(value);
		
//		Animal a1 = new Cat();
//		Animal a2 = new Dog();
//		Cat2 cat = null;
//		if (a1 instanceof Cat2)
//			cat2 = (Cat) a1;
		
		System.out.println("end of program");
	}

}
