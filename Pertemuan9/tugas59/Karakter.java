package Pertemuan9.tugas59;

public class Karakter {
     private String name, gender;
     private int age;

     public Karakter(String name, String gender, int age) {
          this.name = name;
          this.gender = gender;
          this.age = age;
     }

     public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }

     public String getGender() {
          return gender;
     }

     public void setGender(String gender) {
          this.gender = gender;
     }

     public int getAge() {
          return age;
     }

     public void setAge(int age) {
          this.age = age;
     }
}
