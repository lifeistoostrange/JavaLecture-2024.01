package ch12_interface.sec04_dao;

import java.util.List;

// DAO : Data Acces Object - DB를 액세스하기 위한 코드
// DTO : Data Transfer Object = DB를 액세스 할 때 사용되는 데이터 구조
public interface CustomerDao {
	
	Customer getCustomer(int cid);		// cid값을 주면 customer 객체값을 가져오는 명령어
	
	List<Customer> getCustomerList();
	
	void insertCustomer(Customer customer);
	
	void updateCustomer(Customer customer);
	
	void deleteCustomer(int cid);
}
