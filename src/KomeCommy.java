
import curso.xp.JogoImpl;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;

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
				switch (e.getKeyCode()){
					case KeyEvent.VK_DOWN: engine.desce();
					break;
					case KeyEvent.VK_UP: engine.sobe();
					break;
					case KeyEvent.VK_LEFT: engine.esquerda();
					break;
					case KeyEvent.VK_RIGHT: engine.direita();
					break;
				}
			}
		});


		loop();
	}

	private static void loop() {

		long tick = 0;

		while (resume) {

			if(tick%2 == 0 ){
				engine.tick();
			}

			System.out.println(engine.tela());
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();

			tick++;

			try {
				Thread.sleep(500);
			} catch (Exception e) {

			}

		}
	}

}