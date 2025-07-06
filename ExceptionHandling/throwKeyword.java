
public class throwKeyword {

    static void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be at least 18");
        }
        System.out.println("Access granted – you’re old enough!");
    }

    public static void main(String[] args) {
        checkAge(16); // This will throw an exception
    }
}
