package Abstract;

import Entities.Gamer;

public interface GamerManager {
	void delete(Gamer gamer);
	void update(Gamer gamer);
	void register(Gamer gamer);
}
