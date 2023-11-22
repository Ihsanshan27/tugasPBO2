package Pertemuan9.tugas57;

public class Main {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();
        bicycle.setMyBrand("Trek Bike");
        bicycle.setMyModel("7.4FX");
        bicycle.setMyGearCount(23);

        System.out.println("Brand: " + bicycle.getMyBrand());
        System.out.println("Model: " + bicycle.getMyModel());
        System.out.println("Jumlah Gear: " + bicycle.getMyGearCount());

        System.out.println();

        Skateboard skateboard = new Skateboard();
        skateboard.setMyBrand("Ally Skate");
        skateboard.setMyModel("Rocket");
        skateboard.setMyBoardLenght(54.5);

        System.out.println("Brand: " + skateboard.getMyBrand());
        System.out.println("Model: " + skateboard.getMyModel());
        System.out.println("Panjang Board: " + skateboard.getMyBoardLenght());

    }
}
