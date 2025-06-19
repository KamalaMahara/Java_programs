
import java.util.*;

class jaggedArray {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("enter the number of rows in jagged array");
        int n = kb.nextInt();
        int arr[][] = new int[n][];
        for (int i = 0; i < n; i++) {
            System.out.println("enter the number of columns in row" + (i + 1));
            int m = kb.nextInt();
            arr[i] = new int[m];
            System.out.println("enter the elements of row" + (i + 1));
            for (int j = 0; j < m; j++) {
                arr[i][j] = kb.nextInt();
            }

        }
        System.out.println("the jagged array is:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                // System.out.println("arr[" + i + "][" + j + "]=" + arr[i][j]);
                System.out.print(arr[i][j] + " ");

            }
            System.out.println();
        }

    }

}
