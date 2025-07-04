
abstract class Animal {

    abstract void makesound();

    void sleep() {
        System.out.println("sleeping..");
    }
}

class Dog extends Animal {

    @Override
    void makesound() {
        System.out.println("dog barks");
    }

}

class Cat extends Animal {

    @Override
    void makesound() {
        System.out.println("cat meows");
    }
}

public class abstractclass {

    public static void main(String[] args) {
        Animal a;
        a = new Dog();
        a.makesound();
        a.sleep();
        a = new Cat();
        a.makesound();
        a.sleep();
    }
}
