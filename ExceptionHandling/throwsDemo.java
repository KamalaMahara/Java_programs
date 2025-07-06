
public class throwsDemo {

    int divide(int a, int b) throws ArithmeticException {
        int result = a / b;
        return result;

    }

    public static void main(String[] args) throws ArithmeticException {  // main method can also throw exceptions 
        throwsDemo obj = new throwsDemo();
        obj.divide(10, 0);
        // try {
        //     System.out.println(" result is:" + obj.divide(10, 0));     //  it can be handled using try-catch block
        // } catch (ArithmeticException e) {
        //     System.out.println(e.getMessage());
        // }
    }
}
