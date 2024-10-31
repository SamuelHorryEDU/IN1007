public class Exercise5 {
    public static int arithmetic(int[] array) {
        int i = 0;
        int n = 0;
        while(i <= (array.length - 1)){
            n = n + array[i];
            i++;
        }
        return n/2;
    }
    public static int geometric(int[] array) {
        int i = 0;
        int n = 0;
        while(i <= (array.length - 1)){
            n = n + array[i];
            i++;
        }
        return (int) Math.sqrt(n);
    }
    public static void main(String[] args) {
        int[] array = {1,1};
        System.out.println(array.length);
        if (arithmetic(array) > geometric(array)) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}