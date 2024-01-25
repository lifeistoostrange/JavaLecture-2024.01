package ch17_collection.part3_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Ex01_HashMap {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();

		map.put("사과", 1500);
		map.put("배", 2500);
		map.put("감", 1000);
		map.put("배", 3000); // put : map 안에 key값이 존재한다면 value 수정, 없다면 생성
		System.out.println(map);

		// 추출
		System.out.println(map.get("배")); // key값을 읽은 다음 해당 key의 value 추출

		// 정보 추출
		System.out.println(map.containsKey("사과") + ", " + map.containsValue(4000));

		// key의 Set collection - 권장방법
		Set<String> keySet = map.keySet();
		for (String key : keySet) {
			System.out.println(key + ", " + map.get(key));
		}

		// Entry의 Set collection
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}

		System.out.println("stream 처리");
		map.forEach((k, v) -> System.out.println(k + v));
		
		// 삭제
		map.remove("감");
		System.out.println(map.size());
		map.forEach((k, v) -> System.out.println(k + v));
	}

}
