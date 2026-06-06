package Array;

public class LongestSubarraySumLessThanOrEqualToTarget2 {
    public static void main(String[] args){
        int arr[] = {2,5,1,7,10};
        int n = arr.length;
        // sliding window + 2 pointer -> O(2N)
        int start = 0;
        int end = 0 ;
        int sum = 0;
        int maxLength = 0;
        int target = 14;
        while(end < n){
            sum += arr[end];
            // check for validity of not shrink
            while(sum > target){
                sum = sum - arr[start];
                start = start + 1;
            }
            if(sum <= target){
                maxLength = Math.max(maxLength,end - start + 1);
            }
            end = end + 1;
        }
        System.out.println(maxLength);
    }
}
