package curso.xp;

import model.Player;

import java.awt.*;

public class PlayerService {

    public Player  createPlayer() {
        return new Player(2, 3, new Point(0, 0));
    }

    public Player movePlayer(Integer key, Player player) {
        switch (key) {
            case 37: {
                if (player.getPosition().x - 1 < 0) {
                    return player;
                }
                player.getPosition().x = player.getPosition().x - 1;
                return player;
            }

            case 39: {
                player.getPosition().x = player.getPosition().x + 1;
                return player;
            }

            case 38: {
                if (player.getPosition().y - 1 < 0) {
                    return player;
                }

                player.getPosition().y = player.getPosition().y - 1;
                return player;
            }

            case 40: {
                player.getPosition().y = player.getPosition().y + 1;
                return player;
            }

            default: return player;
        }
    }



}
