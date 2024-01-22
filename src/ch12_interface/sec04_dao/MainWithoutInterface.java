package ch12_interface.sec04_dao;

import java.util.List;

public class MainWithoutInterface {

	public static void main(String[] args) {
		// MySQL DB를 사용하려면
		CustomerDaoMySQLImpl customerDao = new CustomerDaoMySQLImpl();
		Customer customer = customerDao.getCustomer(34);
		List<Customer> list = customerDao.getCustomerList();
		customerDao.insertCustomer(customer);
		customerDao.updateCustomer(customer);
		customerDao.deleteCustomer(34);
	}

}
