
import java.util.*;

interface shape {

    public double area();

    public String getName();
}

class circle implements shape {

    private final double radius;

    circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public String getName() {
        return "circle shape";
    }
}

class rectangle implements shape {

    private final double l;
    private final double b;

    public rectangle(double l, double b) {
        this.l = l;
        this.b = b;
    }

    @Override
    public double area() {
        return l * b;

    }

    @Override
    public String getName() {
        return "rectangle shape";
    }

}

public class InterfaceExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the radius of circle");
        double r = sc.nextDouble();
        shape c;
        c = new circle(r);
        System.out.println("the area of circle is:" + c.area());
        System.out.println("the name  of shape is:" + c.getName());
        System.out.println("enter the length aand breaadth of rectangle");
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        shape s = new rectangle(l, b);
        System.out.println("the area of rectangle is:" + s.area());
        System.out.println("the name of shape is:" + s.getName());

    }
}
