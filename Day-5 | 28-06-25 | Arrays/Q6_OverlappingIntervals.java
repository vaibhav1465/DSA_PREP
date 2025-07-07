import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Q6_OverlappingIntervals {
    public static List<int[]> mergeOverlap2(int[][] arr) {
        // Code here

        ArrayList<Integer> a1 = new ArrayList<>();

        List<int[]> result = new ArrayList<>();

        HashSet<Integer> st = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            a1.add(arr[i][0]);
            st.add(arr[i][0]);
            a1.add(arr[i][1]);
        }
        Collections.sort(a1);
        // System.out.println(a1);

        int k = 0;
        int firstEle = -1;
        System.out.println(st);
        for (int i = 0; i < a1.size(); i++) {
            int ele = a1.get(i);
            System.out.println("ele  ---"+ele);
            if (st.contains(ele)) {
                if (k + 1 == 2) {
                    result.add(new int[] { firstEle, a1.get(i - 1) });
                    k = 0;
                } else {
                    firstEle = ele;
                    k++;
                }
            }
        }
        return result;

    }


      static List<int[]> mergeOverlap3(int[][] arr) {
        int n = arr.length;

        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> res = new ArrayList<>();

        // Checking for all possible overlaps
        for (int i = 0; i < n; i++) {
            int start = arr[i][0];
            int end = arr[i][1];

            // Skipping already merged intervals
            if (!res.isEmpty() && res.get(res.size() - 1)[1] >= end) {
                continue;
            }

            // Find the end of the merged range
            for (int j = i + 1; j < n; j++) {
                if (arr[j][0] <= end) {
                    end = Math.max(end, arr[j][1]);
                }
            }
            res.add(new int[]{start, end});
        }
        return res;
    }

    public static List<int[]> mergeOverlap(int[][] arr) {
        // Code here
        
        List<int[]> result = new ArrayList<>();

        Arrays.sort(arr,(a,b)->Integer.compare(a[0],b[0]));

        
        int start = arr[0][0];
        int end = arr[0][1];
        int intervals = 0;
        result.add(new int[]{start,end});
        for (int i = 1; i < arr.length; i++) {
            int newStart = arr[i][0];
            int newEnd = arr[i][1];
            if(newStart <= end){
                end = Math.max(end, newEnd);
                int[] temp= result.get(intervals);
                temp[1]=end;
                result.set(intervals, temp);
            }else{
                start = newStart;
                end = newEnd;
                result.add(new int[]{start,end});
                intervals++;
            }
       }
        return result;

    }

    public static void main(String[] args) {

        // Merge Overlapping Intervals
        // Input: arr[][] = [[1,3],[2,4],[6,8],[9,10]]
        // Output: [[1,4], [6,8], [9,10]]
        // Explanation: In the given intervals we have only two overlapping intervals
        // here, [1,3] and [2,4] which on merging will become [1,4]. Therefore we will
        // return [[1,4], [6,8], [9,10]].
        // Input: arr[][] = [[6,8],[1,9],[2,4],[4,7]]
        // Output: [[1,9]]
        // Explanation: In the given intervals all the intervals overlap with the
        // interval [1,9]. Therefore we will return [1,9].

        int[][] nums = new int[][] { { 1, 3 }, { 2, 4 },{10,19},{1,5}, { 6, 8 }, { 9, 10 } };
        List<int[]> result = mergeOverlap(nums);
        for (int i = 0; i < result.size(); i++) {
            int[] temp = result.get(i);
            for (int j = 0; j < temp.length; j++) {
                System.out.print(temp[j] + ",");
            }
            System.out.println();
        }
    }
}
