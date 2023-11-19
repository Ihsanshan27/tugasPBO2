package Pertemuan9.tugas53;

public class Main {

    public static void main(String[] args) {
        // Animal animal = new Animal(false, null, 0);
        Rabbit rabbit = new Rabbit(false, "grass", 4, "grey", "Peter");

        rabbit.getName();
        rabbit.isVegetarian();
        rabbit.getEats();
        rabbit.getNoOfLegs();
        rabbit.getColor();

        System.out.println(
                "Hello, His name is " + rabbit.getName() + "\n" + rabbit.getName() + " is Vegetarian? "
                        + rabbit.isVegetarian() + "\n" + rabbit.getName() + " eats " + rabbit.getEats() + "\n"
                        + rabbit.getName() + " has " + rabbit.getNoOfLegs() + " legs. " + "\n" + rabbit.getName()
                        + " color is " + rabbit.getColor());
    }
}
