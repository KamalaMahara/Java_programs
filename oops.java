
class Student {

    private int roll;
    private char grade;
    private double per;

    public void setdata() {
        roll = 6;
        grade = 'A';
        per = 98.9;
    }

    public void showdata() {
        System.out.println(roll + ", " + grade + " ," + per);
    }
}

public class oops {

    public static void main(String[] args) {
        Student s = new Student();
        s.setdata();
        s.showdata();
    }
}
