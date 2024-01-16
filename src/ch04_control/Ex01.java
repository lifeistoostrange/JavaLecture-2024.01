package ch04_control;

// 콘솔바로실행하기 ctrl + f11 ctrl + f11 ctrl + f11 ctrl + f11 ctrl + f11 ctrl + f11 ctrl + f11 ctrl + f11 ctrl + f11 
public class Ex01 {

	public static void main(String[] args) {
		int score = 60 + (int) (41 * Math.random());

		if (score >= 80)
			System.out.printf("%d점은 평균 이상입니다.\n", score);
		else
			System.out.printf("%d점은 평균 미만입니다.\n", score);

		char grade;
		if (score >= 90)
			grade = 'A';
		else if (score >= 80)
			grade = 'B';
		else if (score >= 70)
			grade = 'C';
		else
			grade = 'D';
		System.out.println("score : " + score + ", grade : " + grade);

		switch (score / 10) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		default:
			grade = 'D';
			break;
			
		}
		System.out.printf("score: %d, grade: %c \n", score, grade);
	}

}
