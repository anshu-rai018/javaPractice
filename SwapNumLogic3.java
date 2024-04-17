public class SwapNumLogic3 {
    public static void main(String[] args) {
        int a = 10,b = 20;
        System.out.println("Before swappinng values are.."+a+" "+b);

        a = a*b;//using multi and div opreation
        b = a/b;
        a = a/b;

        System.out.println("After swappinng values are.."+a+" "+b);
    }
}
