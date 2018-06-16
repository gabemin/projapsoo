package Controller;

import Model.EnemyModel;


import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;

public class EnemyController {
    Timer timer;
    private final int DELAY = 100;

    int yR =(int)Math.random()*(800-10);
    int x = 600;

    EnemyModel enemyModel = new EnemyModel(10, 10, x, yR);

    public EnemyController() {
        timer = new Timer(DELAY, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                enemyModel.move();
            }
        });
        timer.start();

    }





}
