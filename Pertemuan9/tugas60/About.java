package Pertemuan9.tugas60;

public class About extends Identitas {
     private String about;

     public About(String nama, String gender, String jurus, int age, String about) {
          super(nama, gender, jurus, age);
          this.about = about;
     }

     public String getAbout() {
          return about;
     }

     public void setAbout(String about) {
          this.about = about;
     }
}
