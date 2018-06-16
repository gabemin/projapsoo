//import View.ArenaComponent;

import Controller.ArenaController;
import Controller.CharacterController;

import javax.swing.*;
import java.awt.*;
import java.util.Timer;

public class MovingSpriteEx extends JFrame {

    public MovingSpriteEx() {

        //add(new ArenaComponent());

        setTitle("Moving sprite");
        setSize(800, 600);
        setBackground(Color.BLACK);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {

        ArenaController arenaControl = new ArenaController();
    }
}

