
class Student {

    int rollno;
    String name;
    static String college = "janjoti multiple campus";

    Student(int r, String n) {
        rollno = r;
        name = n;
    }

    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }
}

public class StaticStudent {

    public static void main(String[] args) {
        Student s1 = new Student(10, "kamala");
        Student s2 = new Student(12, "prastut");
        s1.display();
        s2.display();
    }
}
