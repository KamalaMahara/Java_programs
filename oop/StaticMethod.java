
import java.util.*;

class calculator {

    static int add(int a, int b) {
        return a + b;
    }
}

public class StaticMethod {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = calculator.add(a, b);
        System.out.println("the sum is:" + result);
    }
}
