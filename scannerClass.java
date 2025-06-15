
import java.util.*;

class ScannerClass {

    public static void main(String[] args) {
        int a, b, c;
        Scanner kb = new Scanner(System.in);

        System.out.println("enter the first number");
        a = kb.nextInt();
        System.out.println("enter the second number");
        b = kb.nextInt();
        c = a + b;
        System.out.println("sum is:" + c);

    }
}
