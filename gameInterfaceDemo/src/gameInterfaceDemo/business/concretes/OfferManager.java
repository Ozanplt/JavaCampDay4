package gameInterfaceDemo.business.concretes;

import gameInterfaceDemo.business.abstracts.OfferService;

import gameInterfaceDemo.dataAccess.abstracts.OfferDao;

import gameInterfaceDemo.entities.concretes.Offer;

public class OfferManager implements OfferService {
	OfferDao offerDao = new OfferDao();

	@Override
	public void add(Offer offer) {

		System.out.println("Offer:" + offer.getOfferName() + "saved to database");
		offerDao.add(offer);
	}

	@Override
	public void delete(Offer offer) {
		System.out.println("Offer:" + offer.getOfferName() + "deleted");
		offerDao.delete(offer);
	}

	@Override
	public void update(Offer offer) {
		System.out.println("Offer:" + offer.getOfferName() + "updated");
		offerDao.update(offer);
	}
}
