package Model;

import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.security.Key;

//classe representa o personagem do jogador
//aqui guardamos a imagem e as coordenadas do sprite.
//os métodos keyPressed() e keyReleased() indicam o movimento do sprite.

public class Character {
    private int X;
    private int Y;
    private int spriteNorth;
    private int spriteEast;
    private int spriteSouth;
    private int spriteWest;
    private int spriteWidth;
    private int spriteHeight;
    private int north;
    private int south;
    private int west;
    private int east;
    private Image sprite;
    private String caminho;

    //carrega a imagem do personagem.
   public Character (String caminho) {

       loadImage();
       this.caminho = caminho;

   }
    //define a dimensao da imagem.
    private void loadImage() {
       ImageIcon ii = new ImageIcon(caminho);
       sprite = ii.getImage();

       spriteWidth = ii.getIconWidth();
       spriteHeight = ii.getIconHeight();

    }

    //define o movimento do personagem.
    public void move() {
       spriteNorth += north;
       spriteSouth += south;
       spriteEast += east;
       spriteWest += west;
    }

    public int getSpriteNorth() {
        return spriteNorth;
    }

    public int getSpriteEast() {
        return spriteEast;
    }

    public int getSpriteSouth() {
        return spriteSouth;
    }

    public int getSpriteWest() {
        return spriteWest;
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

    public String getCaminho() {
        return caminho;
    }

    public int getX() {
        return X;
    }

    public int getY() {
        return Y;
    }


    //"escuta" as teclas de direção para movimentar o personagem.
    void keyPressed(KeyEvent e) {
       int key = e.getKeyCode();
       if (key == KeyEvent.VK_LEFT)
           west = 2;
       if (key == KeyEvent.VK_UP)
           north = 2;
       if (key == KeyEvent.VK_RIGHT)
           east = 2;
       if (key == KeyEvent.VK_DOWN)
           south = 2;
    }
    //detecta quando as teclas de direção são soltas e pára o movimento.
    void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_LEFT)
            west = 0;
        if (key == KeyEvent.VK_UP)
            north = 0;
        if (key == KeyEvent.VK_RIGHT)
            east = 0;
        if (key == KeyEvent.VK_DOWN)
            south = 0;
    }
}
