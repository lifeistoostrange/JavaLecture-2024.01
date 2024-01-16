package ch04_control;

public class Ex12_while {

	public static void main(String[] args) {
		// 주사위 눈의 합이 15이하면 계속 주사위를 굴리기
		int diceSum = 0;
		while (diceSum <= 15) {
			int dice = 1+ (int) (6 * Math.random());
			System.out.print(dice + " ");
			diceSum += dice;
		}
		System.out.printf("\n%d\n",diceSum);
		
		// 무한루프 생성 후 탈출 조건을 루프 안에 작성
		diceSum = 0;
		while (true) {
			int dice = 1+ (int) (6 * Math.random());
			System.out.print(dice + " ");
			diceSum += dice;
			if (diceSum >= 15)
				break;
		}
		System.out.printf("\n%d\n",diceSum);
		
		// do - while, 초기 1회는 무조건적으로 실행
		diceSum = 0;
		
		do {
			int dice = 1 + (int) (6 * Math.random());
			System.out.print(dice + " ");
			diceSum += dice;
		} while (diceSum <= 15);
		System.out.printf("\n%d\n",diceSum);
	}

}
