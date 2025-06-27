
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
        Num obj = new Num();
        obj.setnum(10, 20);
        obj.swap(obj);
        obj.show();

    }
}
