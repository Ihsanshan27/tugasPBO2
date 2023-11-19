package Pertemuan9.tugas53;

public class Rabbit extends Animal {
    private String color;
    private String name;

    public Rabbit(boolean vegetarian, String eats, int noOfLegs, String color, String name) {
        super(vegetarian, eats, noOfLegs);
        this.color = color;
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

}
