package gameInterfaceDemo.api;

import gameInterfaceDemo.business.abstracts.CustomerService;
import gameInterfaceDemo.business.abstracts.GameService;
import gameInterfaceDemo.business.abstracts.OfferService;
import gameInterfaceDemo.business.abstracts.SalesService;
import gameInterfaceDemo.business.concretes.CustomerCheckManager;
import gameInterfaceDemo.business.concretes.CustomerManager;
import gameInterfaceDemo.business.concretes.GameManager;
import gameInterfaceDemo.business.concretes.OfferManager;
import gameInterfaceDemo.business.concretes.SalesManager;
import gameInterfaceDemo.entities.concretes.Customer;
import gameInterfaceDemo.entities.concretes.Game;
import gameInterfaceDemo.entities.concretes.Offer;

public class Main {

	public static void main(String[] args) {
		Customer customer1 = new Customer(1, "Ozanplt", "Ozan", "Polat", "123456678", "2022");
		Game game1 = new Game(1, "Valorant", 38);
		Offer offer1 = new Offer(1, 10, "DISCOUNT FOR YOU!!!");
		GameService gameManager = new GameManager();
		CustomerService customerManager = new CustomerManager(new CustomerCheckManager());
		OfferService offerManager = new OfferManager();
		SalesService salesManager = new SalesManager();
		customerManager.add(customer1);
		gameManager.add(game1);
		offerManager.add(offer1);
		salesManager.sell(customer1, game1, offer1);
	}
}
