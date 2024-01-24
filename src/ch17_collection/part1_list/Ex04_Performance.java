package ch17_collection.part1_list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex04_Performance {

	public static void main(String[] args) {
		List<String> al = new ArrayList<String>();
		List<String> ll = new LinkedList<String>();

		// ArrayList 맨 앞에 100000회 삽입
		long startTime = System.nanoTime();
		for (int i = 1; i <= 100000; i++) {
			al.add(0, String.valueOf(i));
		}
		long endTime = System.nanoTime();
		System.out.println("ArrayList 소요시간" + (endTime - startTime) + "ns");

		// LinkedList 맨 앞에 100000회 삽입
		startTime = System.nanoTime();
		for (int i = 1; i <= 100000; i++) {
			ll.add(String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList 소요시간" + (endTime - startTime) + "ns");

		// ArrayList 맨 뒤에 100000회 삽입
		startTime = System.nanoTime();
		for (int i = 1; i <= 100000; i++) {
			al.add(String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList 소요시간" + (endTime - startTime) + "ns");

		// ArrayList 맨 뒤에 100000회 삽입
		startTime = System.nanoTime();
		for (int i = 1; i <= 100000; i++) {
			ll.add(String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList 소요시간" + (endTime - startTime) + "ns");
	}

}
