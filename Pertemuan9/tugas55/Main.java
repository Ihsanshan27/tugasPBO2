package Pertemuan9.tugas55;

public class Main {
    public static void main(String[] args) {
        Android android = new Android("Samsung", "Android", "Grand", 3000000, "234sdf4t2asf");
        Blackberry bb = new Blackberry("BlackBB", "RIM", "Curve", 2000000, "BHS92358");
        WindowsPhone wp = new WindowsPhone("Nokia", "Wind8", "Lumia", 10000000, "UUUWDC600HD");

        android.getKeyStore();
        bb.getPinBB();
        wp.getWpKeyStore();

        System.out.println();
        android.displayProduct();
        System.out.println("Android Key Store: " + android.getKeyStore());
        System.out.println();
        bb.displayProduct();
        System.out.println("BB Key Store: " + bb.getPinBB());
        System.out.println();
        wp.displayProduct();
        System.out.println("WP Key Store: " + wp.getWpKeyStore());
        System.out.println();

    }
}
