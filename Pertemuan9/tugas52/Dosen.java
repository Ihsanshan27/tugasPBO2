package Pertemuan9.tugas52;

public class Dosen extends Manusia {
    private String nip;
    private String mataKuliah;

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(String mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    public void mengajarApa() {
        System.out.println("Saya " + nama + " umur " + umur + " tahun sedang mengajar mata kuliah " + mataKuliah);
    }

    public void siapaKamu() {
        System.out.println("Saya Dosen");
    }

}
