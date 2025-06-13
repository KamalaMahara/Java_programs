// demonstrating the wrapper classes in java

class wrapperProgram {

    public static void main(String[] args) {
        int a = 10;
        float c;
        float b = 20.5f;
        a = Integer.parseInt(args[0]);
        b = Float.parseFloat(args[1]);
        c = a + b;
        System.out.println("the first number is:" + a);
        System.out.println("the second number is:" + b);
        System.out.println("their  sum  is:" + c);

    }
}
