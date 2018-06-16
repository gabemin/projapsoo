package Controller;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class CharacterController implements KeyListener {

    //"escuta" as teclas de direção para movimentar o personagem.
    void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_UP:
                directionY = 2;
                break;
            case KeyEvent.VK_RIGHT:
                directionX += 2;
                break;
            case KeyEvent.VK_DOWN:
                directionY = -2;
                break;
            case KeyEvent.VK_LEFT:
                directionX = -2;
                break;
        }
    }

    //detecta quando as teclas de direção são soltas e pára o movimento.
    void keyReleased(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_UP:
                directionY = 0;
                break;
            case KeyEvent.VK_RIGHT:
                directionX = 0;
                break;
            case KeyEvent.VK_DOWN:
                directionY = 0;
                break;
            case KeyEvent.VK_LEFT:
                directionX = 0;
                break;
        }

    }
}
