package Model;

import sun.java2d.pipe.DrawImage;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;
import java.security.Key;

//classe representa o personagem do jogador
//aqui guardamos a imagem e as coordenadas do sprite.
//os métodos keyPressed() e keyReleased() indicam o movimento do sprite.

public class CharacterComponent extends JComponent {
    private int spriteX;
    private int spriteY;
    private int directionX;
    private int directionY;
    private int spriteWidth;
    private int spriteHeight;
    private BufferedImage sprite;
    private JPanel panel;

    //carrega a imagem do personagem.
    public CharacterComponent(JPanel panel) {
        this.panel = panel;
        loadImage();

    }

    //define a dimensao da imagem.
    private void loadImage() {
        try {
            sprite = ImageIO.read(getClass().getResourceAsStream
                    ("C:\\Users\\gsmin\\IdeaProjects\\apsoo\\src\\Model\\Spaceship.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
    public void paintComponent(Graphics g) {
        Graphics2D g2d = ((Graphics2D) g);
        g2d.drawImage(sprite,10, 10, panel);
    }
    //define o movimento do personagem.
    public void move() {
        spriteX += directionX;
        spriteY += directionY;
    }

    public int getDirectionX() {
        return directionX;
    }

    public int getDirectionY() {
        return directionY;
    }

    public int getSpriteWidth() {
        return spriteWidth;
    }

    public int getSpriteHeight() {
        return spriteHeight;
    }

    public Image getSprite() {
        return sprite;
    }


    public int getSpriteX() {
        return spriteX;
    }

    public int getSpriteY() {
        return spriteY;
    }


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
