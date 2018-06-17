package Controller;


import Model.ArenaModel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ArenaController implements ViewChangeListener {
	
	private ArenaModel arenaModel;
	private ArenaView arenaView;
	private Graphics graphics;
	
	public ArenaController(ArenaModel arenaModel, Graphics graphics) {
		this.arenaModel = arenaModel;
		arenaView = new ArenaView(arenaModel);
		this.graphics = graphics;
	}
	
	@Override
	public void changeView() {
		arenaView.drawArena(graphics);
	}
	
}
