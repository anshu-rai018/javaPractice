public class SwapNumLogic1 {
    public static void main(String[] args){
        int a = 20, b = 40;
        System.out.println("before swapping value are.."+a+" "+b);
        int  temp = a;//using third variable
         a = b;
         b = temp;
        System.out.println("after swapping value are.."+a+" "+b);

    }
}


