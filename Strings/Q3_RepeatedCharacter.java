import java.util.Arrays;

public class Q3_RepeatedCharacter {

    public static char firstRep(String s ) {
        // your code here

        int n=s.length();
        char ans = '#';
        int pos = n+1;
        int[] all = new int[26];
        Arrays.fill(all, n+2);

        for(int i=0;i<n;i++){
            if(all[s.charAt(i)-'a']<pos){
              pos=all[s.charAt(i)-'a'];
              ans=s.charAt(i);
            }
            all[s.charAt(i)-'a']=i;
        }
        return ans;
    }
    public static void main(String[] args) {
        
        String s = "vaibhavkaushal";
        char s1 = firstRep(s);
        System.out.println(s1);
    }
}
