//WAP that takes an array of integers and removes all the duplicate elements from that array without using built-in function

import java.util.*;

class program3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] temp = new int[n];
        int j = 0;
        for (int i = 0; i < n; i++) {
            boolean isduplicate = false;
            for (int k = 0; k < j; k++) {
                if (arr[i] == temp[k]) {
                    isduplicate = true;
                    break;

                }

            }
            if (!isduplicate) {
                temp[j] = arr[i];
                j++;

            }

        }
        System.out.println("array after removing duplicates:");
        for (int i = 0; i < j; i++) {
            System.out.println(" " + temp[i]);

        }

    }
}
