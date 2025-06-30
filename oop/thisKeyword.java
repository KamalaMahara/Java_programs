
class emp {

    private int id;
    private String name;
    private double sal;

    public emp(int id, String name, double sal) {
        this.id = id;
        this.name = name;
        this.sal = sal;
    }

    public void display() {
        System.out.println(id + " , " + name + " ," + sal);
    }
}

public class thisKeyword {

    public static void main(String[] args) {
        emp obj = new emp(1, "kamala", 209212.99);
        obj.display();

    }
}
