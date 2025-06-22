
import java.util.*;

class Circle {

    private final int radius;

    Circle(int rad) {
        radius = rad;
    }

    public double area() {
        double circlearea = Math.PI * Math.pow(radius, 2);
        return circlearea;
    }

    public double circumference() {
        double cir = 2 * Math.PI * radius;
        return cir;
    }
}

public class Usecircle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the radius of a circle");
        double r = sc.nextDouble();
        Circle c = new Circle((int) r);
        System.out.println("Area: " + c.area());
        System.out.println("Circumference: " + c.circumference());
    }
}
