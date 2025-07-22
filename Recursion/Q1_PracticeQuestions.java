package Recursion;

public class Q1_PracticeQuestions {
    public static void print1ToN(int s, int e){
        if(s==e){
            System.out.println(s);
            return;
        }
        System.out.println(s);
        print1ToN(s+1,e);
    }
    public static void printNTo1(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printNTo1(n-1);
    }
    public static void print1ToNBackTracking(){

    }
    public static void printNToNBackTracking(){

    }
    public static void main(String[] args) {
        // Recursion


        // reverse a array
        // check if array is palindrome

        // Print all subsequennce of array
        // Print one subsquence of array
        // Count all subsequennce of array

        // merge sort
        // quick Sort

        // combination sum 1
        // combination sum 2

        // subset sum 2 2

        int n = 6;
//        print1ToN(1,n);

        printNTo1(n);
    }
}
