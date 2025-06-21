//WAP to find the factorial of a number using recursion

import java.util.*;

class factorialnum {

    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to find factorial");
        int n = sc.nextInt();
        int result = factorial(n);
        System.out.println("the factorial of number " + n + " is " + result);
    }
}
