package ch17_collection.part2_set.sec12_member;

public class Member implements Comparable {
	private int age;
	private String name;

	// TreeSet, TreeMap에서 사용되는 객체는 Comparable 인터페이스를 구현해야 작동
	@Override
	public int compareTo(Object obj) {
		if (obj instanceof Member) {
			Member m = (Member) obj;
			// 이름으로 비교
//			return this.name.compareTo(m.getName());

			// 이름으로 비교 후 같으면 나이 역순
			if (this.name.compareTo(m.getName()) == 0) {
				return m.getAge() - this.age;
			} else {
				return this.name.compareTo(m.getName());
			}
		}
		return 0;
	}

	public Member(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Member [age=" + age + ", name=" + name + "]";
	}

	public Member() {
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;

	};
}
