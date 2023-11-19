// nama : Muhammad Ihsan Fadillah
// NIM : 
// Kelas : Reguler C

package Pertemuan9.tugas51;

import java.util.Scanner;

public class Main extends Karyawan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Karyawan karyawan = new Karyawan();
        Manager manager = new Manager();

        System.out.println("====Program Perhitungan Gaji Karyawan====");
        System.out.println("Masukan Nik: ");
        karyawan.setNik(input.nextLine());

        System.out.println("Masukan Nama: ");
        karyawan.setNama(input.nextLine());

        System.out.println("Masukan Golongan (1/2/3): ");
        karyawan.setGolongan(input.nextInt());

        System.out.println("Masukan Jabatan (Manager/Kabag): ");
        karyawan.setJabatan(input.next());

        System.out.println("Masukan Jumlah Kehadiran: ");
        manager.setKehadiran(input.nextInt());

        input.close();

        String nik = karyawan.getNik();
        String nama = karyawan.getNama();
        int golongan = karyawan.getGolongan();
        String jabatan = karyawan.getJabatan();
        float tunjanganGolongan = manager.tunjanganGolongan(golongan);
        float tunjanganJabatan = manager.tunjanganJabatan(jabatan);
        int hadir = manager.getKehadiran();
        float tunjanganKehadiran = manager.tunjanganKehadiran(hadir);
        float gajiTotal = manager.gajiTotal();

        System.out.println();
        System.out.println("====Hasil Perhitungan====");
        System.out.println("NIK\t\t: " + nik);
        System.out.println("NAMA\t\t: " + nama);
        System.out.println("GOLONGAN\t\t: " + golongan);
        System.out.println("JABATAN\t\t: " + jabatan);
        System.out.println();
        System.out.println("TUNJANGAN GOLONGAN\t: " + tunjanganGolongan);
        System.out.println("TUNJANGAN JABATAN\t: " + tunjanganJabatan);
        System.out.println("TUNJANGAN KEHADIRAN\t: " + tunjanganKehadiran);
        System.out.println();
        System.out.println("TOTAL GAJI\t: Rp " + gajiTotal);
        System.out.println();

    }
}
