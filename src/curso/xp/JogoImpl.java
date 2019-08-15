package curso.xp;

import model.Player;

import java.awt.*;

public class JogoImpl implements Jogo {

    private Player player = new Player(2, 3, new Point(0, 0));

    private String[][] cenario = new String[5][5];

    public String[][] refresh() {
        if (cenario == null) {
            cenario = new String[5][5];
        }

        String t = ".";

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                cenario[j][i] = t;
            }
        }

        cenario[player.getPosition().y][player.getPosition().x] = "@";

        return cenario;
    }

    public String tela() {
        cenario = refresh();

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < cenario.length; i++) {
            for (int j = 0; j < cenario.length; j++) {
                builder.append(cenario[i][j]);
            }
            builder.append("\n");
        }

        return builder.toString();
    }

    @Override
    public void sobe() {
        if (player.getPosition().y - 1 < 0) {
            return;
        }

        player.getPosition().y = player.getPosition().y - 1;
    }

    @Override
    public void desce() {
        if (player.getPosition().y + 1 > 4) {
            return;
        }

        player.getPosition().y = player.getPosition().y + 1;
    }

    @Override
    public void esquerda() {
        if (player.getPosition().x - 1 < 0) {
            return;
        }
        player.getPosition().x = player.getPosition().x - 1;
    }

    @Override
    public void direita() {
        if (player.getPosition().x + 1 > 4) {
            return;
        }

        player.getPosition().x = player.getPosition().x + 1;
    }

    @Override
    public void tick() {

    }

}
