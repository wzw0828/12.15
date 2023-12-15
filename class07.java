public class class07 {
    public static void main(String[] args) {
        int[] arr = {4,12,87,21,6,18};
        int[] den = {2,0,7,0,61,0};
        double sum = 0.0;
        for (int i = 0; i <= 6; i++) {
            try {
                double result = (double) arr[i] / den[i];
                if (Double.isInfinite(result)) {
                    throw new ArithmeticException("除數為零");
                }
                sum += result;
                System.out.println("sum = " + sum);
            } 
            catch (ArithmeticException e) {
                System.out.println("捕捉到例外了: " + e.getMessage());
            } 
            catch (Exception e) {
                System.out.println("捕捉到例外了");
            }   
        }
    }
}
