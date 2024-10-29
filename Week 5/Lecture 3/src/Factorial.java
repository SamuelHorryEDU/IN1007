public class Factorial {
    public static void hello(){
        System.out.println("hello");
    }
    public static long factorial(int numbers){
        long fact = 1;
        while(numbers > 0){
            fact *= numbers;
            numbers--;
        }
        hello();
        return fact;
    }
    public static void main(String[] args) {
        int[] numbers = {5,10,20};
        int i = 0;

        while(i < numbers.length){
            long fact = factorial(numbers[i]);
            System.out.println("The factorial of " + numbers[i] + " is " + fact);
            i++;
        }
    }
}
