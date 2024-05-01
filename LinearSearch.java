public class LinearSearch {
    public static void main(String[] args) {

        int a[] = {10,20,40,50,30};

        int search_ele = 50;
        boolean flage = false;

        for(int i = 0; i<a.length; i++)
        {
         if(a[i] == search_ele)
             System.out.println("Element found at index " + i);
            flage = true;
            break;
        }

        System.out.println("Element not found");
    }
}
