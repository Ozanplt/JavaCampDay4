package gameInterfaceDemo.dataAccess.abstracts;

import java.util.ArrayList;
import java.util.List;


import gameInterfaceDemo.entities.concretes.Game;

public class GameDao{
	List<Game> games;

	
	public GameDao(){
		games= new ArrayList<Game>();
	}
	

	public void add(Game game) {
		games.add(game);
	}
	public void delete(Game game) {
		games.remove(game);
		
	}

	public void update(Game game) {
		// TODO Auto-generated method stub
		
	}
	
	public List<Game> getAll(){
		return games;
	}
}
