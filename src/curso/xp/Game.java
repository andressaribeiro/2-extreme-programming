package curso.xp;

import model.Player;

public class Game implements GameCore {

    private Player player;

    private PlayerService service;

    private String[][] cenario = new String[5][5];

    public void printPlayerPosition(Player player) {
        getCenario()[player.getPosition().y][player.getPosition().x] = "X";
    }

    public String[][] getCenario() {
        if (cenario == null) {
            cenario = new String[5][5];
        }

        String t = ".";

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
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
            builder.append("\n");
        }

        System.out.println(builder.toString());
    }

    @Override
    public void start() {
        service = new PlayerService();
        player = service.createPlayer();
    }

    @Override
    public void moveUp() {

    }

    @Override
    public void moveDown() {

    }

    @Override
    public void moveLeft() {

    }

    @Override
    public void moveRight() {

    }

    @Override
    public void gameTick() {

    }

    @Override
    public void printPlayerPosition() {

    }
}
