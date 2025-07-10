public class Q1_ReverseString {
    public static void reverseString(char[] s) {
        
        int n=s.length;
        for(int i=0;i<n/2;i++){
            char temp = s[i];
            s[i]=s[n-1-i];
            s[n-1-i]=temp;
        }
    }
    public static void main(String[] args) {
        
        String s = "vaibhavKaushal";
        char[] s1 = s.toCharArray();
        reverseString(s1);
        for(int i=0;i<s.length();i++){
            System.out.print(s1[i]);
        }
        System.out.println();

    }
}
