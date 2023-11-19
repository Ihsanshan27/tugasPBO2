package Pertemuan9.tugas56;

public class Radio extends BarangAntik {
    private String name;

    public Radio(int umur, String name) {
        super(umur);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
