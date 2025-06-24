
import java.util.Scanner;

public class Student {

    int id;
    String name;

    // Constructor 2: One parameter
    Student(int i) {
        id = i;
        name = "Unknown";
    }

    // Constructor 3: Two parameters
    Student(int i, String n) {
        id = i;
        name = n;
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter student ID:");
        int id = sc.nextInt();
        sc.nextLine();  // consume newline

        System.out.println("Enter student name (leave blank if unknown):");
        String name = sc.nextLine();

        Student s;

        if (name.isEmpty()) {
            s = new Student(id);  // Calls constructor with one argument
        } else {
            s = new Student(id, name);  // Calls constructor with two arguments
        }

        s.display();

        sc.close();
    }
}
