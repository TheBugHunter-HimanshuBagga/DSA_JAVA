class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] result = new int[nums1.length];
        int count = 0;
        for(int i = 0 ; i < m ; i++){
            if(nums1[i] != 0){
                result[count] = nums1[i];
                count++;
            }
        }

        int newCount = count;

        for(int j = 0 ; j < n ; j++){
            result[newCount] = nums2[j];
            newCount++;
        }

        int p = 0;
        for(int k = 0; k < result.length ; k++){
            nums1[p] = result[k];
            p++;
        }

        // Arrays.sort(nums1);

        for(int x = 0 ; x < nums1.length ; x++){
            for(int y = x + 1; y < nums1.length ; y++){
                if(nums1[x] > nums1[y]){
                    int temp = nums1[x];
                    nums1[x] = nums1[y];
                    nums1[y] = temp;
                }
            }
        }
    }
}