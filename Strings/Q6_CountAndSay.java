public class Q6_CountAndSay {
    
   public static String rle(String temp,int v,int n){

    String s1 ="";
    char t = temp.charAt(0);
    int count =0;
    // System.out.println(temp+"-----"+v);
    for(int i=0;i<temp.length();i++){
        if(t==temp.charAt(i)){
          count++;
        }else{
            s1=s1+count+t;
            // System.out.println(s1);
            t=temp.charAt(i);
            count=1;
        }
    }
    if(v==n){
        return s1+count+t;
    }
    return rle(s1+count+t, v+1, n);
   }

    public static String countAndSay(int n) {
        if(n==1){
            return "1";
        }
        return rle("1", 2, n);
    }

    public static void main(String[] args) {
     
            // The count-and-say sequence is a sequence of digit strings defined by the recursive formula:
            // countAndSay(1) = "1"
            // countAndSay(n) is the run-length encoding of countAndSay(n - 1).
            // Run-length encoding (RLE) is a string compression method that works by replacing consecutive identical characters (repeated 2 or more times) with the concatenation of the character and the number marking the count of the characters (length of the run). For example, to compress the string "3322251" we replace "33" with "23", replace "222" with "32", replace "5" with "15" and replace "1" with "11". Thus the compressed string becomes "23321511".
            // Given a positive integer n, return the nth element of the count-and-say sequence.
            // Input: n = 4
            // Output: "1211"
            // Explanation:
            // countAndSay(1) = "1"
            // countAndSay(2) = RLE of "1" = "11"
            // countAndSay(3) = RLE of "11" = "21"
            // countAndSay(4) = RLE of "21" = "1211"
            // Example 2:
            // Input: n = 1
            // Output: "1"
            // Explanation:
            // This is the base case.

            String result = countAndSay(6);
            System.out.println(result);
    }
}
