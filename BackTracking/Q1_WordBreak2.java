package BackTracking;

import java.util.ArrayList;
import java.util.Arrays;

public class Q1_WordBreak2 {


    public static  void solveWordBreak2(ArrayList<String> dict, String s, int idx, StringBuilder ds, ArrayList<String> res){

        System.out.println(dict+" "+idx+" "+ds);
        if(idx==s.length()){
            System.out.println(ds);
            res.add(new String(ds));
            return;
        }

        StringBuilder temp = new StringBuilder();
        for(int i=idx;i<s.length();i++){
            temp.append(s.charAt(i));
            if(dict.contains(temp.toString())){
                ds.append(temp+" ");
                System.out.println(idx+"---"+(i+1));
                solveWordBreak2(dict,s,i+1,ds,res);
                System.out.println(idx+"---"+(i+2));
                ds.delete(idx,i+2);
            }
        }
    }

    public  static  String[] worldBreak(String[] dict, String s) {
        // code here

        ArrayList<String> res = new ArrayList<>();
        StringBuilder ds = new StringBuilder();
        ArrayList<String> dicts = new ArrayList<>(Arrays.asList(dict));
        solveWordBreak2(dicts,s,0,ds,res);
        String[] result = new String[res.size()];
        int i=0;
        System.out.println();
        System.out.println();
        System.out.println("final");
        for(String a : res){
            System.out.println(a);
            result[i++]=a;
        }
        return result;

    }

    public static void main(String[] args) {


//        Examples:
//        Input: s = "likegfg", dict[] = ["lik", "like", "egfg", "gfg"]
//        Output:
//        "lik egfg"
//        "like gfg"
//        Explanation: All the words in the given sentences are present in the dictionary.
//        Input: s = "geeksforgeeks", dict[] = ["for", "geeks"]
//        Output: "geeks for geeks"
//        Explanation: The string "geeksforgeeks" can be broken into valid words from the dictionary in one way.
//
        String[] dict = new String[]{"lik", "for", "geeks", "gfg"};
        String s = "geeksforgeeks";
        worldBreak(dict,s);
    }
}
