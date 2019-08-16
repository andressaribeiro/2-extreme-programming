package curso.xp;

import model.Jogador;

import java.awt.*;

public class JogoImpl implements Jogo {

    private Jogador jogador = new Jogador(2, 3, new Point(0, 0));

    private final int tamanhoDoCenario = 5;

    private String[][] cenario = new String[tamanhoDoCenario][tamanhoDoCenario];

    private Integer score = -1;

    public JogoImpl () {
        tela();
    }

    private String[][] refresh() {
        if (cenario == null) {
            cenario = new String[tamanhoDoCenario][tamanhoDoCenario];
        }

        String tracinho = "-";
        String jogador = "@";

        for (int coluna = 0; coluna < tamanhoDoCenario; coluna++) {
            for (int linha = 0; linha < tamanhoDoCenario; linha++) {
                if (cenario[linha][coluna] == null) {
                    cenario[linha][coluna] = tracinho;
                } else {

                    if (jogador.equals(cenario[linha][coluna])) {
                        cenario[linha][coluna] = ".";
                    }

                }
            }
        }

        if (tracinho.equals(cenario[this.jogador.getPosition().y][this.jogador.getPosition().x])) {
            score++;
        }
        cenario[this.jogador.getPosition().y][this.jogador.getPosition().x] = jogador;

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
        if (jogador.getPosition().y - 1 < 0) {
            return;
        }

        jogador.getPosition().y = jogador.getPosition().y - 1;
        tela();
    }

    @Override
    public void desce() {
        if (jogador.getPosition().y + 1 > 4) {
            return;
        }

        jogador.getPosition().y = jogador.getPosition().y + 1;
        tela();
    }

    @Override
    public void esquerda() {
        if (jogador.getPosition().x - 1 < 0) {
            return;
        }
        jogador.getPosition().x = jogador.getPosition().x - 1;
        tela();
    }

    @Override
    public void direita() {
        if (jogador.getPosition().x + 1 > 4) {
            return;
        }

        jogador.getPosition().x = jogador.getPosition().x + 1;
        tela();
    }

    @Override
    public void tick() {
    }
}
