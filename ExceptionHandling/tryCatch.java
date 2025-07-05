
import java.util.*;

public class tryCatch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        try {
            int c = a / b;
            System.out.println("the divisioon is:" + c);
        } catch (ArithmeticException ex) {
            System.out.println("abey zero se divide nahi karte");
        }
        int d = a + b;
        System.out.println("the addition is:" + d);

    }
}
