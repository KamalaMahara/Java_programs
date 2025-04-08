import java.util.*;

class CountEven {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the elements of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int evencount = 0, oddcount = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                evencount++;
            } else {
                oddcount++;
            }
        }

        System.out.println("even count is: " + evencount);
        System.out.println("odd count is: " + oddcount);

        
    }
}