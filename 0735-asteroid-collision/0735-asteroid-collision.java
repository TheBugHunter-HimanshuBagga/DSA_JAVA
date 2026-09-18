// class Solution {
//     public int[] asteroidCollision(int[] asteroids) {
//         Stack<Integer> stack = new Stack<>();
//         for(int i = 0 ; i < asteroids.length ; i++){
//             int val = asteroids[i]; //[5,10,-5] then 5, 10
//             if(stack.isEmpty()){
//                 stack.push(val); // 5
//             }
//             else{ // now in 10, my stack is already having 5 hence comparision will happen
//                 while(!stack.isEmpty()){
//                     int sum = asteroids[i]; // 10
//                     if(stack.peek() < 0|| asteroids[i] > 0 ){ // then i can say its in same direction hence push it inside the stack
//                         stack.push(sum);
//                         break;
//                     }
//                     else if(stack.peek() + asteroids[i] == 0){ // in stack i have +5 but now asteroids[i] is -5 hence 5 + -5 = 0 hence both will cancel each other
//                         stack.pop();
//                         break;
//                     }
//                     else{ // stack.peek() + asteroids[i] < asteroids[i]  10 +- 5 < 5
//                     // don't add it in stack
//                         if(stack.peek() < -sum){
//                             stack.pop();
                            
//                         }
//                     }
//                 }
//             }  
//         }
//         int[] result = new int[stack.size()];
//         for(int j = result.length - 1 ; j >= 0 ; j--){
//             result[j] = stack.pop();
//         }
//         return result;
//     }
// }

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for(int i = 0 ; i < asteroids.length ; i++){
            int val = asteroids[i];
            if(stack.isEmpty()){
                stack.push(val);
            }
            else{ // stack is not empty
                while(!stack.isEmpty()){
                    if(stack.peek() < 0 || val > 0){ // no collision
                    stack.push(val);
                    break;
                }
                else if(stack.peek() + val == 0){
                    stack.pop();
                    break;
                }
                else if(stack.peek() < -val){
                    stack.pop();
                    if(stack.isEmpty()){
                        stack.push(val);
                        break;
                    }
                }
                else{
                    break;
                }
                }
                
            }
        }
        int[] result = new int[stack.size()];
        for(int i = result.length - 1; i >= 0; i--){
            result[i] = stack.pop();
        }
        return result;
    }
}