package gameInterfaceDemo.business.abstracts;

import gameInterfaceDemo.entities.concretes.Offer;

public interface OfferService {
	void add(Offer offer);
	void delete(Offer offer);
	void update(Offer offer);
}
