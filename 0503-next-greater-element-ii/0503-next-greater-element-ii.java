class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        for(int i=0;i<nums.length;i++){
            int num = nums[i];  
            result[i] = -1;
            boolean found = false;
            for(int j = i+1; j < nums.length; j++){
                if(num < nums[j]){
                    result[i] = nums[j];
                    found = true;
                    break;
                }// do nothing
            }
            if(!found){
                if(result[i] == -1){
                    for(int j = 0; j < i; j++){
                        if(num < nums[j]){
                            result[i] = nums[j];
                            break;
                        }
                    }
                }
            }
            
        }
        return result;
    }
}
// num = 1