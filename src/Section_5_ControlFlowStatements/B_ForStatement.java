package Section_5_ControlFlowStatements;

public class B_ForStatement {
    public static void main(String[] args) {
        System.out.println("10,000 at 2% interest  = " + calculateInterest(10000, 2));

        for (int i = 0; i < 5; i++) {
            System.out.println("loop" + i + "hello");
        }
        for (int i = 2; i < 9; i++) {
            System.out.println("10000 at" + i + "% interest = " + String.format("%.2f", calculateInterest(10000, i)));
        }
        System.out.println("---------------------------------------------");

        for (int i = 8; i >= 2; i--) {
            System.out.println("10000 at" + i + "% interest = " + String.format("%.2f", calculateInterest(10000, i)));
        }
        System.out.println("---------------------------------------------");

        int count = 0;
        for (int i = 10; i < 50; i++) {
            if (isPrime(i)) {
                count++;
                System.out.println("number" + i + " is a prime number");
                if (count == 10) {
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }

    }

    private static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i < (long) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}
