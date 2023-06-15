package be.intecbrussel;

public class Monkey extends Animal implements Treatable{

    //Constructor
    private boolean isHyperActive;

    public Monkey(){
        super();
    }

    public Monkey(int age, String name, int animalNumber, boolean isHyperActive) {
        super(age, name, animalNumber);
        this.isHyperActive = isHyperActive;
    }

    //Getter and setter

    public boolean isHyperActive() {
        return isHyperActive;
    }

    public void setHyperActive(boolean hyperActive) {
        isHyperActive = hyperActive;
    }

    @Override
    public void treatAnimal(){
        this.setClean(true);
        this.setHyperActive(false);
    }

    @Override
    public String toString() {
        return "Monkey{" +
                "isHyperActive=" + isHyperActive +
                "} " + super.toString();
    }
}
