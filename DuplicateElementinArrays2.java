import java.util.HashSet;

public class DuplicateElementinArrays2{
    public static void mian(String[] args){

         String arr[]={"java", "python", "java"};

        HashSet<String> langs = new HashSet();

       /* System.out.println(langs.add("java"));
        System.out.println(langs.add("Python"));
        System.out.println(langs.add("java")); */

        for(String l:arr)
        {
            System.out.println( langs.add(l));

        }

    }
}
