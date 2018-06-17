package View;

import Model.CharacterModel;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class CharacterView {
	
	private CharacterModel character;
	private BufferedImage image;
	
	public CharacterView(CharacterModel characterModel) {
		this.character = characterModel;
		try {
			image = ImageIO.read(this.getClass().getResource("\\resources\\ship.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void drawCharacter(Graphics g){
		g.drawImage(image, character.getSpriteX(), character.getSpriteY(), character.getWidth(), character.getHeigth(), null);
	}
	
	public BufferedImage getImage() {
		return image;
	}
	
	public void setImage(BufferedImage image) {
		this.image = image;
	}
	
	public CharacterModel getCharacter() {
		return character;
	}
	
	public void setCharacter(CharacterModel character) {
		this.character = character;
	}
	
	public void moveRight() {
		character.moveRight();
	}
	public void moveLeft() {
		character.moveLeft();
	}
	public void moveUp() {
		character.moveUp();
	}
	public void moveDown() {
		character.moveDown();
	}
}
