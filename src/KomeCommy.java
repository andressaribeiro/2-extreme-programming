
import curso.xp.Game;
import curso.xp.PlayerService;
import model.Player;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KomeCommy {

	public static Game engine = new Game();
	public static boolean resume = true;

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JButton button = new JButton();
		frame.add(button);
		frame.setVisible(true);

		String[][] cenario = engine.getCenario();
		engine.imprimirCenario(cenario);

		button.addKeyListener(new KeyAdapter(){

			@Override
			public void keyPressed(KeyEvent e) {

				System.out.println(e.getKeyCode());

			}
		});

	}

	public static void loop() {

		while (resume) {
			try {
				Thread.sleep(300);
			} catch (Exception e) {

			}

		}
	}

}