package ch10_oop.sec03_override;

public class Main {

	public static void main(String[] args) {
		Parent parent = new Parent();
		parent.parentField = 1000;
		parent.parentMethod();

		Child child = new Child();
		child.parentField = 300;
		child.parentField = 600;
		child.childMethod();
		child.parentMethod();
		
		Parent p = new Child();				// 폴리모피즘
		Child c = (Child) new Parent();		// 강제형변환
	}

}
 