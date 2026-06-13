package Array;

public class MaximumSubArraySum {
    public static int main(String[] args) {
        int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
        int n = nums.length;
        int larSum = Integer.MIN_VALUE;

        for(int start = 0; start < n; start++) {
            for(int end = start; end < n; end++) {

                int sum = 0;

                for(int k = start; k <= end; k++) {
                    sum += nums[k];
                }

                larSum = Math.max(larSum, sum);
            }
        }

        return larSum;
    }
}
