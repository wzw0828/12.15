public class class03 {
    public static void main(String[] args) {
        int num = 12;
        int den = 0;
        try {
            if (den == 0) {
                throw new ArithmeticException("Division by zero is not allowed");
            } 
            else {
                int ans = num / den;
                System.out.println("Result: " + ans);
            }
        } 
        catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        } 
        finally {
            System.out.println("Finally block executed");
        }
    }
}
