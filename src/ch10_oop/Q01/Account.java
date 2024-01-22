package ch10_oop.Q01;

public class Account {
	public static final int MIN_BALANCE = 0, MAX_BALANCE = 1000000;
	int balance = (int) (Math.random() * (MAX_BALANCE - MIN_BALANCE));

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance += balance;
		if (this.balance < 0 || this.balance > 1000000) {
			this.balance -= balance;
		}
	}
}
