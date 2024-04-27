public class SwapNumLogic4 {
    public static void main(String[] args) {
        int a = 10, b =  30;
        System.out.println("Before swappinng values are.."+a+" "+b);

        a = a^b;//
        b = a^b;
        a = a^b;

        System.out.println("After swappinng values are.."+a+" "+b);
    }
}
