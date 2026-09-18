class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int i = 0, j = 0;
        while(i < pushed.length){
            if(!stack.isEmpty() && stack.peek() == popped[j]){
                stack.pop();
                j++;
            }else{
                stack.push(pushed[i]);
                i++;
            }
        }

        // j = 2
        while(!stack.isEmpty() && j < popped.length){
            if(stack.peek() == popped[j]){
                stack.pop();
                j++;   
            }else{
                break;
            }
        }

        return stack.isEmpty();
    }
}
/*
i = 0 , j = 0
i = 1 , j = 0      2 = 4
i = 2 , j = 0      3 = 4
i = 3 , j = 0      4 = 4
i = 4 , j = 1      5 = 5
i = 5 , j = 2
*/