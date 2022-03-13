package gameInterfaceDemo.business.concretes;

import java.util.List;

import gameInterfaceDemo.business.abstracts.CustomerService;
import gameInterfaceDemo.dataAccess.abstracts.CustomerDao;
import gameInterfaceDemo.entities.concretes.Customer;

public class CustomerManager implements CustomerService{
	private CustomerCheckManager customerCheckManager;
	
	public CustomerManager(CustomerCheckManager customerCheckManager){
		this.customerCheckManager = customerCheckManager;
	}

	CustomerDao customerDao = new CustomerDao();

	@Override
	public void add(Customer customer) {
		if (customerCheckManager.checkIfRealPerson(customer)) {
			System.out.println("Registered to database: " + customer.getUserName());
			customerDao.add(customer);
		} else {
			System.out.println("Invalid Person");
		}
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("Deleted user: " + customer.getUserName());
		customerDao.delete(customer);
	}

	@Override
	public void update(Customer customer) {
		System.out.println("Updated user: " + customer.getUserName());
		customerDao.update(customer);
	}

	@Override
	public List<Customer> getAll() {

		return customerDao.getAll();
	}
}
