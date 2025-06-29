
class staticBlock {

    static int a = 3;
    static int b;

    static {

        System.out.println("static block initialized");
        b = a * 4;
    }

    public static void main(String[] args) {
        System.out.println("a=" + a);
        System.out.println("b=" + b);
    }
}
