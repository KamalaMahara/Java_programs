
class vehicle {

    void StartEngine() {
        System.out.println("engine started");
    }

    void FuelCapacity() {
        System.out.println("the fuel capacity is :80litres");
    }

    void speed() {
        System.out.println("the speed is 100km/hr");
    }
}

class Car extends vehicle {

    void Brand() {
        System.out.println("brand of car is BMW");
    }

}

class Bike extends vehicle {

    void HandleType() {
        System.out.println(" Bike has straight handle type");
    }
}

public class hierarchicalInheritance {

    public static void main(String[] args) {

        System.out.println("the vehicle details are:");    //parent class
        vehicle v = new vehicle();
        v.StartEngine();
        v.FuelCapacity();
        v.speed();
        System.out.println("");

        System.out.println("the car  details are:");      //child class 1
        Car c = new Car();
        c.StartEngine();
        c.FuelCapacity();
        c.speed();
        c.Brand();
        System.out.println("");

        System.out.println("the bike  details are:");    // child class 2
        Bike b = new Bike();
        b.StartEngine();
        b.FuelCapacity();
        b.speed();
        b.HandleType();
    }

}
