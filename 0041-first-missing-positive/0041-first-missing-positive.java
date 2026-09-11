class Solution {
    public int firstMissingPositive(int[] nums) {
        // unsorted integer array
        // return the smallest positive integer that is not present in that 
        
        Arrays.sort(nums); // 0,1,2

        int[] matching = new int[nums.length];

        int count = 0;
        int num = 0;

        for(int i = 0 ; i < matching.length ; i++){
            num = num + 1;
            matching[count] = num;
            count++;
        }        

        // matching = [1,2,3], [0,1,2]

        HashSet<Integer> set1 = new HashSet<>();

        for(int j = 0 ; j < nums.length ; j++){
            if(!set1.contains(nums[j])){
                set1.add(nums[j]);
            }
        } // set1 = {0,1,2}

        for(int k = 0 ; k < matching.length ; k++){
            if(!set1.contains(matching[k])){
                return matching[k];
            }
        }
        return matching.length + 1;
    }
}