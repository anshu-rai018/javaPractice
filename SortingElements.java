import java.util.Arrays;

public class SortingElements {
    public static void main(String[] args) {

        int a[] = {30,50,20,10,60};

        System.out.println("Array before sorting:"+ Arrays.toString(a));
        Arrays.parallelSort(a);// sort // collection and reversorder
        System.out.println("Array after sorting:"+ Arrays.toString(a));
    }
}
