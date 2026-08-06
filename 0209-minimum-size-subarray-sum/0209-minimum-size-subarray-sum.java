class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int p1 = 0;
        int p2 = 0;
        int minSize = Integer.MAX_VALUE;
        int sum = 0;
        while(p2 < n){
            sum += nums[p2];

            while(sum >= target){
                minSize = Math.min(minSize, p2 - p1 + 1);

                sum -= nums[p1];
                p1++;
            }
            p2++;
        }
        return minSize == Integer.MAX_VALUE?0:minSize;
    }
}