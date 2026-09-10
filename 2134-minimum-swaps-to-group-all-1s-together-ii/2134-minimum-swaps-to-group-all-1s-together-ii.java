// class Solution {
//     public int minSwaps(int[] nums) {
//         int n = nums.length;
//         int count = 0;
//         int ans = Integer.MAX_VALUE;
//         for(int i = 0 ; i < n ; i++){
//             if(nums[i] == 1){
//                 count++;
//             }
//         }
//         if(count == 0 || count == 1){
//             return 0; // no swap will be needed
//         }

//         // now the number of 1's that i got in the array will be my window size here
//         for(int i = 0 ; i < n  ; i++){
//             int oneCount = 0;
//             for(int j = i ; j < i + count ; j++){
//                 if(nums[j % n] == 1){
//                     oneCount++;
//                 }
//             }
//             int swaps = count - oneCount;
//             ans = Math.min(ans,swaps);
//         }
//         return ans;
//     }
// }

class Solution {
    public int minSwaps(int[] nums) {
        int n = nums.length;
        int count = 0;
        int ans = Integer.MAX_VALUE;
        int left = 0;
        for(int i = 0 ; i < n ; i++){
            if(nums[i] == 1){
                count++;
            }
        }
        if(count == 0 || count == 1){
            return 0; // no swap will be needed
        }
        int oneCount = 0;
        // NOw the count will be the window size here
        for(int right = 0 ; right < n + count - 1; right++){
            if(nums[right % n] == 1){
                oneCount++;
            }
            if(right - left + 1 > count){
                if(nums[left] == 1){
                    oneCount--;
                }
                left++;
            }
            if(right - left + 1 == count){
                int swaps = count - oneCount;
                ans = Math.min(swaps,ans);
            }
        }
        return ans;
    }
}