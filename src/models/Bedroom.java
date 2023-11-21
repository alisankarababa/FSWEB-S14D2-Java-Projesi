package models;

import enums.LampType;
import enums.PaintColor;

public class Bedroom extends Room {

    private String name;
    private Bed bed;
    private Lamp lamp;
    private Wardrobe wardrobe;
    private Carpet carpet;

    public Bedroom(Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, String name, Bed bed, Lamp lamp, Wardrobe wardrobe, Carpet carpet) {
        super(wall1, wall2, wall3, wall4, ceiling);
        this.name = name;
        this.bed = bed;
        this.lamp = lamp;
        this.wardrobe = wardrobe;
        this.carpet = carpet;
    }

    public String getName() {
        return name;
    }

    public Bed getBed() {
        return bed;
    }

    public Lamp getLamp() {
        return lamp;
    }

    public Wardrobe getWardrobe() {
        return wardrobe;
    }

    public Carpet getCarpet() {
        return carpet;
    }

    public void createBedroom() {
        super.getWall1().create();
        super.getWall2().create();
        super.getWall3().create();
        super.getWall4().create();
        super.getCeiling().create();

        bed.make();
        carpet.lying();
        wardrobe.add();
        lamp.turnOn();
    }

    @Override
    public String toString() {
        return "Bedroom{" +
                "name='" + name + '\'' +
                ", bed=" + bed +
                ", lamp=" + lamp +
                ", wardrobe=" + wardrobe +
                ", carpet=" + carpet +
                ", wall1=" + getWall1() +
                ", wall2=" + getWall2() +
                ", wall3=" + getWall3() +
                ", wall4=" + getWall4() +
                '}';
    }
}
