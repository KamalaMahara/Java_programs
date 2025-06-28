
import java.util.*;

class arraysum {

    public double[] calculate(int arr[]) {
        int sum = 0;
        double[] ans = new double[2];
        for (int x : arr) {
            sum += x;
        }
        ans[0] = sum;
        ans[1] = (double) sum / arr.length;
        return ans;
    }
}

public class sumAndAvg {

    public static void main(String[] args) {
        arraysum a = new arraysum();
        System.out.println("enter the size of an array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("enter element " + (i + 1) + " :");
            arr[i] = sc.nextInt();
        }
        double[] result = a.calculate(arr);
        System.out.println("the sum is " + result[0]);
        System.out.println("the average is " + result[1]);
    }
}
