package Pertemuan9.tugas60;

public class Main {
     public static void main(String[] args) {
          About id = new About("Uzumaki Naruto", "Laki-Laki", "Rasengan, Kurama, Senjutsu", 18,
                    "Naruto memiliki mimpi untuk menjadi Hokage di desan Konoha.");
          System.out.println(id.getNama() + "\n" +
                    "Gender : " + id.getGender() + "\n" +
                    "Umur : " + id.getAge() + "\n" +
                    "Jutsu : " + id.getJurus() + "\n" +
                    "Tentangnya : " + id.getAbout());

          System.out.println();

          About id2 = new About("Hinata Hyuga", "Perempuan", "Bykagun, Gentoshin no jutsu", 19,
                    "Hinata adalah teman masa kecil Naruto. Dia memiliki perasaan kepada Naruto, tetapi akhirnya menikah dengannya");
          System.out.println(id2.getNama() + "\n" +
                    "Gender : " + id2.getGender() + "\n" +
                    "Umur : " + id2.getAge() + "\n" +
                    "Jutsu : " + id2.getJurus() + "\n" +
                    "Tentangnya : " + id2.getAbout());
          System.out.println();

          About id3 = new About("Gaara", "Laki-Laki", "Jinchuriki", 14,
                    "Gaara adalah seorang ninja dari Desa Sunagakure. Dia adalah Jinchuriki dari Shukaku, Biju Ekor Satu.");
          System.out.println(id3.getNama() + "\n" +
                    "Gender : " + id3.getGender() + "\n" +
                    "Umur : " + id3.getAge() + "\n" +
                    "Jutsu : " + id3.getJurus() + "\n" +
                    "Tentangnya : " + id3.getAbout());
     }
}
