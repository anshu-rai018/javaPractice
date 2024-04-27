import java.util.Scanner;

public class LargestOf3Number1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the First number: ");
        int a = sc.nextInt();

        System.out.print("Enter the Second number: ");
        int b = sc.nextInt();

        System.out.print("Enter the Third number: ");
        int c = sc.nextInt();

        int largest1  = a>b ? a : b;
        int largest2  = largest1>c ? a : largest1;

        System.out.println(largest2 + "is largest number");
    }
}
