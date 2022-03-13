package gameInterfaceDemo.entities.concretes;

import gameInterfaceDemo.entities.abstracts.BaseEntity;

public class Offer extends BaseEntity {
	private double discountRate;
	private double discountedPrice;
	private String offerName;
	public Offer() {
		super();
	}
	public Offer(int id,double discountRate, String offerName) {
		super(id);
		this.discountRate = discountRate;
		this.offerName = offerName;
	}
	public double getDiscountRate() {
		return discountRate;
	}
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	public double getDiscountedPrice(Game game) {
		this.discountedPrice=game.getPrice()-game.getPrice()*this.discountRate;
		return this.discountedPrice;
	}
	public String getOfferName() {
		return offerName;
	}
	public void setOfferName(String offerName) {
		this.offerName = offerName;
	}
	
	
}
