package Array;

public class LongestSubarraySumLessThanOrEqualToTarget1 { // O(N^3)
    public static void main(String[] args){
        int arr[] = {2,5,1,7,10};
        int target = 14;
        int n = arr.length;
        int maxLen = 0;
        for(int start = 0 ; start < n ; start++){
            for(int end = start ; end < n ; end ++){
                int sum = 0;
                for(int print = start ; print <= end; print++){
                    sum += arr[print];
                }
                if(sum <= target){
                    int len = end - start + 1;
                    maxLen = Math.max(maxLen , len);
                }
            }
        }
        System.out.println(maxLen);
    }
}
