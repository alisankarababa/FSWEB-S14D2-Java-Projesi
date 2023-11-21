import enums.LampType;
import enums.PaintColor;
import models.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Lamp lamp1 = new Lamp(LampType.T1, true, 40);
        lamp1.turnOn();

        Ceiling ceiling1 = new Ceiling(5, PaintColor.C1);
        ceiling1.create();


        Wall wall1 = new Wall("north");
        Wall wall2= new Wall("south");
        Wall wall3= new Wall("east");
        Wall wall4= new Wall("west");

        Bedroom bedroom = new Bedroom(wall1, wall2, wall3, wall4, ceiling1, "bedroom name",
                new Bed("double", 2,2,2,2),

                new Lamp(LampType.T1, true, 60)
                , new Wardrobe(2, 3, 35 ), new Carpet(3,5,PaintColor.C1));

        System.out.println(bedroom);

        bedroom.createBedroom();
    }
}