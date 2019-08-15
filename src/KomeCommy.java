
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

		button.addKeyListener(new KeyAdapter(){

			@Override
			public void keyPressed(KeyEvent e) {
				engine.move(e.getKeyCode());
			}
		});

		engine.start();

		loop();
	}

	private static void loop() {

		while (resume) {
			System.out.println(engine.screen());

			try {
				Thread.sleep(500);
			} catch (Exception e) {

			}

		}
	}

}