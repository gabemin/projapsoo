package View;

import Model.EnemyModel;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class EnemyView {
	private EnemyModel enemy;
	private BufferedImage image;
	
	public EnemyView(EnemyModel enemyModel) {
		this.enemy = enemyModel;
		try {
			image = ImageIO.read(this.getClass().getResource("resources\\Asteroid.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void drawEnemy(Graphics g){
		g.drawImage(image, enemy.getX(), enemy.getY(), enemy.getWidht(), enemy.getHeigth(), null);
	}
	
	public EnemyModel getEnemy() {
		return enemy;
	}
	
	public void setEnemy(EnemyModel enemy) {
		this.enemy = enemy;
	}
	
	public BufferedImage getImage() {
		return image;
	}
	
	public void setImage(BufferedImage image) {
		this.image = image;
	}
	
	public void move(Graphics graphics) {
		enemy.move();
		drawEnemy(graphics);
	}
}
