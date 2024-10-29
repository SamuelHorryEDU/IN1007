public class Exercise2 {
    public static int arithmetic(int a, int b) {
        return (a + b)/2;
    }
    public static int geometric(int a, int b) {
        return (int) Math.sqrt(a*b);
    }
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        if (arithmetic(a,b) > geometric(a,b)) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}
