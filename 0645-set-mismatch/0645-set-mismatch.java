class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] newArr = new int[2];
        int idx = 0;
        // to find the duplicate number
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0 ; i < nums.length ; i++){
            if(set.contains(nums[i])){
                newArr[idx] = nums[i];
                idx++;
            }else{
                set.add(nums[i]);
            }
        }


        // to find the missing number
        int[] compareArr = new int[nums.length];
        int index = 0;
        int sum = 0;
        for(int i = 0 ; i < compareArr.length ; i++){
            sum += 1;
            compareArr[index] = sum;
            index++; 
        }
        for(int j = 0 ; j < compareArr.length ; j++){
            if(!set.contains(compareArr[j])){
                newArr[idx] = compareArr[j];
            }
        }

        for(int X : compareArr){
            System.out.print(X + " ");
        }
        return newArr;
    }
}