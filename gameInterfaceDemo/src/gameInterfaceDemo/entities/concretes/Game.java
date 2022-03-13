package gameInterfaceDemo.entities.concretes;

import gameInterfaceDemo.entities.abstracts.BaseEntity;

public class Game extends BaseEntity{
	private String gameName;
	private double price;
	public Game() {
		super();
	}
	public Game(int id,String gameName, double price) {
		super(id);
		this.gameName = gameName;
		this.price = price;
	}
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}
