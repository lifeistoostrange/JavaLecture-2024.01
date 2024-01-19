package ch09_modifier.sec03_static;

public class SampleMain {

	public static void main(String[] args) {
		sample sample = new sample();
		System.out.println(sample.instanceField);
		sample.instanceMethod();
		
		System.out.println(sample.STATIC_FIELD);
		sample.staticMethod();
		
	}

}
