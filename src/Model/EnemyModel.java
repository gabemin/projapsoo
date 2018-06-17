package Model;

public class EnemyModel {
    private int widht;
    private int heigth;
    private int x;
    private int y;

    public EnemyModel(int widht, int heigth, int x, int y) {
        this.widht = widht;
        this.heigth = heigth;
        this.x = x;
        this.y = y;
    }

    public int getWidht() {
        return widht;
    }

    public void setWidht(int widht) {
        this.widht = widht;
    }

    public int getHeigth() {
        return heigth;
    }

    public void setHeigth(int heigth) {
        this.heigth = heigth;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void move() {
        x -= 2;
    }
}
