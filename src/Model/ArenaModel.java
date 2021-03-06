package Model;

import javax.swing.*;

public class ArenaModel extends JPanel {
    private int height;
    private int width;

    public ArenaModel(int width, int height) {
        this.height = height;
        this.width = width;
    }

    @Override
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
