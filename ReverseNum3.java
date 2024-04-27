import java.util.Scanner;

public class ReverseNum3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");

        int num = sc.nextInt();
        //used StrinBuilder class append  method
        StringBuilder sb1 = new StringBuilder();

        sb1.append(num);

        StringBuilder rev = sb1.reverse();

        System.out.println("Reversed number is: "+rev);
    }
}
