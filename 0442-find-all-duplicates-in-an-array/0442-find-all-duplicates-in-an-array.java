class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i]) + 1);
                list.add(nums[i]);
            }else{
                map.put(nums[i], 1);
            }
        }
        
        return list;
    }
}
/*
arr = [4,3,2,7,8,2,3,1]

map = {
    4 - 1,
    3 - 2,
    2 - 2,
    7 - 1,
    8 - 1,
    1 - 1
}
*/