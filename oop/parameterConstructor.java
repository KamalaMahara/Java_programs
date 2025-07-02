
////program to show the use of super keyword to invoke the parameterized constructor of parent class 
class Person {

    int id;
    String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

}

class Employee extends Person {

    float salary;

    public Employee(int id, String name, float salary) {
        super(id, name);  //reusing parent constructor
        this.salary = salary;
    }

    void display() {
        System.out.println("id is:" + " " + id);
        System.out.println("Name is:" + " " + name);
        System.out.println("Salary is:" + " " + salary);
    }

}

public class parameterConstructor {

    public static void main(String[] args) {
        Employee e = new Employee(101, "kamala", 12344);
        e.display();
    }

}
