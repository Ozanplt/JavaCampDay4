package gameInterfaceDemo.business.abstracts;

import gameInterfaceDemo.entities.concretes.Customer;
import gameInterfaceDemo.entities.concretes.Game;
import gameInterfaceDemo.entities.concretes.Offer;

public interface SalesService {
	void sell(Customer customer, Game game, Offer offer);
}
