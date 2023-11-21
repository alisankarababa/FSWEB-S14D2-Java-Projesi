package models;

import enums.PaintColor;

public class Ceiling {

    private int height;
    private PaintColor paintedColor;


    public Ceiling(int height, PaintColor paintedColor) {
        this.height = height;
        this.paintedColor = paintedColor;
    }

    public int getHeight() {
        return height;
    }

    public PaintColor getPaintedColor() {
        return paintedColor;
    }

    @Override
    public String toString() {
        return "height=" + height +
                ", paintedColor=" + paintedColor;
    }

    public void create() {
        System.out.println(this.toString());
    }
}
