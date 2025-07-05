
public class ExceptionExample {

    public static void main(String[] args) {
        try {
            int result = 10 / 0; // This will cause ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Using toString(): " + e.toString());
            System.out.println("Printing object: " + e); // Also calls toString() implicitly
        }
    }
}
