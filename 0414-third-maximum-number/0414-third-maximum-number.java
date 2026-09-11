class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int num1 = nums[nums.length - 1];
        

        ArrayList<Integer> list1 = new ArrayList<>();
        for(int i = 0 ; i < nums.length ; i++){ 
            if(nums[i] != num1){
                list1.add(nums[i]);
            }
        }

        Collections.sort(list1);
        if(list1.size() == 0){
            return num1;
        }
        int num2 = list1.get(list1.size() - 1);


        ArrayList<Integer> list2 = new ArrayList<>();
        for(int i = 0 ; i < list1.size() ; i++){
            if(list1.get(i) != num2){
                list2.add(list1.get(i));
            }
        }

        Collections.sort(list2);
        if(list2.size() == 0){
            return num1;
        }

        int num3 = list2.get(list2.size() -1 );

        return num3 ;
    }
}