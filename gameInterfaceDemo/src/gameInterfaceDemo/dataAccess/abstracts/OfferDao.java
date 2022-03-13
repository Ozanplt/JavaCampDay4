package gameInterfaceDemo.dataAccess.abstracts;

import java.util.ArrayList;
import java.util.List;

import gameInterfaceDemo.entities.concretes.Offer;

public class OfferDao {
	List<Offer> offers;

	public OfferDao() {
		offers = new ArrayList<Offer>();
	}

	public void add(Offer offer) {
		offers.add(offer);
		
	}

	public void delete(Offer offer) {
		offers.remove(offer);

	}

	public void update(Offer offer) {
		// TODO Auto-generated method stub

	}

	public List<Offer> getAll() {
		return offers;
	}
}
