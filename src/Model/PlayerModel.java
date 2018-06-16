package Model;

public class PlayerModel {
    private String name;
    private int score;
    private int healthPoints;

    public PlayerModel(String name, int score, int healthPoints) {
        this.name = name;
        this.score = score;
        this.healthPoints = healthPoints;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public void saveHighScore(String name, int score) {
        //TODO
    }

}
