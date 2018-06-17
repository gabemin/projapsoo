package Controller;

public class GameController {
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
				charControl.updateView(gameFrame.getGraphics());
			}
		}).start();
	}
}
