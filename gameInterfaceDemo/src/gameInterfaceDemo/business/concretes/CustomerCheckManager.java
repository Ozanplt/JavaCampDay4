package gameInterfaceDemo.business.concretes;

import gameInterfaceDemo.business.abstracts.CustomerCheckService;
import gameInterfaceDemo.entities.concretes.Customer;

public class CustomerCheckManager implements CustomerCheckService {// Mernis'e bağlantıyı bu classtan
																	// yapabiliriz.Mernis'ten aldığımız return değerini
																	// burada döndürmemiz gerekir.
	@Override
	public boolean checkIfRealPerson(Customer customer) {
		return true;
	}
}
