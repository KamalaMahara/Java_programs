
class Car {

    String brand;
    int year;

    // Non-parameterized constructor
    Car() {
        brand = "Toyota";
        year = 2020;
    }

    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }
}

public class Usecar {

    public static void main(String[] args) {
        Car c1 = new Car();
        c1.displayDetails();
    }
}
