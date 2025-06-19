//WAP to sort  a numeric array and a string array.

import java.util.*;

class program2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of numeric array");
        int n = sc.nextInt();
        int[] numArray = new int[n];
        System.out.println("enter the elements of numeric array");
        for (int i = 0; i < n; i++) {
            numArray[i] = sc.nextInt();

        }
        Arrays.sort(numArray);
        System.out.println("Soeted numeric array is:");
        for (int i = 0; i < n; i++) {
            System.out.println(" " + numArray[i]);

        }

        System.out.println("enter the size of string array");
        int m = sc.nextInt();
        String[] strArray = new String[m];
        System.out.println("enter the elements of string array");
        for (int i = 0; i < m; i++) {
            strArray[i] = sc.next();
        }
        Arrays.sort(strArray);
        System.out.println("sorted string array");
        for (int i = 0; i < m; i++) {
            System.out.println(" " + strArray[i]);
        }

    }
}
