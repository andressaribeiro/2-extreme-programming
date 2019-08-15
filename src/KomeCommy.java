
import curso.xp.JogoImpl;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KomeCommy {

	public static JogoImpl engine = new JogoImpl();
	public static boolean resume = true;

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JButton button = new JButton();
		frame.add(button);
		frame.setVisible(true);

		button.addKeyListener(new KeyAdapter(){

			@Override
			public void keyPressed(KeyEvent e) {
//				engine.move(e.getKeyCode());
			}
		});


		loop();
	}

	private static void loop() {

		while (resume) {
			System.out.println(engine.tela());

			try {
				Thread.sleep(500);
			} catch (Exception e) {

			}

		}
	}

}