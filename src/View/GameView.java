package View;

import Model.ArenaModel;

import javax.swing.*;
import java.awt.*;

public class GameView extends JFrame  {
	
	private CharacterView character;
	
	public GameView(String title, ArenaModel arenaModel) throws HeadlessException {
		super(title);
		setSize(arenaModel.getWidth(), arenaModel.getHeight());
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setBackground(Color.BLACK);
	}
	
	@Override
	public void paintComponents(Graphics g) {
		super.paintComponents(g);
	}
	
	public void setCharacter(CharacterView character) {
		this.character = character;
	}
	
	public CharacterView getCharacter() {
		return character;
	}
}
