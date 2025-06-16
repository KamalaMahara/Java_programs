
import java.util.Scanner;

class elseifLadder {

    public static void main(String[] args) {
        float per;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your percentage");
        per = sc.nextFloat();
        if (per >= 90) {
            System.out.println("outstanding performance A+");
        } else if (per >= 80) {
            System.out.println("excellent performance A");
        } else if (per >= 70) {
            System.out.println("good performance B+");

        } else if (per >= 60) {
            System.out.println("Average performance B");
        } else if (per >= 50) {
            System.out.println("you passed C");
        } else if (per >= 40) {
            System.out.println("you passed D");
        } else {
            System.out.println("you failed F");
        }
    }
}
