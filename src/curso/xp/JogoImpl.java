package curso.xp;

import model.Jogador;

import java.awt.*;

public class JogoImpl implements Jogo {

    public static final String OPONENTE = "F";
    private Jogador jogador = new Jogador(2, 3, new Point(0, 0));

    private Point oponente = null;

    private final int tamanhoDoCenario = 5;

    private String[][] cenario = new String[tamanhoDoCenario][tamanhoDoCenario];

    private Integer score = -1;

    private int contadorDeTicks = 0;

    public JogoImpl () {
        tela();
    }

    private String[][] refresh() {
        String comida = "-";
        String jogador = "@";

        iniciarCenario(comida, jogador);

        String celulaDoJogador = cenario[this.jogador.getPosition().y][this.jogador.getPosition().x];
        if (comida.equals(celulaDoJogador)) {
            score++;
        }
        cenario[this.jogador.getPosition().y][this.jogador.getPosition().x] = jogador;

        return cenario;
    }

    private void iniciarCenario(String tracinho, String jogador) {
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
    }

    public String tela() {
        cenario = refresh();

        StringBuilder builder = new StringBuilder();
        builder.append("Pontos: " + score + "\n");

        for (int linha = 0; linha < tamanhoDoCenario; linha++) {
            for (int coluna = 0; coluna < tamanhoDoCenario; coluna++) {
                if (oponente != null && linha == oponente.y && coluna == oponente.x) {
                    builder.append(OPONENTE);
                } else {
                    builder.append(cenario[linha][coluna]);
                }
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

        moverOponente();
        tela();
    }

    private void moverOponente() {
        if (oponente == null) {
            oponente = new Point(4, 4);
        }

        if (contadorDeTicks == 3) {
            moverOponenteEfetivamente();
            contadorDeTicks = 0;
        } else {
            contadorDeTicks++;
        }
    }

    private void moverOponenteEfetivamente() {
        if (oponente.x == 4 && oponente.y == 4) {
            oponente.x--;
        }

        if (oponente.x == 3 && oponente.y == 4) {
            oponente.y--;
        }

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
        moverOponente();
    }
}
