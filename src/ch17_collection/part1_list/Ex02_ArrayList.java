package ch17_collection.part1_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex02_ArrayList {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();				// 대부분 이렇게 사용
		ArrayList<String> aList = new ArrayList<>();		// 이런식으로 사용 거의 안함
		
		list.add("class"); list.add("interface"); list.add("inheritance");
		System.out.println(list);
		
		List<String> fruitList = Arrays.asList(new String[] {"apple", "bannana", "cherry"});
		System.out.println(fruitList);
//		fruitList.add("mango");								// 정적으로 선언되어 추가, 삭제 불가능
		
		List<Integer> intList = new ArrayList<>();
		intList.add(1); intList.add(3); intList.add(5); intList.add(7); 
		intList.add(9);
		System.out.println(intList);
		
		//indexing
		System.out.println(list.get(1));
		
		list.add("list");	// 가장 뒤에 추가
		list.add(3, "collection");	// 지정한 인덱스에 추가, 해당 인덱스에 값이 있다면 뒤로 미룬 뒤에 추가
		System.out.println(list);
		list.addAll(fruitList);
		System.out.println(list);
		
		list.remove(6);
		list.remove("cherry");
		System.out.println(list);
		list.clear();
		
		System.out.println(list.isEmpty() + ", " + list.size());
		System.out.println(list.contains("set"));
		list.indexOf("list");
	}

}
