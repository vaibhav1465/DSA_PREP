public class Q2_PalindromeString {

    public static  boolean isPalindrome(String s) {
        // code here

        String s1 ="";
        for(int i=s.length()-1;i>=0;i--){
           s1+=s.charAt(i);
        }
        System.out.println(s1);
        if(s1.equals(s)){
            return true;
        }else{
            return false;
        }


        //    int left = 0;
        // int right = s.length() - 1;

        // // Compare characters from both ends, moving toward the center.
        // while (left < right) {
        //     if (s.charAt(left) != s.charAt(right)) {
        //         return false; // Return false if mismatch is found.
        //     }
        //     left++;
        //     right--;
        // }
        // return true;
    }

    public static void main(String[] args) {
        
        String s = "abba";
        // char[] s1 = s.toCharArray();
        // reverseString(s1);
        // for(int i=0;i<s.length();i++){
        //     System.out.print(s1[i]);
        // }
       boolean result= isPalindrome(s);
       System.out.println(result);
    }
    
}