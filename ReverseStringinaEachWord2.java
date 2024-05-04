public class ReverseStringinaEachWord2 {
    public static void main(String[] args) {

        String str = "Welcome To Java";
        String [] words = str.split("\\s");

        String reverseWord = "";
        for(String w:words)
        {
            StringBuilder sb=new StringBuilder(w);
            sb.reverse();
            reverseWord=reverseWord+sb.toString();

        }
        System.out.println(reverseWord);

    }
}
