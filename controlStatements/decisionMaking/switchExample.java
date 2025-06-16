
import java.util.*;

class switchExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        System.out.println("enter your choice");
        choice = sc.nextInt();
        switch (choice) {
            case 1 ->
                System.out.println("red"); //using enhanced switch statement
            case 2 ->
                System.out.println("green");
            case 3 ->
                System.out.println("blue");
            default ->
                System.out.println("invalid choice");
        }
    }
}
