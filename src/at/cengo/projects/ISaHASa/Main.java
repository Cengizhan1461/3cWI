package at.cengo.projects.ISaHASa;

public class Main {
    public static void main(String[] args) {
        Animal a1 = new Animal(40, 40);
        Animal a2 = new Animal(100, 60);

        Zoo z1 = new Zoo("Kinderzoo", "Wellritzstraße");
        z1.addAnimal(a1);
        z1.addAnimal(a2);


        Dog d1 = new Dog(50, 40);
        d1.bark();

        z1.addAnimal(d1);
        z1.printAnimals();
    }
}
