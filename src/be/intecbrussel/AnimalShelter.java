package be.intecbrussel;

import java.util.*;

public class AnimalShelter {
    private List<Animal> animals;
    private int animalID;

    //Constructor
    public AnimalShelter(){
        animals = new ArrayList<>();
        animalID=1;
    }


    //Method
    public void printAnimals(){
        for(Animal animal : animals ){
            System.out.println(animal);
        }

    }
    public void sortAnimals(){
        Collections.sort(animals, Comparator.comparingInt(Animal::getAnimalNumber));

    }
    public void sortAnimalsByName(){
        Collections.sort(animals, Comparator.comparing(Animal::getName, String.CASE_INSENSITIVE_ORDER));

    }
    public void sortAnimalsByAge(){
      Collections.sort(animals, Comparator.comparingInt(Animal::getAge));


    }

    public void printAnimalsNotVaccinated(Disease  disease){
        for(Animal animal : animals){
            if(!animal.getIsVaccinated().get(disease)){
                System.out.println(animal);
            }
        }

    }
    public Animal findAnimal(int animalNumber){
       return animals.stream()
               .filter(animal -> animal.getAnimalNumber() == animalNumber)
               .findFirst()
               .orElse(null);
    }

    public Animal findAnimal(String name){
       return animals.stream()
               .filter(animal -> animal.getName().equals(name))
               .findFirst()
               .orElse(null);
    }

    public void treatAnimal(int animalNumber){
        Animal animal = findAnimal(animalNumber);
        if(animal != null){
            animal.treatAnimal();
        }

    }
    public void treatAnimal(String name){
        Animal animal = findAnimal(name);
      if(animal != null){
          animal.treatAnimal();
      }
    }
    public void treatAllAnimals(){
        for(Animal animal : animals){
            animal.treatAnimal();
        }

    }
    public Animal findOldestAnimal(){
        Animal oldestAnimal = null;
        int maxAge =Integer.MIN_VALUE;
        for(Animal animal : animals){

            if(animal.getAge() > maxAge){
                maxAge =animal.getAge();
                oldestAnimal = animal;
            }
        }
        return oldestAnimal;
    }
    public int countAnimals(){
        return animals.size();

    }

    public void addAnimals(Animal animal){
        animal.setAnimalNumber(animalID);
        animals.add(animal);
        animalID++;

    }
}
