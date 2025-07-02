//super keyword is used to invoke parent class method

class Person {

    void message() {
        System.out.println("this is the parent method ");
    }
}

class Student extends Person {

    void message() {
        System.out.println("this is the child class method");
    }

    void display() {
        message();
        super.message();
    }
}

public class SuperMethod {

    public static void main(String[] args) {
        Student s = new Student();
        s.display();
    }
}
