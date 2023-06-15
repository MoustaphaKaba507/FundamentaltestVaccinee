package be.intecbrussel;

import java.util.HashMap;
import java.util.Map;

public abstract class Animal implements Vaccinateable,Treatable{

    private Map<Disease,Boolean> isVaccinated;
    private boolean isClean;
    private int age;
    private String name;
    private int animalNumber;

    //Constructor
    public Animal() {
      isVaccinated = new HashMap<>();
        for(Disease disease : Disease.values()){
            isVaccinated.put(disease,false);
        }
        isClean = false;
    }

    public Animal( int age, String name, int animalNumber) {
        this();
        this.age = age;
        this.name = name;
        this.animalNumber = animalNumber;
    }

    //Getters and setters
    public Map<Disease, Boolean> getIsVaccinated() {
        return isVaccinated;
    }

    public void setIsVaccinated(Map<Disease, Boolean> isVaccinated) {
        this.isVaccinated = isVaccinated;
    }

    public boolean isClean() {
        return isClean;
    }

    public void setClean(boolean clean) {
        isClean = clean;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAnimalNumber() {
        return animalNumber;
    }

    public void setAnimalNumber(int animalNumber) {
        this.animalNumber = animalNumber;
    }



    @Override
    public void vaccinateAnimal(Disease disease) {
        isVaccinated.put(disease, true);

    }

    @Override
    public String toString() {
        return "Animal{" +
                "isVaccinated=" + isVaccinated +
                ", isClean=" + isClean +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", animalNumber=" + animalNumber +
                '}';
    }
}
