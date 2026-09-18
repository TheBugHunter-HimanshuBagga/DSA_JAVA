// class Solution {
//     public int[] searchRange(int[] nums, int target) {
//         int[] list = new int[2];
//         Arrays.fill(list, -1);
//         int count = 0;
//         for(int i = 0 ; i < nums.length ; i++){
//             if(nums[i] == target){
//                 list[count] = i;
//                 count++;
//                 break;
//             }
//         }
//         for(int j = nums.length - 1; j >= 0 ; j--){
//             if(nums[j] == target){
//                 list[count] = nums.length - 1 - j + j - 1; // 6 - 1 
//                 break;
//             }
//         }

        
//         return list;
//     }
// }

class Solution {
    public int[] searchRange(int[] nums, int target) {
        // O log n
        // Binary Search
        int[] result = {-1,-1};
        int left = 0;
        int right = nums.length - 1;
        while(left <= right){
            int middle = left + (right - left)/2;
            if(nums[middle] == target){
                result[0] = middle;
                right = middle - 1;
            }
            else if(nums[middle] > target){
                right = middle - 1;
            }
            else {
                left = middle + 1;
            }
        }
        
        left = 0;
        right = nums.length - 1;
        while(left <= right){
            int middle = left + (right - left)/2;
            if(nums[middle] == target){
                result[1] = middle;
                left = middle + 1;
            }
            else if(nums[middle] > target){
                right = middle - 1;
            }
            else {
                left = middle + 1;
            }
        }
        return result;
    }
}