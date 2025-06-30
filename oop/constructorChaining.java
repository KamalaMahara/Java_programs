
class Book {

    String title;
    double price;

    // Constructor 1
    Book() {
        this("Unknown", 0.0); // Calls Constructor 2
    }

    // Constructor 2
    Book(String title) {
        this(title, 0.0); // Calls Constructor 3
    }

    // Constructor 3
    Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    void display() {
        System.out.println(title + " - $" + price);
    }
}

public class constructorChaining {

    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Java Essentials");
        Book b3 = new Book("OOP Concepts", 29.99);

        b1.display(); // Unknown - $0.0
        b2.display(); // Java Essentials - $0.0
        b3.display(); // OOP Concepts - $29.99
    }
}
