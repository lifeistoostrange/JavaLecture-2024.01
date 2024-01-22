package ch10_oop.Q02;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("----------------------------------------------");
			System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5.종료");
			System.out.println("----------------------------------------------");
			System.out.print("선택 >");

			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
			} else {
				System.out.println("번호를 올바르게 입력해주세요");
			}
		}
		System.out.println("프로그램 종료");
	}

	// createAccount
	private static void createAccount() {
		System.out.println("------");
		System.out.println("계좌생성");
		System.out.println("------");

		System.out.print("계좌번호: ");
		String ano = scanner.next();
		System.out.print("예금주: ");
		String owner = scanner.next();
		System.out.print("초기입금액: ");
		int balance = scanner.nextInt();

		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = new Account(ano, owner, balance);
				System.out.println("계좌가 생성되었습니다");
				break;
			}
		}

	}

	private static void accountList() {
		System.out.println("------");
		System.out.println("계좌목록");
		System.out.println("------");

		for (Account account : accountArray) {
			if (account != null)
				System.out.println(account.getAno() + "   " + account.getOwner() + "   " + account.getBalance());
		}
	}

	private static void deposit() {
		System.out.println("------");
		System.out.println("예금하기");
		System.out.println("------");

		System.out.print("계좌번호: ");
		String ano = scanner.next();
		System.out.print("예금액: ");
		int amount = scanner.nextInt();

		Account account = findAccount(ano);

		if (account != null) {
			account.setBalance(amount + account.getBalance());
			System.out.println("결과: 예금이 성공되었습니다.");
		} else {
			System.out.println("계좌를 찾을 수 없습니다.");
		}

	}

	private static void withdraw() {
		System.out.println("------");
		System.out.println("출금하기");
		System.out.println("------");

		System.out.print("계좌번호: ");
		String ano = scanner.next();
		System.out.print("예금액: ");
		int amount = scanner.nextInt();

		Account account = findAccount(ano);

		if (account != null) {
			int currentBalance = account.getBalance();
			if (currentBalance >= amount) {
				account.setBalance(account.getBalance() - amount);
				System.out.println("결과: 출금이 성공되었습니다.");
			} else {
				System.out.println("잔액이 부족합니다");
				System.out.println("잔액: " + account.getBalance());
			}
		} else {
			System.out.println("계좌를 찾을 수 없습니다.");
		}
	}

	// Account 배열에서 ano와 종일한 Account 객체 찾기
	private static Account findAccount(String ano) {
		for (Account account : accountArray) {
			if (account != null && account.getAno().equals(ano)) {
				return account;
			}
		}
		return null; 
	}

}
