package curso.xp;

import model.Player;

public class Engine {

    public void printPlayerPosition(Player player) {
        System.out.println(String.format("x: %d, y: %d", player.getPosition().x, player.getPosition().y));
    }

    public String[][] getCenario() {
        String[][] cenario = new String[20][20];

        String t = "#";

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                cenario[j][i] = t;
            }
        }

        return cenario;
    }

    public void imprimirCenario(String[][] cenario) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < cenario.length; i++) {
            for (int j = 0; j < cenario.length; j++) {
                builder.append(cenario[i][j]);
            }
            builder.append("\n'");
        }

        System.out.println(builder.toString());
    }


}
