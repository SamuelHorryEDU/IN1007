public class Main {
    public static void main(String[] args) {
        int[] array = {1,2,1,3,3,1,1,10};

        int find = 1;
        int count = 0;
        for (int i=0; i<array.length; i++) {
            if (array[i] == find) {
                count++;
            }
        }
        System.out.println(count);
    }
}