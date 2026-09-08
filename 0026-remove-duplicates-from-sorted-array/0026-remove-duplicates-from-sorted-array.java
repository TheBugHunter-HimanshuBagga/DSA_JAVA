import java.util.*;

// class Solution {
//     public int removeDuplicates(int[] nums) {
//         // return k -> number of uunique elements
//         int n = nums.length;
//         List<Integer> result = new ArrayList<>();
//         for(int i = 0 ; i < n ; i++){
//             if(!result.contains(nums[i])){
//                 result.add(nums[i]);
//             }
//             for(int k = 0;k<result.size();k++){
//                 nums[k] = result.get(k);
//             }
//         }
//         return result.size();
//     }
// }


// class Solution {
//     public int removeDuplicates(int[] nums) {

//         Set<Integer> set = new LinkedHashSet<>();

//         for(int num : nums){
//             set.add(num);
//         }

//         int i = 0;

//         for(int num : set){
//             nums[i++] = num;
//         }

//         return set.size();
//     }
// }

class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
                nums[count] = nums[i];
                count++;
            }
        }

        return count;
    }
}