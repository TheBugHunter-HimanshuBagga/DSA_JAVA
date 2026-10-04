class Solution {
    public int[] singleNumber(int[] nums) {
        int[] newArr = new int[2];
        int index = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++){
            int num = nums[i];
            if(map.containsKey(num)){
                map.put(num, map.get(num) + 1);
            }else{
                map.put(num, 1);
            }
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                newArr[index] = entry.getKey();
                index++;
            }
        }

        return newArr;
    }
}