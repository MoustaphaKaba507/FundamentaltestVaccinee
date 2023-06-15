package be.intecbrussel;

public class Dog extends Animal{
    private boolean hasFoulBreath;

    //Constructor

    public Dog() {
        super();
    }

    public Dog(int age, String name, int animalNumber, boolean hasFoulBreath) {
        super(age, name, animalNumber);
        this.hasFoulBreath = hasFoulBreath;
    }

    //getters and setters

    public boolean isHasFoulBreath() {
        return hasFoulBreath;
    }

    public void setHasFoulBreath(boolean hasFoulBreath) {
        this.hasFoulBreath = hasFoulBreath;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "hasFoulBreath=" + hasFoulBreath +
                "} " + super.toString();
    }
}
