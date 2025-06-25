public class Q4_ReverseString {
    
    public static void main(String[] args) {
      
        String s = "vaibhav";
        char[] s1 = s.toCharArray();
        s="";
        for(int i=s1.length-1;i>=0;i--){
            s+=s1[i];
        }
        System.out.println(s);
    }
}
