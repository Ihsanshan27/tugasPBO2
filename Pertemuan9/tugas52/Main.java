package Pertemuan9.tugas52;

public class Main extends Manusia {
    public static void main(String[] args) {
        // Manusia manusia = new Manusia();
        Dosen dosen = new Dosen();
        Mahasiswa mahasiswa = new Mahasiswa();

        dosen.setNip("41227829930");
        dosen.setNama("Rizky Adam Kurniawan");
        dosen.setUmur(27);
        dosen.setMataKuliah("PBO");
        System.out.println("NIP Dosen: " + dosen.getNip());
        dosen.siapaKamu();
        dosen.mengajarApa();

        System.out.println();

        mahasiswa.setNim("10119013");
        mahasiswa.setNama("Nindi");
        mahasiswa.setUmur(17);
        mahasiswa.setKelas("PBO");
        System.out.println("NIM MAHASISWA: " + mahasiswa.getKelas());
        mahasiswa.siapaKamu();
        mahasiswa.kelasApa();

    }
}
