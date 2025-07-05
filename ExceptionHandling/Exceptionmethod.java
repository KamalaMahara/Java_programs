
public class Exceptionmethod {

    public static void main(String[] args) {
        try {
            int result = 10 / 0; // This will cause ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }
}
