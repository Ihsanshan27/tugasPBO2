package Pertemuan9.tugas59;

public class Skill extends Karakter {
     public Skill(String name, String gender, int age, String skill, String namaSamaran) {
          super(name, gender, age);
          this.skill = skill;
          this.namaSamaran = namaSamaran;
     }

     private String skill, namaSamaran;

     public String getNamaSamaran() {
          return namaSamaran;
     }

     public void setNamaSamaran(String namaSamaran) {
          this.namaSamaran = namaSamaran;
     }

     public String getSkill() {
          return skill;
     }

     public void setSkill(String skill) {
          this.skill = skill;
     }
}
