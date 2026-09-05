class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int[] x = new int[m+n]; // [0,0,0,0,0,0]
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < m && j < n){
            if(nums1[i] <= nums2[j]){
                x[k] = nums1[i];
                i++;
            }
            else{
                x[k] = nums2[j];
                j++;
            }
            k++;
        }
        while(i < m){
            x[k] = nums1[i];
            i++;
            k++;
        }
        while(j < n){
            x[k] = nums2[j];
            j++;
            k++;
        }

        for(int z = 0 ; z < x.length ; z++){
            nums1[z] = x[z];
        }
    }
}