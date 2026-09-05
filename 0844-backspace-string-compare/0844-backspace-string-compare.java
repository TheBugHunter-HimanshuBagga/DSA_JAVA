class Solution {
    public boolean backspaceCompare(String s, String t) {
        // # means a backSpaCE MEANS POP
        Stack<Character> stack = new Stack<>();
        StringBuilder r = new StringBuilder();
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            if(ch != '#'){
                stack.push(ch);
            }else{
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }
        }
        // inside my stack i have ac
        while(!stack.isEmpty()){
            char ch1 = stack.peek();
            r.append(ch1);
            stack.pop();
        }

        r.reverse();

        Stack<Character> stack2 = new Stack<>();
        StringBuilder x = new StringBuilder();
        for(int j  = 0 ; j < t.length(); j++){
            char ch2 = t.charAt(j);
            if(ch2 != '#'){
                stack2.push(ch2);
            }
            else{
                if(!stack2.isEmpty()){
                    stack2.pop();
                }
            }
        }

        while(!stack2.isEmpty()){
            char ch4 = stack2.peek();
            x.append(ch4);
            stack2.pop();
        }

        x.reverse();

        if(r.toString().equals(x.toString())){
            return true;
        }
        return false;
    }
}