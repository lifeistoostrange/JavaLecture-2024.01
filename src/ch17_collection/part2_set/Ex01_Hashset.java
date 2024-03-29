package ch17_collection.part2_set;

import java.util.HashSet;
import java.util.Set;

public class Ex01_Hashset {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("Java"); set.add("collection"); set.add("set");
		
		// add
		set.add("set");
		System.out.println(set);
		
		// remove
		set.remove("set");
		System.out.println(set);
		set.clear();
		System.out.println(set);
		System.out.println(set.isEmpty());
		
		// 정보 추출
		set.add("Java"); set.add("collection"); set.add("set");
		System.out.println(set.size() + ", " + set.contains("Java"));
		
		// 모든 객체 꺼내기
		for (String element : set) {
			System.out.println(element);
		}
		
		Set<Integer> intSet = new HashSet<>();
		intSet.add(1); intSet.add(3); intSet.add(6); intSet.add(9); intSet.add(12);
		System.out.println(intSet);
	}

}
