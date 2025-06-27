
import java.util.*;

class ArraySum {

    public int sum(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }
}

public class UseArraySum {

    public static void main(String[] args) {
        int n;
        System.out.println("enter the size of array");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter element " + (i + 1) + ":");
            arr[i] = sc.nextInt();
        }
        ArraySum a = new ArraySum();
        int b = a.sum(arr);
        System.out.println("the sum of array is :" + b);
    }
}
