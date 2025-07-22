package Recursion;

import java.util.Arrays;

import static java.util.Collections.swap;

public class Q2_ReverseAndPalindrome {

    public  static  void reverse(int[] a,int n,int i){

        if(i>=n-1-i){
            return;
        }
        //swap
        int temp = a[i];
        a[i]=a[n-1-i];
        a[n-1-i]=temp;

        reverse(a,n,i+1);
    }

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

        int[] a = new int[]{1,2,3,3,2,1,3,4,5};

        reverse(a,a.length,0);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();

//        boolean result = checkForPalindrome(a,a.length,0);
//        System.out.println(result);
    }
}
