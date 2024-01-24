package ch17_collection.part1_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex01_LivsVersusArray {

	public static void main(String[] args) {
		String[] array = "가나다라마바사".split("");
		System.out.println(Arrays.toString(array));
		
		List<String> list = new ArrayList<>();		// 구현 객체(ArrayList)의 뒤 생략가능
		list.add("가"); list.add("나"); list.add("다"); list.add("라"); list.add("마");
		list.add("바"); list.add("사");
		for (String element : list) {
			System.out.print(element + " ");
		}
		System.out.println();
		list.forEach(x -> System.out.print(x + " "));
		System.out.println();
		
		// delete
		array[2] = null; array[5] = null;					// 입력된 인덱스 자체 삭제불가능
		System.out.println(Arrays.toString(array));			// 가능
		
		list.remove("다"); list.remove("바");
		list.forEach(x -> System.out.print(x + " "));
		System.out.println();
		
		// mesure size after delete
		System.out.println(array.length + ", " + list.size());
		
		
		// add(insert)
		list.add("아"); list.add("자"); list.add("차");
		list.forEach(x -> System.out.print(x + " "));
		System.out.println();
		
		System.out.println(array.length + ", " + list.size());
	}

}
