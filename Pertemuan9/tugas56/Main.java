package Pertemuan9.tugas56;

public class Main {
    public static void main(String[] args) {
        BarangAntik barangAntik = new BarangAntik(234);
        Radio radio = new Radio(0, "Radio AM");

        radio.getName();

        System.out.println("Nama barang antik: " + radio.getName());
        barangAntik.tampilUmur();

    }

}
