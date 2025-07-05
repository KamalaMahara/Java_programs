
interface A {

    void methodA();

}

interface B {

    void methodB();
}

interface C {

    void methodC();
}

class D implements A, B, C {

    @Override
    public void methodA() {
        System.out.println("this is inside the class d method A");
    }

    @Override
    public void methodB() {
        System.out.println("this is inside the class d method B");
    }

    @Override
    public void methodC() {
        System.out.println("this is inside the class d method c");
    }
}

public class multipleInheritance {

    public static void main(String[] args) {
        D obj = new D();
        obj.methodA();
        obj.methodB();
        obj.methodC();
    }
}
