public class EvenOddFromArrays2 {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6};

        System.out.println("Even number in array........");

        for(int value: a)
        {
            if(value%2==0)
                System.out.println(value);
        }

        System.out.println("Odd number in array.......");

        for(int vlaue:a)
        {
            if(vlaue%2!=0)
                System.out.print(vlaue);
        }

    }
}
