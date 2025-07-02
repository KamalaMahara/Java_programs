//program to demonstrate the super keyword to aceess the parent variables

class Superclass {

    int a = 10;

}

class Subclass extends Superclass {

    int a = 20;

    void display() {
        System.out.println("the value of parent variable is:" + super.a);
        System.out.println("the value of child class variable is:" + a);
    }
}

public class SuperVariable {

    public static void main(String[] args) {
        Subclass s = new Subclass();
        s.display();
    }
}
