package curso.xp;

import model.Player;

public class Engine {

    public void printPlayerPosition(Player player) {
        getCenario()[player.getPosition().y][player.getPosition().x] = "X";
    }

    public String[][] getCenario() {
        String[][] cenario = new String[20][20];
        return cenario;
    }

}
