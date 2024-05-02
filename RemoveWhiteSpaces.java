public class RemoveWhiteSpaces {
    public static void main(String[] args) {

        String str = "This   is   a   test";

        str = str.replaceAll("\\s+", " ");
        System.out.println(str);
    }
}
