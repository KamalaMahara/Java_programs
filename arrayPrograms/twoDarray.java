
import java.util.*;

class twoDarray {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        System.out.println("enter the size of the rows and column ");
        int row, col;
        row = kb.nextInt();
        col = kb.nextInt();
        int[][] arr = new int[row][col];
        System.out.println("enter the elements in array:");
        for (int[] arr1 : arr) {                                //using enhanced for loop
            for (int j = 0; j < arr1.length; j++) {
                arr1[j] = kb.nextInt();
            }
        }
        int sum = 0;
        for (int[] x : arr) {
            for (int y : x) {
                System.out.print(y + " ");
                sum += y;
            }
            System.out.println();

        }
        System.out.println("the sum is:" + sum);
        System.out.println("the average is:" + (float) sum / (row * col));

    }
}
