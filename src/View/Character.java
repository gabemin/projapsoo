package View;

import javax.swing.*;
import java.awt.*;

public class Character {
    private int spriteX;
    private int spriteY;
    private int spriteWidth;
    private int spriteHeight;
    private Image sprite;
    private String caminho;

   public Character (String caminho) {

       loadImage();
       this.caminho = caminho;

   }

    private void loadImage() {
       ImageIcon ii = new ImageIcon(caminho);
       sprite = ii.getImage();

       spriteWidth = ii.getIconWidth();
       spriteHeight = ii.getIconHeight();
    }

}
