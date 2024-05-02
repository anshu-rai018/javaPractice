import java.lang.reflect.Array;
import java.util.Arrays;

public class BubleSort {
    public static void main(String[] args) {

        int a[]={4,3,1,5,3};

        System.out.println("Before Sorting: " + Arrays.toString(a));

        int n=a.length;

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-1;j++){
                if(a[j]>a[j+1])
                {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println("After Sorting: " + Arrays.toString(a));
    }
}
