// class Solution {
//     public boolean containsDuplicate(int[] nums) {
//         // nums = [1,2,3,1]
//         // since 1 appears twice return true here 
//         int n = nums.length;
//         int count = 0;
//         for(int i=0;i<n;i++){
//             for(int j = i + 1 ; j < n ; j++){
//                 if(nums[i] == nums[j]){ // if same increase the count 
//                     count++;
//                 }
//                 // else do nothing
//             }
//         }
//         if(count > 0){
//             return true;
//         }
//         return false;
//     }
// }

// class Solution {
//     public boolean containsDuplicate(int[] nums) {
//         // nums = [1,2,3,1]
//         // since 1 appears twice return true here 
//         int n = nums.length;
//         for(int i=0;i<n;i++){
//             for(int j = i + 1 ; j < n ; j++){
//                 if(nums[i] == nums[j]){ // if same increase the count 
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
// }

// class Solution {
//     public boolean containsDuplicate(int[] nums) {
//         int n = nums.length;
//         for(int i = 0 ; i < n ; i++){
//             for(int j = i+1 ; j < n ; j++){
//                 if(nums[i] == nums[j]){
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
// }

class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        for(int i =0 ; i < n ; i++){
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }
}