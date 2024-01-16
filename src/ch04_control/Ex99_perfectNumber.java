package ch04_control;

public class Ex99_perfectNumber {

	public static void main(String[] args) {
		for (int i = 2; i <= 10000; i++) {
//			int sum = 0;
//			for (int j = 1; j < i; j++) {
//				if (i % j == 0) {
//					sum += j;
//				}
//			}
			int sum = divisorsSum(i);
			if (sum == i) {
				System.out.println(sum);
			}
		}
	}

	static int divisorsSum(int num) {
		int divSum = 0;
		for (int i = 1; i < num; i++)
			divSum += i;
		return divSum;
	}

}
