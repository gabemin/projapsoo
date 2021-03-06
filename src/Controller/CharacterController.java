package Controller;

import Utils.ViewChangeListener;
import Model.CharacterModel;
import View.CharacterView;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class CharacterController implements KeyListener {
    private CharacterModel charModel;
    private CharacterView charView;
    private ViewChangeListener listener;
    
    
    public CharacterController(ViewChangeListener listener) {
        this.listener = listener;
        charModel = new CharacterModel(0, 0, 0, 0, 50, 100);
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
    public void updateView(Graphics graphics) {
        charView.drawCharacter(graphics);
    }

    public CharacterModel getCharModel() {
        return charModel;
    }

    public void setCharModel(CharacterModel charModel) {
        this.charModel = charModel;
    }
}
