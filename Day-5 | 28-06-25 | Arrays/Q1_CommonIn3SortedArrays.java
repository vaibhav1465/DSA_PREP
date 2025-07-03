import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Q1_CommonIn3SortedArrays {
    

//     vector<int> commonElements(vector<int> &arr1, vector<int> &arr2, vector<int> &arr3) 
// {
//     // Get the sizes of the three arrays
//     int n1 = arr1.size();
//     int n2 = arr2.size();
//     int n3 = arr3.size();

//     // Start from the beginning of each array
//     int i = 0, j = 0, k = 0;

//     // This will store the common elements we find
//     vector<int> ans;

//     // Keep going until we reach the end of any one array
//     while(i < n1 && j < n2 && k < n3)
//     {
//         // If the current elements in all three arrays are the same
//         if(arr1[i] == arr2[j] && arr2[j] == arr3[k])
//         {
//             // Make sure we don't add the same element twice
//             if(ans.empty() || ans.back() != arr1[i])
//                 ans.push_back(arr1[i]);  // Add the common element

//             // Move ahead in all three arrays since we found a match
//             i++;
//             j++;
//             k++;
//         }
//         else
//         {
//             // Find out which of the current values is the smallest
//             int mini = min({arr1[i], arr2[j], arr3[k]});

//             // Move forward in whichever array had the smallest value
//             // (Because that value can't be common if it's smaller than the others)
//             if(arr1[i] == mini) i++;
//             if(arr2[j] == mini) j++;
//             if(arr3[k] == mini) k++;
//         }
//     }

//     // Return the final list of common elements
//     return ans;
// }


    // Function to find common elements in three arrays.
    public static List<Integer> commonElements(List<Integer> arr1, List<Integer> arr2,
                                        List<Integer> arr3) {
        List<Integer> result = new ArrayList();


        HashSet<Integer> a1 = new HashSet<>();
        HashSet<Integer> a2 = new HashSet<>();

        for(int i=0;i<arr1.size();i++){
            a1.add(arr1.get(i));
        }
        for(int i=0;i<arr2.size();i++){
            a2.add(arr2.get(i));
        }

        int k =Integer.MIN_VALUE;
        for(int i=0;i<arr3.size();i++){
            int element = arr3.get(i);
            // System.out.println(element +"-------("+(k)+". "+i);
            if(k==element){
              continue;
            }
            System.out.println("after continue. "+i);
            if(a1.contains(element) && a2.contains(element)){
                result.add(element);
                k=element;
                // System.out.println("inside.  "+element);
            }
        }

        return result;
        
    }

    public static void main(String[] args) {

        // System.out.println();

        // Common in 3 Sorted Arrays

        // Note: can you handle the duplicates without using any additional Data Structure?
        // Examples :
        // Input: arr1 = [1, 5, 10, 20, 40, 80] , arr2 = [6, 7, 20, 80, 100] , arr3 = [3, 4, 15, 20, 30, 70, 80, 120]
        // Output: [20, 80]
        // Explanation: 20 and 80 are the only common elements in arr, brr and crr.
        // Input: arr1 = [1, 2, 3, 4, 5] , arr2 = [6, 7] , arr3 = [8,9,10]
        // Output: [-1]
        // Explanation: There are no common elements in arr, brr and crr.
        // Input: arr1 = [1, 1, 1, 2, 2, 2], B = [1, 1, 2, 2, 2], arr3 = [1, 1, 1, 1, 2, 2, 2, 2]
        // Output: [1, 2]
        // Explanation: We do not need to consider duplicates


        List<Integer> arr1 = new ArrayList<>(Arrays.asList(-942,-928,-924,-916,-913,-889,-879,-861,-858,-823,-809,-796,-782,-711,-705,-694,-693,-690,-689,-682,-678,-660,-577,-560,-556,-512,-511,-464,-451,-449,-449,-441,-429,-427,-420,-375,-374,-357,-352,-274,-260,-237,-227,-202,-186,-168,-162,-150,-148,-124,-124,-117,-114,-33,-33,-31,-25,-23,11,30,32,51,62,65,79,106,123,211,221,254,316,323,368,386,420,428,435,442,535,551,603,663,669,678,679,689,689,707,763,771,780,808,816,840,848,860,887,929,942,967));
        List<Integer> arr2 = new ArrayList<>(Arrays.asList(-970,-953,-948,-912,-903,-856,-846,-837,-827,-789,-780,-764,-760,-759,-710,-685,-664,-535,-528,-518,-499,-496,-492,-490,-465,-451,-439,-395,-390,-381,-379,-374,-371,-371,-312,-308,-305,-290,-287,-270,-243,-235,-233,-214,-162,-155,-99,-95,-87,-39,-6,-1,3,11,31,42,62,101,113,129,142,160,193,198,250,257,318,325,333,349,377,427,461,478,479,484,487,498,549,567,570,579,586,622,640,649,674,714,727,730,756,777,803,818,827,828,888,938,966));
        List<Integer> arr3 = new ArrayList<>(Arrays.asList(-999,-987,-969,-968,-959,-934,-928,-895,-881,-865,-863,-733,-707,-693,-642,-619,-578,-560,-552,-551,-546,-542,-533,-501,-486,-430,-413,-407,-396,-371,-331,-304,-268,-245,-233,-231,-188,-162,-162,-158,-153,-152,-115,-83,-73,-49,-34,-17,2,14,15,28,53,54,58,66,67,89,116,156,209,221,252,274,280,291,332,335,357,367,379,384,406,410,430,461,473,478,505,515,535,542,542,577,629,638,682,691,737,740,746,760,789,797,890,939,955,961,966,998));
        List<Integer> result = commonElements(arr1, arr2, arr3);
        System.out.println(result);
    }
}
