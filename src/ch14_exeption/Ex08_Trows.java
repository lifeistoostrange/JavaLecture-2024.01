package ch14_exeption;

public class Ex08_Trows {

	public static void main(String[] args) throws Exception {
//		try {
//			findClass();
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//			System.out.println("class not found");
//		}
		findClass();
	}

	static void findClass() throws ClassNotFoundException {
		Class clazz = Class.forName("java.lang.String2");
	}
	
	
}
