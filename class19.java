import java.util.Scanner;

class ArgumentOutOfBound extends Exception {
    public ArgumentOutOfBound(String message) {
        super(message);
    }
}
public class class19 {
    public static void main(String[] args) {
        try {
            int n = getInput();
            if (n <= 1) {
                throw new ArgumentOutOfBound("輸入參數必須大於1");
            }
            boolean isPrime = prime(n);
            if (isPrime) {
                System.out.println(n + " 是質數");
            } else {
                System.out.println(n + " 不是質數");
            }
        } catch (ArgumentOutOfBound e) {
            System.out.println("ArgumentOutOfBound: " + e.getMessage());
        }
    }
    static int getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入一個整數: ");
        int n = scanner.nextInt();
        scanner.close();
        return n;
    }
    static boolean prime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
