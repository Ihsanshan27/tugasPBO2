package Pertemuan9.tugas57;

public class Bicycle extends Vehicle {
    private int myGearCount;

    public Bicycle() {
        super();
        System.out.println("Bicycle");
    }

    public int getMyGearCount() {
        return myGearCount;
    }

    public void setMyGearCount(int myGearCount) {
        this.myGearCount = myGearCount;
    }

}
