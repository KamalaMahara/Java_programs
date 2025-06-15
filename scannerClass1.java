
import java.util.*;

class ScannerClass1 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.println("Enter your first name:");
        String firstname = kb.next();  // Reads a single word

        kb.nextLine();  // Consumes the leftover newline

        System.out.println("Enter your full name:");
        String fullname = kb.nextLine();  // Reads a full line

        System.out.println("Your first name is: " + firstname);
        System.out.println("Your full name is: " + fullname);

        kb.close();
    }
}
