// class Solution {
//     public int[] nextGreaterElements(int[] nums) {
//         int n = nums.length;
//         int[] result = new int[n];
//         for(int i=0;i<nums.length;i++){
//             int num = nums[i];  
//             result[i] = -1;
//             boolean found = false;
//             for(int j = i+1; j < nums.length; j++){
//                 if(num < nums[j]){
//                     result[i] = nums[j];
//                     found = true;
//                     break;
//                 }// do nothing
//             }
//             if(!found){
//                 if(result[i] == -1){
//                     for(int j = 0; j < i; j++){
//                         if(num < nums[j]){
//                             result[i] = nums[j];
//                             found = true;
//                             break;
//                         }
//                     }
//                 }
//             }
            
//         }
//         return result;
//     }
// }
// // num = 1

// class Solution {
//     public int[] nextGreaterElements(int[] nums) {
//         // using Monotonic stack'
//         Stack<Integer> stack = new Stack<>();
//         HashMap<Integer, Integer> map = new HashMap<>();
//         int[] result = new int[nums.length];
//         for(int i = 0 ; i < nums.length; i++){
//             int val = nums[i];
//             if(stack.isEmpty()){
//                 stack.push(val);
//             }
//             else{ // stack is not empty
//                 // check weather 
//                 if(val > stack.peek()){
//                     while(!stack.isEmpty() && val > stack.peek()){
//                         int popped = stack.pop();
//                         map.put(popped, val);
//                     }
//                     stack.push(val);
//                 }
//                 else{
//                     // val is less than stack.peek then
//                     stack.push(val);
//                 }
//             }
//         }
//         for(int k = 0 ; k < nums.length ; k++){
//             result[k] = map.getOrDefault(nums[k] ,-1);
//         }
//         return result;
//     }
// }
// num = 1


class Solution {
    public int[] nextGreaterElements(int[] nums) {

        Stack<Integer> stack = new Stack<>();
        int n = nums.length;
        int[] result = new int[nums.length];
        Arrays.fill(result, -1);

        

        for(int i = 0; i < 2 *nums.length; i++){
              
              int index = i % n;
            int val = nums[index];

            // Find next greater element
            while(!stack.isEmpty() && val > nums[stack.peek()]){

                int popped = stack.pop();

                result[popped] = val;
            }

            // Only push during the first pass
            if(i < n){
                stack.push(index);
            }


        }

        return result;
    }
}