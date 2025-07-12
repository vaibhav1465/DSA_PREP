public class Q5_ShuffledSubstringOfAnotherString {

    public  static boolean validShuffledSubstring(String s1,String s2){


        return false;
    }
    public static void main(String[] args) {
        

        String s1 = "abcd";
        String s2 = "cdab";
        boolean result = validShuffledSubstring(s1, s2);
        System.out.println(result);
    }
}
