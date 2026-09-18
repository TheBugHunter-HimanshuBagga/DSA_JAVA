class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums); // [1,2,2,3,3,4,7,8]  5 and 6 are missing here

        ArrayList<Integer> list = new ArrayList<>();

        int[] newArr = new int[nums.length];
        int num = 0;
        for(int i = 0 ; i < newArr.length ; i++){
            num = num + 1;
            newArr[i] = num;
        }

        // till now i have [1,2,3,4,5,6,7,8]
        //                 [1,2,2,3,3,4,7,8]  -> [5,6]

        HashSet<Integer> set = new HashSet<>();
        for(int i = 0 ; i < nums.length ; i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
            }
        } // [1,2,3,4,7,8]

        for(int i = 0 ; i < newArr.length ; i++){
            if(!set.contains(newArr[i])){
                list.add(newArr[i]);
            }
        }
        

        return list;
    }
}