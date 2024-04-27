public class SwapNumLogic3 {
    public static void main(String[] args) {
        int a = 10,b = 20;
        System.out.println("Before swappinng values are.."+a+" "+b);

        a = a*b;//a=200
        b = a/b;//b=10
        a = a/b;//a=200/10=20

        System.out.println("After swappinng values are.."+a+" "+b);
    }
}
