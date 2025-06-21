
import java.util.Scanner;

class circle {

    private double radius;

    public void setradius(double r) {
        radius = r;

    }

    public void calculatearea() {
        double area = Math.PI * radius * radius;
        System.out.println("area of cicle is:" + area);
    }

    public void calculateCircumference() {
        double cir = 2 * Math.PI * radius;
        System.out.println("circumferece of cicle is:" + cir);
    }

}

public class UseCircle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the radius of the circle:");
        double rad = sc.nextDouble();

        circle c1 = new circle();
        // You can change the radius value as needed
        c1.setradius(rad);
        c1.calculatearea();
        c1.calculateCircumference();
    }
}
