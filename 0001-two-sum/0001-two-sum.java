// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         for(int i = 0 ; i < nums.length ; i++){
//             for(int j = i + 1 ; j < nums.length ; j++){
//                 if(nums[i] + nums[j] == target){
//                     return new int[]{i,j};
//                 }
//             }
//         }
//         return new int[]{};
//     }
// }

// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         Arrays.sort(nums);
//         int left = 0;
//         int right = nums.length - 1;
//         while(left < right){
//             int sum = nums[left] + nums[right];
//             if(sum < target){
//                 left++;
//             }
//             else if(sum > target){
//                 right--;
//             }
//             else{
//                 return new int[]{left, right};
//             }
//         }
//         return new int[]{};
//     }
// }

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++){
            int needed = target - nums[i];
            if(map.containsKey(needed)){
                return new int[]{map.get(needed) , i};
            }
            map.put(nums[i] , i);
        }
        return new int[]{};
    }
}