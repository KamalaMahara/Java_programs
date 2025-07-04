// FINAL CLASS: Cannot be inherited

final class Animal {

    // FINAL VARIABLE: Value can't be changed
    final String species = "Dog";

    // FINAL METHOD: Cannot be overridden
    final void makeSound() {
        System.out.println("Barkinggggg...");
    }
}

// This will cause an error because Animal is final
// class Dog extends Animal {}
public class finalclass {

    public static void main(String[] args) {
        Animal a = new Animal();

        // Accessing final variable
        System.out.println("Animal species: " + a.species);

        // Trying to change final variable ( Error)
        // a.species = "Cat"; // Uncommenting this will cause error
        // Calling final method
        a.makeSound();

    }
}
