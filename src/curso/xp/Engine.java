package curso.xp;

import model.Player;

public class Engine {
    
    public void printPlayerPosition(Player player) {
        System.out.println(String.format("x: %d, y: %d", player.getPosition().x, player.getPosition().y));
    }

    public String[][] getCenario() {
        String[][] cenario = new String[20][20];
        return cenario;
    }

}
