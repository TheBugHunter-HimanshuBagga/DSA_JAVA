// class Solution {
//     public String simplifyPath(String path) {
//         StringBuilder sb = new StringBuilder();
//         Stack<Character> stack = new Stack<>();
//         for(int i = 0 ; i < path.length() ; i++){
//             char ch = path.charAt(i);
//             if(stack.isEmpty()){
//                 stack.push(ch);
//             }
//             else{
//                 // if(stack.peek() != ch){
//                 //     stack.push(ch);
//                 // }
//                 // else do nothing

//                 if(stack.peek() == '/' && ch =='/'){
//                     // do nothing
//                 }
//                 else if(stack.peek() == '.' && ch == '.'){
//                     stack.pop();
//                     if(!stack.isEmpty() && stack.peek() == '/') {
//                         stack.pop();
//                     }

//                     while(stack.isEmpty() && stack.peek() != '/'){
//                         stack.pop();
//                     }
//                 }
//                 else if(ch == '.'){
//                     // do nothing
//                 }
//                 else{
//                     stack.push(ch);
//                 }
//             }
//         }
        
        
//         if(!stack.isEmpty() && stack.peek() == '/'){
//             stack.pop();
//         }
//         if(stack.isEmpty()){
//             stack.push('/'); // "/" since all stack staert with this '/'
//         }
//         while(!stack.isEmpty()){
//             sb.append(stack.pop());
//         }
//         sb.reverse();
//         return sb.toString();
//     }
// }

class Solution {
    public String simplifyPath(String path) {

        Stack<String> stack = new Stack<>();

        String[] arr = path.split("/");

        for(int i = 0; i < arr.length; i++){

            if(arr[i].equals("..")){

                if(!stack.isEmpty()){
                    stack.pop();
                }

            }
            else if(arr[i].equals(".")){
                // nothing
            }
            else if(!arr[i].equals("")){
                stack.push(arr[i]);
            }
        }

        StringBuilder sb = new StringBuilder();

        while(!stack.isEmpty()){
            sb.insert(0, "/" + stack.pop());
        }

        if(sb.length() == 0){
            return "/";
        }

        return sb.toString();
    }
}