public class SwapNumLogic2 {
    public static void main(String[] args){
        int a = 20, b = 50;

        System.out.println("Before swappinng values are.."+a+" "+b);
        a = a + b;//a=70
        b = a - b;//b=70-50=20
        a = a - b;//a=70-20=50

        System.out.println("After swappinng values are.."+a+" "+b);
    }

}
