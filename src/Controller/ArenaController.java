package Controller;


import Model.ArenaModel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ArenaController {

    private final int DELAY = 50;


    public ArenaController() {
        Timer t = new Timer(DELAY, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        ArenaModel arenaModel = new ArenaModel(800,600);
        CharacterController charControl = new CharacterController();
        EnemyController enemyControl = new EnemyController();
        JFrame gameFrame = new JFrame("Teste");
        gameFrame.setSize(800, 600);
        gameFrame.setResizable(false);
        gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameFrame.setVisible(true);
        gameFrame.addKeyListener(charControl);
        t.start();
    }



}
