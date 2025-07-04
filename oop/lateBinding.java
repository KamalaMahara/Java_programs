
class Animal {

    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {

    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class lateBinding {

    public static void main(String[] args) {
        Animal a;

        a = new Dog();
        a.sound();   // Output: Dog barks (Dynamic Dispatch)

        a = new Cat();
        a.sound();   // Output: Cat meows (Dynamic Dispatch)
    }
}
