class Solution {
    public int longestOnes(int[] nums, int k) {
        // given binary array, int k
        // 
        int p1 = 0;
        int p2 = 0;
        int n = nums.length; 
        int zeros = 0;
        int maxOnes = 0;
        while(p2 < n){
            
            if(nums[p2] == 0){
                zeros++;
            }
            // if nums[p2] == 0 then:
            while(zeros > k){
                if(nums[p1] == 0){
                    zeros--;
                }
                p1++;
            }
            maxOnes = Math.max(maxOnes , p2 - p1 + 1);
            p2++;
        }
        return maxOnes;
    }
}