public class Quiz{
    public static void main(String[] args){
        int x = 1;
        int[] t = new int[] {0,0,0,0};
        update(t,x);
        System.out.print(x + "," + t[0]);
    }
    public static void update(int[] t, int x){
        x++;
        t[0] = x;
        t = new int[] {4,4,4};
    }
}
