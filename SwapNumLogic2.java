public class SwapNumLogic2 {
    public static void main(String[] args){
        int a = 20, b = 50;

        System.out.println("Before swappinng values are.."+a+" "+b);
        a = a + b;//using add and sub opration
        b = a - b;
        a = a - b;

        System.out.println("After swappinng values are.."+a+" "+b);
    }

}
