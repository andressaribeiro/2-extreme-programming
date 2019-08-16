package model;

import java.awt.*;

public class Jogador {

    private int size;

    private int lifes;

    private Point position;

    public Jogador() {
    }

    public Jogador(int size, int lifes, Point position) {
        this.size = size;
        this.lifes = lifes;
        this.position = position;
    }

    public int getSize() {
        return size;
    }

    public int getLifes() {
        return lifes;
    }

    public Point getPosition() {
        return position;
    }
}
