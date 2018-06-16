package Controller;

import Model.CharacterModel;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Timer;

public class CharacterController implements KeyListener {
    private Timer timer;
    private final int DELAY = 50;

    public CharacterController() {

    }

    CharacterModel charModel = new CharacterModel(0,0,0,0, 30, 30);

    @Override
    public void keyTyped(KeyEvent e) {    }

    public void keyReleased(KeyEvent e) {    }

    //"escuta" as teclas de direção e movimenta o personagem.
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_UP:
                charModel.moveUp();
                break;
            case KeyEvent.VK_RIGHT:
                charModel.moveRight();
                break;
            case KeyEvent.VK_DOWN:
                charModel.moveDown();
                break;
            case KeyEvent.VK_LEFT:
                charModel.moveLeft();
                break;
        }
    }

    public void addKeyListner() {

    }

}
