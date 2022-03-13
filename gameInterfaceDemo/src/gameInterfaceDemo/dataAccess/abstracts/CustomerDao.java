package gameInterfaceDemo.dataAccess.abstracts;

import java.util.ArrayList;
import java.util.List;


import gameInterfaceDemo.entities.concretes.Customer;


public class CustomerDao {
	List<Customer> customers;

	
	public CustomerDao(){
		customers= new ArrayList<Customer>();
	}

	public void add(Customer customer) {
		customers.add(customer);
	}
	public void delete(Customer customer) {
		customers.remove(customer);
		
	}

	public void update(Customer customer) {
		// TODO Auto-generated method stub
		
	}
	
	public List<Customer> getAll(){
		return customers;
	}
	
}
