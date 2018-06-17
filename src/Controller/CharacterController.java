package Controller;

import Model.CharacterModel;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Timer;

public class CharacterController implements KeyListener {
    private CharacterModel charModel;
    private CharacterView charView;
    private ViewChangeListener listener;
    
    
    public CharacterController(ViewChangeListener listener) {
        this.listener = listener;
        charModel = new CharacterModel(0, 0, 0, 0, 30, 30);
        charView = new CharacterView(charModel);
    }

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

}
