package Controller;

import Model.ArenaModel;
import Utils.EdgeCollision;
import Utils.EnemyCollision;
import View.GameView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameController {
	int tempo = 0;
	public GameController() {
		
		ArenaModel arenaModel = new ArenaModel(1200, 600);
		GameView gameFrame = new GameView("Jogo", arenaModel);
		ArenaController arenaController = new ArenaController(arenaModel, gameFrame.getGraphics());
		CharacterController charControl = new CharacterController(arenaController);
//		arenaController.addCharacter(charControl.getCharView());
		EnemyController enemyControl = new EnemyController(gameFrame.getGraphics(), arenaController);
//		gameFrame.add(arenaController.getArenaView());
		gameFrame.addKeyListener(charControl);
		
		new Timer(30, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(String.format("char x: %d, y: %d\nenemy x: %d, y: %d"
						, charControl.getCharModel().getSpriteX(),
						charControl.getCharModel().getSpriteY(),
						enemyControl.getEnemyModel().getX(),
						enemyControl.getEnemyModel().getY()));

				if (EnemyCollision.checkCollision(charControl.getCharModel(), enemyControl.getEnemyModel())) {
					salvaTempo(tempo);
					System.out.println("Game Over!!");
					System.exit(0);
				}

				if (EdgeCollision.checkCollision(charControl.getCharModel(), arenaModel)){
					salvaTempo(tempo);
					System.out.println("Você Venceu!!");
					System.exit(0);

				}
				charControl.updateView(gameFrame.getGraphics());

			}
		}).start();

		new Timer(1000, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				tempo += 1;
			}
		}).start();
	}
	public void salvaTempo(int tempo) {
		System.out.println(String.format("Tempo decorrido: %d", tempo));
	}
}
