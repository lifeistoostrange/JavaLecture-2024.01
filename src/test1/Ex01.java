package test1;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// 1) 1에서 100까지의 배수의 합
		int threeSquaresum = 0;
		for (int i = 3; i < 100; i += 3) {
			threeSquaresum += i * i;
		}
		System.out.println("1에서 100까지 3의 배수의 합 : " + threeSquaresum);

		// 2) 1에서 20까지 홀수 제곱의 합
		int oddSquareSum = 0;
		for (int i = 1; i <= 20; i += 2) {
			oddSquareSum += i * i;
		}
		System.out.println("1에서 20까지의 홀수 제곱의 합 : " + oddSquareSum);

		// 3) 어떤 수가 소수인가를 판단하는 메소드
//		int num = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("소수인지 아닌지 궁금한 숫자를 입력하세요 > ");
		int num = scan.nextInt();
		Boolean isItPrime = isPrime(num);
		if (isItPrime == true) {
			System.out.println(num + "은 소수입니다.");
		} else {
			System.out.println(num + "은 소수가 아닙니다.");
		}

		// 4) 2에서 100까지의 소수의 합

		int primeNumberSum = 0;
		for (int i = 2; i <= 100; i++) {
			Boolean isItPrimeSum = isPrime(i);
			if (isItPrimeSum == true) {
				primeNumberSum += i;
			}
		}
		System.out.println("2에서 100까지 소수의 합 : " + primeNumberSum);
	}

	private static boolean isPrime(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}

		return true;
	}

}
