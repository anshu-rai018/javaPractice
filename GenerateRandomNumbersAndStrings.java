import java.util.Random;

public class GenerateRandomNumbersAndStrings {
    public static void main(String[] args){
        Random rand = new Random();

       int rand_int= rand.nextInt(1000000);
       System.out.println(rand_int);

       double rand_double = rand.nextInt(1000000);
       System.out.println(rand_double);
    }
}
