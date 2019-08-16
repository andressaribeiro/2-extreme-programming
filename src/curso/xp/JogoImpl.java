package curso.xp;

import model.Player;

import java.awt.*;

public class JogoImpl implements Jogo {

    private Player player = new Player(2, 3, new Point(0, 0));

    private final int tamanhoDoCenario = 5;

    private String[][] cenario = new String[tamanhoDoCenario][tamanhoDoCenario];

    private Integer score = -1;

    public JogoImpl () {
        tela();
    }

    public String[][] refresh() {
        if (cenario == null) {
            cenario = new String[5][5];
        }

        String tracinho = "-";

        for (int coluna = 0; coluna < tamanhoDoCenario; coluna++) {
            for (int linha = 0; linha < 5; linha++) {
                if (cenario[linha][coluna] == null) {
                    cenario[linha][coluna] = tracinho;
                } else {

                    if ("@".equals(cenario[linha][coluna])) {
                        cenario[linha][coluna] = ".";
                    }

                }
            }
        }

        if ("-".equals(cenario[player.getPosition().y][player.getPosition().x])) {
            score++;
        }
        cenario[player.getPosition().y][player.getPosition().x] = "@";

        return cenario;
    }

    public String tela() {
        cenario = refresh();

        StringBuilder builder = new StringBuilder();
        builder.append("Pontos: " + score + "\n");

        for (int linha = 0; linha < tamanhoDoCenario; linha++) {
            for (int coluna = 0; coluna < tamanhoDoCenario; coluna++) {
                builder.append(cenario[linha][coluna]);
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
        tela();
    }

    @Override
    public void desce() {
        if (player.getPosition().y + 1 > 4) {
            return;
        }

        player.getPosition().y = player.getPosition().y + 1;
        tela();
    }

    @Override
    public void esquerda() {
        if (player.getPosition().x - 1 < 0) {
            return;
        }
        player.getPosition().x = player.getPosition().x - 1;
        tela();
    }

    @Override
    public void direita() {
        if (player.getPosition().x + 1 > 4) {
            return;
        }

        player.getPosition().x = player.getPosition().x + 1;
        tela();
    }

    @Override
    public void tick() {
    }
}
