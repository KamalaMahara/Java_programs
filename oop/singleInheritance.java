
class Animal {

    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Dog inherits from Animal
class Dog extends Animal {

    void bark() {
        System.out.println("Dog barks.");
    }
}

public class singleInheritance {

    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();  // inherited method
        myDog.bark(); // own method
    }
}
