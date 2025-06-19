//program to swap two numbers without using a third variable

import java.util.*;

class swapNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number");
        int a = sc.nextInt();
        System.out.println("enter the second number");
        int b = sc.nextInt();
        System.out.println("before swapping:a=" + a + " b=" + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("after swapping:a=" + a + "b=" + b);

    }

}
