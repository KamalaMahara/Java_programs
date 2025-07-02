//program to show the use of super keyword to invoke the constructor of parent class 

class Parentclass {

    Parentclass() {
        System.out.println("this is the constructor of parent class ");
    }
}

class Subclass extends Parentclass {

    Subclass() {
        super();//this  is optional because compiler automatically call the base class default constructor
        System.out.println("this is the constructor of child class");
    }
}

public class defaultConstructor {

    public static void main(String[] args) {
        Subclass s = new Subclass();

    }
}
