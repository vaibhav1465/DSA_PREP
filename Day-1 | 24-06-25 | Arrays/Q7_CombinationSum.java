import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.Arrays;

public class Q7_CombinationSum {
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        HashMap<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < candidates.length; i++) {
            numMap.put(Integer.valueOf(candidates[i]), Integer.valueOf(i));
        }
        HashSet<String> finalResult = new HashSet<>();
        for (int i = 0; i < candidates.length; i++) {
            int remainder = target % candidates[i];
            int multiple = target / candidates[i];
            if (candidates[i] == target) {
                List<Integer> t1 = new ArrayList<>();
                t1.add(candidates[i]);
                result.add(t1);
            } else {
                System.out.println("-----start----------" + candidates[i] + "-----------------");
                if (remainder == 0) {
                    List<Integer> t1 = new ArrayList<>();
                    String t2 = "";
                    for (int j = 0; j < multiple; j++) {
                        t1.add(candidates[i]);
                        t2 += candidates[i];
                    }
                    if (!finalResult.contains(t2)) {
                        result.add(t1);
                        finalResult.add(t2);
                    }
                }
                int multipleCount = 1;
                int tempRemainder = 0;
                do {
                    tempRemainder = target - (candidates[i] * multipleCount);
                    System.out.println("--tempRemainder-------------" + tempRemainder + "-----------------");
                    if (numMap.get(tempRemainder) != null) {
                        List<Integer> t1 = new ArrayList<>();
                        String t2 = "";
                        for (int j = 0; j < multipleCount; j++) {
                            t1.add(candidates[i]);
                            t2 += candidates[i];
                        }
                        t1.add(tempRemainder);
                        t2 += tempRemainder;
                        char[] chars = t2.toCharArray();
                        Arrays.sort(chars);
                        String sorted = new String(chars);
                        System.out.println(sorted);
                        System.out.println(finalResult.contains(sorted));
                        if (!finalResult.contains(sorted)) {
                            result.add(t1);
                            finalResult.add(sorted);
                        }
                    }
                    multipleCount++;
                } while (tempRemainder > candidates[i]);
                System.out.println(result + " " + candidates[i]);
            }
        }

        return result;

    }

    public static void main(String[] args) {

        // Input: candidates = [2,3,6,7], target = 7
        // Output: [[2,2,3],[7]]
        // Explanation:
        // 2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple
        // times.
        // 7 is a candidate, and 7 = 7.
        // These are the only two combinations.
        // Example 2:

        // Input: candidates = [2,3,5], target = 8
        // Output: [[2,2,2,2],[2,3,3],[3,5]]
        // Example 3:

        // Input: candidates = [2], target = 1
        // Output: []

        int[] nums = { 2, 3, 5 };
        int target = 8;
        List<List<Integer>> result = combinationSum(nums, target);
        System.out.println("Result Index: " + result);
    }
}
