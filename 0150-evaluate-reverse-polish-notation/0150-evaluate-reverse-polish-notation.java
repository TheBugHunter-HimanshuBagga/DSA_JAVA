class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(int i = 0 ; i < tokens.length ; i++){
            if(stack.isEmpty()){
                if(!tokens[i].equals("+") &&
                !tokens[i].equals("-") &&
                !tokens[i].equals("/") &&
                !tokens[i].equals("*") ){
                    stack.push(Integer.parseInt(tokens[i]));
                }
            }
            else{
                if(!tokens[i].equals("+") && !tokens[i].equals("-") &&!tokens[i].equals("*") && !tokens[i].equals("/")){
                    stack.push(Integer.parseInt(tokens[i]));
                }
                else if(tokens[i].equals("+")){
                    int val1 = stack.pop();
                    int val2 = stack.pop();
                    int val = val1 + val2;
                    stack.push(val);
                }
                else if(tokens[i].equals("-")){
                    int val1 = stack.pop();
                    int val2 = stack.pop();
                    int val = val2-val1;
                    stack.push(val);
                }
                else if(tokens[i].equals("*")){
                    int val1 = stack.pop();
                    int val2 = stack.pop();
                    int val = val1 * val2;
                    stack.push(val);
                }else if(tokens[i].equals("/")){
                    int val1 = stack.pop(); // 5
                    int val2 = stack.pop(); // 13
                    int val = val2 / val1;
                    stack.push(val);
                }
            }
        }
        return stack.peek();
    }
}