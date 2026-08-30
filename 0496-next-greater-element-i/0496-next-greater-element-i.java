class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int[] result = new int[n]; // similar to the size of nums1

        for(int i = 0 ; i < n ; i++){
            result[i] = -1; // default answer
            int val = nums1[i];
            int maxVal = 0;
            for(int j = 0 ; j < nums2.length ; j++){
                if(val == nums2[j]){
                    // found it
                    for(int k = j+1 ; k < nums2.length ; k++){
                        if(nums2[k] > val){
                            // found the next greater element
                            result[i] = nums2[k];
                            break; // stop after finding the first greayter element
                        }
                    }
                }
            }
        }
        return result;
    }
}