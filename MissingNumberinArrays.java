public class MissingNumberinArrays {
    public static void main(String[] args) {

        int a[] = {1,2,4,5};

        int sum1 = 0;

        for(int i =0; i<a.length; i++){
            sum1 += a[i];
        }
        System.out.println("sum of elements in arrays:" +sum1);

        int sum2 = 0;
        for(int i =0; i<a.length; i++){
            sum2 += a[i];
        }

        System.out.println("sum of range elements in arrays:" +sum2);
        System.out.println("Missing Number is : "+ (sum1-sum2));

    }
}