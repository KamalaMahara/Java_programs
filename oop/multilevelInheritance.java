
class Animal {

    void eat() {
        System.out.println("Animal eats food 😋");
    }
}

class Dog extends Animal {

    void barks() {
        System.out.println("dog barks loudly");
    }
}

class puppy extends Dog {

    void weeps() {
        System.out.println("puppy weeeps");
    }
}

public class multilevelInheritance {

    public static void main(String[] args) {
        puppy p = new puppy();
        p.weeps();
        p.barks();
        p.barks();
    }
}
