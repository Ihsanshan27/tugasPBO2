package Pertemuan9.tugas59;

public class Main {
     public static void main(String[] args) {
          Skill id = new Skill("Shinichi Kudo", "Laki-Laki", 17, "Detektif Jenius", "Conan Edogawa");
          System.out.println("Halo, nama aku " + id.getName() + ". aku berusia " + id.getAge() + " dan aku seorang "
                    + id.getGender() + ". Aku adalah " + id.getSkill() + " dengan nama samaran " + id.getNamaSamaran());

          System.out.println();

          Skill id2 = new Skill("Ran Mouri", "Perempuan", 17, "Karate, Jago bela diri", "Tidak punya nama samaran");
          System.out.println("Halo, nama aku " + id2.getName() + ". aku berusia " + id2.getAge() + " dan aku seorang "
                    + id2.getGender() + ". Aku bisa " + id2.getSkill() + " dan aku " + id2.getNamaSamaran());

          System.out.println();

          Skill id3 = new Skill("Kogoro Mouri", "Laki-Laki", 18, "Detektif Swasta", "Sleeping Kogoro");
          System.out.println("Halo, nama aku " + id3.getName() + ". aku berusia " + id3.getAge() + " dan aku seorang "
                    + id3.getGender() + ". Aku adalah " + id3.getSkill() + " dengan nama samaran "
                    + id3.getNamaSamaran());
     }
}
