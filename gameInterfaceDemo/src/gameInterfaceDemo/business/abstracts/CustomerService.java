package gameInterfaceDemo.business.abstracts;

import java.util.List;

import gameInterfaceDemo.entities.concretes.Customer;

public interface CustomerService {
	void add(Customer customer);
	void delete(Customer customer);
	void update(Customer customer);
	List<Customer> getAll();

}
