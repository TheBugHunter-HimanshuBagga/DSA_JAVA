// class Solution {
//     public long maximumSubarraySum(int[] nums, int k) {   "TLE"
//         /* 
//             nums = [1,5,4,2,9,9,9], k = 3
//         */
//         int n = nums.length;

//         // k is the  lwnght  of the subarray
//         long maxSum = 0;
//         for(int start = 0 ; start <= n - k ; start++){ // TC -> 0(n)
//             HashSet<Integer> set = new HashSet<>();
//             long sum = 0;
//             for(int end = start ; end < start + k ; end++){ // TC -> 0(k) hence the total TC is 0(n*k)
//                  sum += nums[end];
//                  set.add(nums[end]);
//             }
//             if(set.size() == k){
//                 maxSum = Math.max(maxSum,sum);
//             }
//         }
//         return maxSum;
//     }
// }

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        /* 
            nums = [1,5,4,2,9,9,9], k = 3
        */
        int n = nums.length;
        int left = 0 ;
        long sum = 0;
        long maxSum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int right = 0;right < n ; right++){
            sum += nums[right];
            if(map.containsKey(nums[right])){
                map.put(nums[right] , map.get(nums[right]) + 1);
            }else{  
                map.put(nums[right] , 1);
            }


            if(right - left + 1 == k){ // hence my window size equals to the given window size
                if(map.size() == k){
                    maxSum = Math.max(maxSum,sum);
                }
                // remove left and add the right
                sum -= nums[left];

                // update the map
                map.put(nums[left] , map.get(nums[left]) - 1);

                // if the frequecy becomes 0 then :
                if(map.get(nums[left]) == 0){ 
                    map.remove(nums[left]);
                }

                // slide the window
                left++;
            } 
        }
        return maxSum;
    }
}