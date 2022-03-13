package gameInterfaceDemo.business.concretes;

import gameInterfaceDemo.business.abstracts.SalesService;
import gameInterfaceDemo.entities.concretes.Customer;
import gameInterfaceDemo.entities.concretes.Game;
import gameInterfaceDemo.entities.concretes.Offer;

public class SalesManager implements SalesService {
	@Override
	public void sell(Customer customer, Game game, Offer offer) {
		System.out.println(game.getGameName() + " selled to " + customer.getUserName() + " with " + offer.getDiscountRate()
				+ " % discount with " + offer.getOfferName() + " campaign ");
	}
}
