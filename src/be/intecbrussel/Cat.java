package be.intecbrussel;

public class Cat extends Animal{
    private boolean hasLongNails;

    //Constructor
    public Cat() {
        super();
    }

    public Cat(int age, String name, int animalNumber, boolean hasLongNails) {
        super(age, name, animalNumber);
        this.hasLongNails = hasLongNails;
    }

    //Getters and setters

    public boolean isHasLongNails() {
        return hasLongNails;
    }

    public void setHasLongNails(boolean hasLongNails) {
        this.hasLongNails = hasLongNails;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "hasLongNails=" + hasLongNails +
                "} " + super.toString();
    }
}
