package Array;

public class array1 {
    public static void main(String[] args){

    }
    public static double SlidingWindowBruteForce(int[] nums , int k){
        int n = nums.length;
        int maxSum = Integer.MIN_VALUE;
        // 7 - 4 = 3
        for(int i = 0 ; i <= n - k ; i++){
            int sum = 0;
            for(int j = 0 ; j < i + k ; j++){
                sum += nums[j];
            }
            maxSum = Math.max(maxSum , sum);
        }
        return (double) maxSum / k;
    }

    public static double SlidingWindow(int[] nums , int k){
        int n = nums.length;
        int windowSum = 0;
        for(int i = 0 ; i < k ; i++){
            windowSum += nums[i];
        }
        int maxSum = windowSum;
        for(int i = k ; i < n ; i++){
            windowSum = windowSum
                    - nums[i - k]   // remove left
                    + nums[i];      // add right

            maxSum = Math.max(maxSum, windowSum);
        }
    }
}
