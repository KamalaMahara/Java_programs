
public class finallyDemo {

    public static void main(String[] args) {
        try {
            System.out.println("Inside try block");
            int result = 10 / 0; // This will throw ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Caught exception: " + e.getMessage());
        } finally {
            System.out.println("This will always execute");
        }
    }
}
