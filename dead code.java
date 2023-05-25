public class DeadCodeExample {
    public static void main(String[] args) {
        int x = 10;

        if (x > 5) {
            System.out.println("x is greater than 5");
        } else {
            System.out.println("x is less than or equal to 5");
        }

        // This line of code is dead code because it is never executed
        System.out.println("This line of code is unreachable.");
    }
}
