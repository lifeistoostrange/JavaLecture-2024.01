package homework01.Ex03_map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);

		String name = null;
		int maxScore = 0;
		int totalScore = 0;

		Collection<Map.Entry<String, Integer>> entries = map.entrySet();
		for (Map.Entry<String, Integer> entry : entries) {
            int addScore = entry.getValue();
            totalScore += addScore;

            // 최고 점수 비교
            if (addScore > maxScore) {
                maxScore = addScore;
                name = entry.getKey();
            }
        }
		int meanScore = totalScore / map.size();
		System.out.println("평균점수: " + meanScore);
		System.out.println("최고점수: " + maxScore);
		System.out.println("최고점수를 받은 아이디: " + name);
	}

}
