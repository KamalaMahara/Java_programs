//WAP to create a 2D array of 3*3 size ,accept values from users and check whetrhrt its a unit martrix or not

import java.util.*;

class arrayProgram1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[3][3];
        System.out.println("enter the elements of 3*3 matrix");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();

            }

        }
        boolean isUnitMatrix = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j && a[i][j] != 1) {
                    isUnitMatrix = false;

                } else if (i != j && a[i][j] != 0) {
                    isUnitMatrix = false;

                }

            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j && a[i][j] != 1) {
                    isUnitMatrix = false;
                } else if (i != j && a[i][j] != 0) {
                    isUnitMatrix = false;
                }
            }
        }

        if (isUnitMatrix) {
            System.out.println("The matrix is a unit matrix.");
        } else {
            System.out.println("The matrix is not a unit matrix.");
        }
    }
}
