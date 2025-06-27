
class Demo {

    public void doubler(int drr[]) {
        for (int i = 0; i < drr.length; i++) {
            drr[i] = drr[i] * 2;
        }
    }
}

public class UseDemo {

    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        Demo d = new Demo();
        System.out.println("before doubling:");
        for (int x : arr) {
            System.out.println(x);
        }
        d.doubler(arr);
        System.out.println("after doubling:");
        for (int x : arr) {
            System.out.println(x);
        }

    }
}
