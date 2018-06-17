package Controller;

import Model.EnemyModel;


import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;

public class EnemyController {
	private final int DELAY = 80;
	
	//    private int yR = (int) (Math.random() * (800 - 10));
	private int yR = 300;
	private int x = 600;
	
	private EnemyModel enemyModel = new EnemyModel(10, 10, x, yR);
	private EnemyView view = new EnemyView(enemyModel);
	
	public EnemyController(Graphics graphics, ViewChangeListener listener) {
		Timer timer = new Timer(DELAY, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				listener.changeView();
				view.move(graphics);
			}
		});
		timer.start();
	}
}
