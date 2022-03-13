package gameInterfaceDemo.business.concretes;

import gameInterfaceDemo.business.abstracts.GameService;
import gameInterfaceDemo.dataAccess.abstracts.GameDao;

import gameInterfaceDemo.entities.concretes.Game;

public class GameManager implements GameService {

	GameDao gameDao = new GameDao();

	@Override
	public void add(Game game) {

		System.out.println("Game:" + game.getGameName() + "saved to database");
		gameDao.add(game);
	}

	@Override
	public void delete(Game game) {
		System.out.println("Game:" + game.getGameName() + "deleted");
		gameDao.delete(game);
	}

	@Override
	public void update(Game game) {
		System.out.println("Game:" + game.getGameName() + "updated");
		gameDao.update(game);
	}
}
