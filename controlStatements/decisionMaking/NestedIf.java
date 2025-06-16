
import java.util.*;

class NestedIf {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();
        if (num > 100) {
            if (num % 2 == 0) {
                System.out.println("the number is greater than 100 and even ");
            } else {
                System.out.println("the number is grater than 100 and odd");
            }

        } else {
            System.out.println("the number is less than or equal to 100");
        }
    }
}
