public class FactorialNumbers2 {
    public static void main(String[] args){

        int num = 5;

        long factorial = 1;
        for(int i = num;i >= 1;i--){
            factorial *= i;
        }
        System.out.println("Factorial of " + num + " is " + factorial);

    }
}
