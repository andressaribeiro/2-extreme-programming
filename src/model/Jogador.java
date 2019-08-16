package model;

import java.awt.*;

public class Jogador {

    private Point position;

    public Jogador() {
    }

    public Jogador(int size, int lifes, Point position) {
        this.position = position;
    }

    public Point getPosition() {
        return position;
    }
}
