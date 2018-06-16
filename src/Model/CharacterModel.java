package Model;

public class CharacterModel {
    private int spriteX;
    private int spriteY;
    private int directionX;
    private int directionY;
    private int width;
    private int heigth;

    public CharacterModel(int spriteX, int spriteY, int directionX, int directionY, int heigth, int width) {
        this.spriteX = spriteX;
        this.spriteY = spriteY;
        this.directionX = directionX;
        this.directionY = directionY;
        this.heigth = heigth;
        this.width = width;
    }

    public int getSpriteX() {
        return spriteX;
    }

    public void setSpriteX(int spriteX) {
        this.spriteX = spriteX;
    }

    public int getSpriteY() {
        return spriteY;
    }

    public void setSpriteY(int spriteY) {
        this.spriteY = spriteY;
    }

    public int getDirectionX() {
        return directionX;
    }

    public void setDirectionX(int directionX) {
        this.directionX = directionX;
    }

    public int getDirectionY() {
        return directionY;
    }

    public void setDirectionY(int directionY) {
        this.directionY = directionY;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeigth() {
        return heigth;
    }

    public void setHeigth(int heigth) {
        this.heigth = heigth;
    }

    public void moveRight() {
        spriteX += 2;
        System.out.println("moving right");
    }
    public void moveLeft() {
        spriteX -= 2;
        System.out.println("moving left");
    }
    public void moveUp() {
        spriteY += 2;
        System.out.println("moving up");
    }
    public void moveDown() {
        spriteX -= 2;
        System.out.println("moving down");
    }
}
