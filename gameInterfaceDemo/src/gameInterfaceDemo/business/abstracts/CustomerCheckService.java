package gameInterfaceDemo.business.abstracts;


import gameInterfaceDemo.entities.concretes.Customer;

public interface CustomerCheckService {
	boolean checkIfRealPerson(Customer customer);
}
