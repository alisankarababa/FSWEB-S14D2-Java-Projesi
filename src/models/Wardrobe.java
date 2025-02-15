package models;

public class Wardrobe {

    private int width;
    private int heigth;
    private double weight;

    public Wardrobe(int width, int heigth, double weight) {
        this.width = width;
        this.heigth = heigth;
        this.weight = weight;
    }

    public int getWidth() {
        return width;
    }

    public int getHeigth() {
        return heigth;
    }

    public double getWeight() {
        return weight;
    }

    public void add() {
        System.out.println("Wardrobe added to into Bedroom");
    }

    @Override
    public String toString() {
        return "Wardrobe{" +
                "width=" + width +
                ", heigth=" + heigth +
                ", weight=" + weight +
                '}';
    }
}
