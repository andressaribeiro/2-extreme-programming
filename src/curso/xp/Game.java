package curso.xp;

import model.Player;

public class Game implements GameCore {

    private Player player;

    private PlayerService service;

    private String[][] cenario = new String[5][5];

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

        cenario[player.getPosition().y][player.getPosition().x] = "X";

        return cenario;
    }

    public void imprimirCenario() {
        cenario = getCenario();

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
    public void move(int key) {
        player = service.movePlayer(key, player);
    }

    @Override
    public void gameTick() {

    }

}
