
import curso.xp.Engine;
import curso.xp.PlayerService;
import model.Player;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class CapturadorDeTeclas {

public static Player player;

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JButton button = new JButton();
		frame.add(button);
		frame.setVisible(true);

		Engine engine = new Engine();
		PlayerService service = new PlayerService();
		player = service.createPlayer();

		String[][] cenario = engine.getCenario();
		engine.imprimirCenario(cenario);

		button.addKeyListener(new KeyAdapter(){

			@Override
			public void keyPressed(KeyEvent e) {
				player = service.movePlayer(e.getKeyCode(), player);
				engine.printPlayerPosition(player);

				System.out.println(e.getKeyCode());

			}
		});
	}



}