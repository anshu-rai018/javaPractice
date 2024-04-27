public class ReverseString3 {
    public static void main(String[] args){
        String str = "ABCD";
        String rev = "";

        StringBuffer sb = new StringBuffer(str);
        System.out.print(sb.reverse());
    }
}
