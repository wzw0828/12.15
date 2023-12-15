import java.util.Scanner;

class IntegerLessThanZero extends Exception {
    public IntegerLessThanZero(String message) {
        super(message);
    }
}
class IntegerGreaterThanZero extends Exception {
    public IntegerGreaterThanZero(String message) {
        super(message);
    }
}
class IntegerEqualToZero extends Exception {
    public IntegerEqualToZero(String message) {
        super(message);
    }
}
public class class17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("請輸入一整數: ");
            int input = scanner.nextInt();
            checkInteger(input);
        } 
        catch (IntegerLessThanZero e) {
            System.out.println(e.getMessage() + " 0");
        } 
        catch (IntegerGreaterThanZero e) {
            System.out.println(e.getMessage() + " 0");
        } 
        catch (IntegerEqualToZero e) {
            System.out.println(e.getMessage());
        }
        scanner.close();
    }

    static void checkInteger(int value) throws IntegerLessThanZero, IntegerGreaterThanZero, IntegerEqualToZero {
        if (value < 0) {
            throw new IntegerLessThanZero("您輸入的整數的值小於");
        } else if (value > 0) {
            throw new IntegerGreaterThanZero("您輸入的整數的值大於");
        } else {
            throw new IntegerEqualToZero("您輸入的整數的值為"+value);
        }
    }
}
