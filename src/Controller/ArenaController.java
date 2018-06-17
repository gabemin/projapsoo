package Controller;


import Utils.ViewChangeListener;
import Model.ArenaModel;
import View.ArenaView;

import java.awt.*;


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
