// class Solution {
//     public int[] nextGreaterElement(int[] nums1, int[] nums2) {
//         int n = nums1.length;
//         int[] result = new int[n]; // similar to the size of nums1

//         for(int i = 0 ; i < n ; i++){
//             result[i] = -1; // default answer
//             int val = nums1[i];
//             for(int j = 0 ; j < nums2.length ; j++){
//                 if(val == nums2[j]){
//                     // found it
//                     for(int k = j+1 ; k < nums2.length ; k++){
//                         if(nums2[k] > val){
//                             // found the next greater element
//                             result[i] = nums2[k];
//                             break; // stop after finding the first greayter element
//                         }
//                     }
//                 }
//             }
//         }
//         return result;
//     }
// }


class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int[] result = new int[n]; // similar to the 
        Stack<Integer> stack = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums2.length ; i++){
            int val = nums2[i];
            if(stack.isEmpty()){
                stack.push(val);
            }
            else{
                if(val > stack.peek()){

                    while(!stack.isEmpty() && val > stack.peek()){
                        int popped = stack.pop();
                        map.put(popped, val);
                    }
                    stack.push(val);
                }
                else{ // 
                    stack.push(val);
                }
            }
        }
        for(int k = 0 ; k < nums1.length ; k++){
            result[k] = map.getOrDefault(nums1[k], -1);
        }
        return result;
    }
}