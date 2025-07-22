package Recursion;

public class Q2_ReverseAndPalindrome {

    public  static  boolean checkForPalindrome(int[] a,int n,int i){

        if(i>=n-1-i){
            return true;
        }
        if(a[i]!=a[n-1-i]){
            return false;
        }
        return checkForPalindrome(a,n,i+1);
    }

    public static void main(String[] args) {

        int[] a = new int[]{1,2,3,3,2,1};
        boolean result = checkForPalindrome(a,a.length,0);
        System.out.println(result);
    }
}
