public class Exercise3 {
    public static int calc(int n){
        if (n > 0) {
            return n * (n+1) / 2;
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args) {
        int n = 8;
        System.out.println("Sum up to " + n + " = " + calc(n));
    }
}
