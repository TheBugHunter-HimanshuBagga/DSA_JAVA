class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ones = 0;
        int p1 = 0;
        int n = nums.length;
        int p2 = 0;
        int maxOnes = 0;
        while(p2 < n){
            if(nums[p2] == 1){
                ones++;
            }else{
                ones = 0;
                p1 = p2;
            }
            maxOnes = Math.max(ones, maxOnes);
            p2++;
        }
        return maxOnes;
    }
}