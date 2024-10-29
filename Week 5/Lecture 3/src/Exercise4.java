public class Exercise4 {
    public static int product(int n){
        if (n > 0) {
            int product = 1;
            for (int i = 1; i <= n; i++) {
                product *= i;
            }
            return product;
        }
        else if (n < 0) {
            int product = 1;
            for (int i = n; i <= -1; i++) {
                product *= i;
            }
            return product;
        }
        else {
            return 0;
        }
    }
    public static void main(String[] args) {
        int n = -5;
        System.out.println("Product up to " + n + " = " + product(n));
    }
}
