package Controller;

import Utils.ViewChangeListener;
import Model.EnemyModel;
import View.EnemyView;


import javax.swing.Timer;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EnemyController {
	private final int DELAY = 80;
	
	private int yR = (int) (Math.random() * (800 - 10));
	private int x = 600;

	private EnemyModel enemyModel = new EnemyModel(80, 80, x, yR);
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

	public EnemyModel getEnemyModel() {
		return enemyModel;
	}

	public void setEnemyModel(EnemyModel enemyModel) {
		this.enemyModel = enemyModel;
	}
}
