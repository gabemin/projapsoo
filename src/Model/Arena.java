package Model;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Arena extends JPanel implements ActionListener, KeyListener {

        private Timer timer;
        private CharacterComponent character;
        private final int DELAY=10;
        private String caminho;

    public Arena() {
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
    @Override
    public void actionPerformed(ActionEvent e) {
        character.move();
        repaint(character.getSpriteX()-1, character.getSpriteY()-1,
                character.getSpriteWidth()+2, character.getSpriteHeight()+2);
    }

    //redesenha o personagem na nova localização
    private void step() {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        character.keyPressed(e);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        character.keyReleased(e);
    }
}
