package ch12_interface.sec12_bankrefactor;

public interface AccountService {
	
	void createAccount();
	
	void accountList();
	
	void deposit();
	
	void withdraw();
	
	void delete();
	
	Account findAccount(String ano);
}
