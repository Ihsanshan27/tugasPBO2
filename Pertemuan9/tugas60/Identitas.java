package Pertemuan9.tugas60;

public class Identitas {
     private String nama, gender, jurus;
     private int age;

     public Identitas(String nama, String gender, String jurus, int age) {
          this.nama = nama;
          this.gender = gender;
          this.jurus = jurus;
          this.age = age;
     }

     public String getNama() {
          return nama;
     }

     public void setNama(String nama) {
          this.nama = nama;
     }

     public String getGender() {
          return gender;
     }

     public void setGender(String gender) {
          this.gender = gender;
     }

     public String getJurus() {
          return jurus;
     }

     public void setJurus(String jurus) {
          this.jurus = jurus;
     }

     public int getAge() {
          return age;
     }

     public void setAge(int age) {
          this.age = age;
     }
}
