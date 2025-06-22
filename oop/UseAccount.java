
import java.util.*;

class Account {

    private final int accid;
    private final String name;
    private final double bal;

    public Account(int id, String nam, double b) {
        accid = id;
        name = nam;
        bal = b;

    }

    void display() {
        System.out.println("Account id= " + accid + "name= " + name + "balance= " + bal);
    }

}

class UseAccount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the account id,name and balance");
        int id = sc.nextInt();
        String name = sc.next();
        double b = sc.nextDouble();
        Account obj = new Account(id, name, b);
        obj.display();
    }
}
