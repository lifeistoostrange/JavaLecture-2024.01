package ch14_exeption.sec09_class;

public class MyRuntimeExeption extends RuntimeException {

	public MyRuntimeExeption() {
		
	}

	public MyRuntimeExeption(String message) {
		super(message);
	}

}
