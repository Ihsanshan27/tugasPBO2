package Pertemuan9.tugas54;

public class Main {
    public static void main(String[] args) {
        WarnaKoordinat warnaKoordinat = new WarnaKoordinat(10, 4, "Jingga");

        warnaKoordinat.getNamaWarna();
        warnaKoordinat.getX();
        warnaKoordinat.getY();

        System.out.println("Warna Koordinat: " + warnaKoordinat.getNamaWarna());
        System.out.println("Koordinat Sumbu X : " + warnaKoordinat.getX() + ", Y : " + warnaKoordinat.getY());
    }

}
