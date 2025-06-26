
class Test {

    int a, b;

    // Method that modifies the object's fields
    void add(Test d) {
        d.a = d.a + 100;
        d.b = d.b + 2;
    }
}

public class passByReference {

    public static void main(String[] args) {
        // Create object and assign values
        Test t = new Test();
        t.a = 10;
        t.b = 20;

        System.out.println("Before adding: a = " + t.a + ", b = " + t.b);

        // Pass the object to the method
        t.add(t);

        System.out.println("After adding: a = " + t.a + ", b = " + t.b);
    }
}
