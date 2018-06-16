package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/*public class ArenaComponent extends JPanel implements ActionListener, KeyListener {

        private Timer timer;
        private CharacterComponent character;
        private final int DELAY=10;
        private String caminho;

    public ArenaComponent() {
        initArena();
    }

    //inicializando o mapa do jogo
    private void initArena() {
        addKeyListener(this);
        setFocusable(true);
        setBackground(Color.black);
        setDoubleBuffered(true);

        timer = new Timer(DELAY, this);
        timer.start();
        character = new CharacterComponent(this);
        add(character);

    }
    public void addCharacter(CharacterComponent character ){

    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        //doDrawing(g);

        Toolkit.getDefaultToolkit().sync();
    }

   /* private void doDrawing(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(character.getSprite(), character.getSpriteX(),
                character.getSpriteY(), this);

    }*/

    //chamado a cada DELAY ms. chama o metodo step()


//}
