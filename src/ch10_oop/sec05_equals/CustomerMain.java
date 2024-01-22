package ch10_oop.sec05_equals;

public class CustomerMain {

	public static void main(String[] args) {
//		Customer customer = new Customer();
		Customer c1 = new Customer(1001, "james", 27, true);
		Customer c2 = new Customer(1001, "james brown", 27, true);
		Customer c3 = new Customer(1001, "maria", 23, true);
		
		if (c1.equals(c3)) { 
			System.out.println(c1 + "과" + c3 + "는 같습니다.");
		} else {
			System.out.println("다릅니다");
		}
		
		System.out.println("c1 hashcode: " + c1.hashCode());
		System.out.println("c2 hashcode: " + c2.hashCode());
		System.out.println("c3 hashcode: " + c3.hashCode());
	}

}
