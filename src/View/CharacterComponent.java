package View;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;

//classe representa o personagem do jogador
//aqui guardamos a imagem e as coordenadas do sprite.
//os métodos keyPressed() e keyReleased() indicam o movimento do sprite.

public class CharacterComponent extends JComponent {

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

}
