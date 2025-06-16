//program to perform simple if statement

import java.util.*;

class SimpleIf {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int a = sc.nextInt();
        if (a > 0) {
            System.out.println("the number is positive");
        }
        System.out.println("outside if statement");
        sc.close();

    }

}
