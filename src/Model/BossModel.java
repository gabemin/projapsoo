package Model;

public class BossModel extends EnemyModel{
    private int healthPoints;

    public BossModel(int widht, int heigth, int x, int y, int healthPoints) {
        super(widht, heigth, x, y);
        this.healthPoints = healthPoints;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }
}
