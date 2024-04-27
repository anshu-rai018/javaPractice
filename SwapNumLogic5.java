public class SwapNumLogic5 {
    public static void main(String[] args) {
        int a = 10 , b = 20;
        System.out.println("After swappinng values are.."+a+" "+b);
        b = a+b - (a=b);//b=30-20=10;a=20;
        System.out.println("After swappinng values are.."+a+" "+b);

    }
}
