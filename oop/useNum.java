
import java.util.*;

class Num {

    int i, j;

    void setnum(int a, int b) {
        i = a;
        j = b;
    }

    void swap(Num n) {
        n.i = n.i + n.j;
        n.j = n.i - n.j;
        n.i = n.i - n.j;
    }

    void show() {
        System.out.println("after swapp:i=" + i + "j=" + j);
    }
}

public class useNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("before swap: a=" + a + "b=" + b);

        Num obj = new Num();
        obj.setnum(a, b);
        obj.swap(obj);
        obj.show();

    }
}
