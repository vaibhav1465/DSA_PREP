package Recursion;

import java.util.ArrayList;

public class Q3_PrintAllSubsequenceOfArray {
    public static void printAllSubsequenceOfArray(ArrayList<ArrayList<Integer>> res,int[] a,int ind,ArrayList<Integer> helper){

        if(ind >= a.length){
            res.add(new ArrayList<>(helper));
//            System.out.println("here--------------------"+res+"---"+ind);
            return;
        }

        // Pick value at idx
        helper.add(a[ind]);
//        System.out.println(helper+"----------"+ind);
        printAllSubsequenceOfArray(res,a,ind+1,helper);

//        System.out.println(ind);
        // remove value for futher
        helper.remove(helper.size()-1);

//        System.out.println(helper+"----after remove------"+ind);

        // Not pick value at x
        printAllSubsequenceOfArray(res,a,ind+1,helper);
    }
    public static boolean printOneSubsequenceOfArray(ArrayList<Integer> res,int[] a,int ind,ArrayList<Integer> helper){

        if(ind >= a.length){
            res.addAll(helper);
            return true;
        }
        // Pick value at idx
        helper.add(a[ind]);

        if(printOneSubsequenceOfArray(res,a,ind+1,helper) == true){
            return true;
        };

        // remove value for futher
        helper.remove(helper.size()-1);

        // Not pick value at x
        if(printOneSubsequenceOfArray(res,a,ind+1,helper)==true){
            return true;
        }
        return false;
    }
    public static int countAllSubsequenceOfArray(int[] a,int ind, ArrayList<Integer> helper){

        if(ind >= a.length){
            return 1;
        }

        // Pick value at idx
        helper.add(a[ind]);
//        System.out.println(helper+"----------"+ind);
        int count1 = countAllSubsequenceOfArray(a,ind+1,helper);

//        System.out.println(ind);
        // remove value for futher
        helper.remove(helper.size()-1);

//        System.out.println(helper+"----after remove------"+ind);

        // Not pick value at x
        int count2 = countAllSubsequenceOfArray(a,ind+1,helper);
        return count1+count2;
    }
    public static void main(String[] args) {

        int[] a = new int[]{1,2,3};
//
//        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        ArrayList<Integer> helper =new ArrayList<>();
//        printAllSubsequenceOfArray(result,a,0,helper);
//        System.out.println(result);


//        ArrayList<Integer> result2 = new ArrayList<>();
//        printOneSubsequenceOfArray(result2,a,0,helper);
//        System.out.println(result2);
//
        int result3 = countAllSubsequenceOfArray(a,0,helper);
        System.out.println(result3);

    }
}
