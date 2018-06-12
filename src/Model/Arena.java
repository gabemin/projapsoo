package Model;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Arena extends JPanel implements ActionListener, KeyListener {

        private Timer timer;
        private Character character;
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

        caminho = "#";
        character = new Character(caminho);

        timer = new Timer(DELAY, this);
        timer.start();
    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        doDrawing(g);

        Toolkit.getDefaultToolkit().sync();
    }

    private void doDrawing(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(character.getSprite(), character.getX(),
                character.getY(), this);

    }
    //chamado a cada DELAY ms. chama o metodo step()
    @Override
    public void actionPerformed(ActionEvent e) {
        step();
    }
    //redesenha o personagem na nova localização
    private void step() {
        character.move();
        repaint(character.getX()-1, character.getY()-1,
                character.getSpriteWidth()+2, character.getSpriteHeight()+2);
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
