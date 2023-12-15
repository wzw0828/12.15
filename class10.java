public class class10 {
    public static void main(String[] args) {
        try {
            Test.test(9, 0);
        } catch (ArithmeticException e) {
            System.out.println("捕捉到 ArithmeticException 例外: " + e.getMessage());
        }
    }
}
class Test {
    static void test(int num, int den) {
        System.out.println(num + "/" + den + "=" + num / den);
    }
}
