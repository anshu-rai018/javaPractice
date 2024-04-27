import java.util.Scanner;

public class LargestOf3Number2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the First nuber: ");
        int a = sc.nextInt();
        System.out.println("Enter the Second nuber: ");
        int b = sc.nextInt();
        System.out.println("Enter the Third nuber: ");
        int c = sc.nextInt();

        int largest = c>(a>b?a:b)?c:(a>b?a:b);
        System.out.println("The largest number is "+largest);
    }
}
