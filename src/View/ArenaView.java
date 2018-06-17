package View;

import Model.ArenaModel;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class ArenaView {
	
	private final ArenaModel arenaModel;
	private BufferedImage image;
	
	public ArenaView(ArenaModel arenaModel) {
		this.arenaModel = arenaModel;
		try {
			image = ImageIO.read(getClass().getResource("\\resources\\background.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void drawArena(Graphics g){
		g.drawImage(image, arenaModel.getX(), arenaModel.getY(),arenaModel.getWidth(), arenaModel.getHeight(), null);
	}
}
