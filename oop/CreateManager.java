
class emp {

    private String name;
    private int age;
    private double sal;

    public void setData(String name, int age, double sal) {
        this.name = name;
        this.age = age;
        this.sal = sal;

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSal() {
        return sal;
    }

}

class Manager extends emp {

    private double bonus;

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getIncome() {
        double amt = getSal() + bonus;
        return amt;
    }
}

public class CreateManager {

    public static void main(String[] args) {
        Manager m = new Manager();
        m.setData("kamala", 20, 2030494.82);
        m.setBonus(203939048.8293);
        System.out.println("the name of Manager is :" + m.getName());
        System.out.println("the age of Manager is :" + m.getAge());
        System.out.println("the salary of Manager is :" + m.getSal());

    }
}
