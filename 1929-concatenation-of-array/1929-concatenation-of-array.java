class Solution {
    public int[] getConcatenation(int[] nums) {
        // nums
        int[] ans = new int[2 * nums.length];
        int n = nums.length;
        for(int i = 0 ; i < 2 * n ; i++){
            int val = nums[i % n];
            ans[i] = val;
        }
        return ans;
    }
}