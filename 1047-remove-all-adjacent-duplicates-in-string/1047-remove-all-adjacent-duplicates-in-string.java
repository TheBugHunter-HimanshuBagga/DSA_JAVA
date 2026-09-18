import java.util.Stack;

class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            if(!stack.isEmpty()){
                if(stack.peek() == ch){
                    stack.pop();
                }else{
                    stack.push(ch);
                }
            }else{
                stack.push(ch);
            }
        }
        // now inside my stack  stack -> a -> c
        while(!stack.isEmpty()){
            char ch2 = stack.peek();
            sb.append(ch2);
            stack.pop();
        }

        sb.reverse();
        return sb.toString();
    }
}
