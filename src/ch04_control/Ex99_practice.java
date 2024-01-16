package ch04_control;

public class Ex99_practice {

	public static void main(String[] args) {
		int score = 72;

		if (score >= 80 && score < 90) {
			System.out.println("B학점");
		} else if (score > 90) {
			System.out.println("A학점");
		} else if (score >= 70 && score < 80) {
			System.out.println("C학점");
		} else {
			System.out.println("F학점");
		}

		for (int i = 0;; i++) {
			if (i % 2 != 0) {
				continue;
			} else if (i > 10) {
				break;
			}
			System.out.println(i);
		}

		int j = 10;
		while (j > 0) {
			System.out.println(j);
			j -= 2;
		}

		// Q5의 정답은 4회
		
		byte flag = 1;
		for (int k = 0; k < 10; k++) {
			for (int l = 0; l < 5; l++) {
				System.out.printf("i : %d, j : %d\n", k , l);
				if (k == 3 && l == 2) {
					flag = 0;
					break;
				}
			}
			if (flag == 0)
				break;	
 			
		}

	}

}
