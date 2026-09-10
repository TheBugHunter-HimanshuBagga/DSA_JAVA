class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        int[] result = new int[nums.length];

        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] % 2 == 0){ // even
                even.add(nums[i]);
            }
            else{
                odd.add(nums[i]);
            }
        }
        // even = [4,2], odd = [5,7]

        int evenCount = 0;
        int oddCount = 0;

        for(int i = 0 ; i < result.length ; i++){
            if(i % 2 == 0){
                result[i] = even.get(evenCount);
                evenCount++;
            }else{
                result[i] = odd.get(oddCount);
                oddCount++;
            }
        }

        return result;
    }
}