public class Q4_StringsRotationsOfEachOther {

    public static boolean areRotations(String s1, String s2) {
        // code here

        // for(int i=0;i<s1.length();i++){
        //     String temp = s1.substring(1) + s1.charAt(0);
        //     if(s2.equals(temp)){
        //         return true;
        //     }
        //     s1=temp;
        // }

        // return false;

        return (s1.length() == s2.length()) && ((s1 + s1).contains(s2));

    }

    public static void main(String[] args) {

        // Input: s1 = "abcd", s2 = "cdab"
        // Output: true
        // Explanation: After 2 right rotations, s1 will become equal to s2.
        // Input: s1 = "aab", s2 = "aba"
        // Output: true
        // Explanation: After 1 left rotation, s1 will become equal to s2.
        // Input: s1 = "abcd", s2 = "acbd"
        // Output: false
        // Explanation: Strings are not rotations of each other

        String s1 = "abcd";
        String s2 = "cdab";
        boolean result = areRotations(s1, s2);
        System.out.println(result);
    }
}