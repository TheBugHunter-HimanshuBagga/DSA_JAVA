class Solution {
    public int searchInsert(int[] nums, int target) {
        // sorted array
        int left = 0;
        int right = nums.length - 1;

        int[] newArr = new int[nums.length];
        while(left <= right){
            int middle = left + (right - left) / 2;

            if(target == nums[middle]){
                return middle;
            }
            else if(nums[middle] > target){ // see left
                right = middle - 1;
            }
            else{
                left = middle + 1;
            }
        }
        return left;
    }
}