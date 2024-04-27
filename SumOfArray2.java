public class SumOfArray2 {
    public static void main(String[] args){
        int a[] = {5,2,7,9,6};
        int sum = 0;
        for (int value : a){
            sum += value;
        }
        System.out.println("Sum of array is: " + sum);
    }
}
