

import curso.xp.*;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KomeCommy {

	private static Jogo jogo = new JogoImpl();
	private static boolean resume = true;

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JButton button = new JButton();
		frame.add(button);
		frame.setVisible(true);

		button.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				switch (e.getKeyCode()) {
					case KeyEvent.VK_DOWN: jogo.desce();
					break;
					case KeyEvent.VK_UP: jogo.sobe();
					break;
					case KeyEvent.VK_LEFT: jogo.esquerda();
					break;
					case KeyEvent.VK_RIGHT: jogo.direita();
					break;
				}
			}
		});

		loop();
	}

	private static void loop() {
		while (resume) {
			System.out.print("\033[H\033[2J");
			System.out.flush();
			System.out.print(jogo.tela());
			jogo.tick();

			try {
				Thread.sleep(60);
			} catch (Exception e) {

			}
		}
	}

}