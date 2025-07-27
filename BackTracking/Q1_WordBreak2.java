package BackTracking;

import java.util.ArrayList;
import java.util.Arrays;

public class Q1_WordBreak2 {


    public static  void solveWordBreak2(ArrayList<String> dict, String s, int idx, ArrayList<String> ds, ArrayList<String> res){

        System.out.println(dict+" "+idx+" "+ds);
        if(idx==s.length()){
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < ds.size(); i++) {
                sb.append(ds.get(i));
                if (i < ds.size() - 1) {
                    sb.append(" ");
                }
            }
            String temp = sb.toString();
            res.add(temp);
            return;
        }


        StringBuilder temp = new StringBuilder();
        for(int i=idx;i<s.length();i++){
            temp.append(s.charAt(i));
            if(dict.contains(temp.toString())){
                ds.add(temp.toString());
                solveWordBreak2(dict,s,i+1,ds,res);
                ds.remove(ds.size()-1);
            }
        }
    }

    public  static  String[] worldBreak(String[] dict, String s) {
        // code here

        ArrayList<String> res = new ArrayList<>();
        ArrayList<String> ds = new ArrayList<>();
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
        String[] dict = new String[]{"gee", "for", "geeks", "ks"};
        String s = "geeksforgeeks";
        worldBreak(dict,s);
    }
}
