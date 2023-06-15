package be.intecbrussel;

public class App {
    public static void main(String[] args) {

        AnimalShelter animalShelter = new AnimalShelter();

        animalShelter.addAnimals(new Monkey(3,"King",2,true));
        animalShelter.addAnimals(new Monkey(11,"Rodi",22,true));
        animalShelter.addAnimals(new Cat(8,"Mimi",11,true));
        animalShelter.addAnimals(new Cat(6,"Snop",2,true));
        animalShelter.addAnimals(new Cat(5,"tini",3,true));
        animalShelter.addAnimals(new Cat(7,"yoyo",88,true));
        animalShelter.addAnimals(new Dog(9,"Bingo",222,true));
        animalShelter.addAnimals(new Dog(6,"kip",31,true));
        animalShelter.addAnimals(new Dog(5,"snik",200,true));
        animalShelter.addAnimals(new Dog(8,"papi",43,true));

        animalShelter.printAnimals();
        animalShelter.sortAnimals();
        animalShelter.printAnimals();
        animalShelter.sortAnimalsByAge();
        animalShelter.findOldestAnimal();
        animalShelter.countAnimals();
        animalShelter.printAnimalsNotVaccinated(Disease.CHICKENPOCKS);



    }
}
