public class Q7_LongestPalindromeSubstring {

    public static String palindromicSubString(String s) {

        int l = s.length();
        int max = 0;
        int subringIndexStart = -1;
        int subringIndexEnd = -1;


        for (int i = 0; i < l; i++) {
            // System.out.println(i);
            int x = i - 1;
            int y = i + 1;
            while (x >= 0 && y < l && s.charAt(x) == s.charAt(y)) {
                // System.out.println("11111111111111--------"+s.substring(x, y));
                if (max < y - x + 1) {
                    max = y - x + 1;
                    subringIndexStart = x;
                    subringIndexEnd = y;
                }
                x--;
                y++;
            }

            if (i + 1 < l && s.charAt(i) == s.charAt(i + 1)) {
                if (max < 2) {
                    max = 2;
                    subringIndexStart = i;
                    subringIndexEnd = i + 1;
                }

                x = i-1;
                y = i + 2;
                while (x >= 0 && y < l && s.charAt(x) == s.charAt(y)) {
                    // System.out.println("3333333333--------"+s.substring(x, y+1));
                    if (max < y - x + 1) {
                        max = y - x + 1;
                        subringIndexStart = x;
                        subringIndexEnd = y;
                    }
                    x--;
                    y++;
                }

            }
        }


        if(subringIndexStart !=-1 && subringIndexEnd!=-1){
        return s.substring(subringIndexStart, subringIndexEnd+1);
        }else{
            return s.substring(0, 1);
        }
    }

    public static void main(String[] args) {
        // St, your task is to find the longest palindromic substring within s.
        // A subring[] args) {
        // Given a string sstring is a contiguous sequence of characters within a
        // string, defined as s[i...j] where 0 ≤ i ≤ j < len(s).
        // A palindrome is a string that reads the same forward and backward. More
        // formally, s is a palindrome if reverse(s) == s.
        // Note: If there are multiple palindromic substrings with the same length,
        // return the first occurrence of the longest palindromic substring from left to
        // right.
        // Examples :
        // Input: s = “forgeeksskeegfor”
        // Output: “geeksskeeg”
        // Explanation: There are several possible palindromic substrings like “kssk”,
        // “ss”, “eeksskee” etc. But the substring “geeksskeeg” is the longest among
        // all.
        // Input: s = “Geeks”
        // Output: “ee”
        // Explanation: "ee" is the longest palindromic substring of "Geeks".
        // Input: s = “abc”
        // Output: “a”
        // Explanation: "a", "b" and "c" are longest palindromic substrings of same
        // length. So, the first occurrence is returned.
        String s = "“Geeks”";
        String result =palindromicSubString(s);
        System.out.println(result);
    }
}
