class Solution {
    public String removeDuplicates(String s) {
        
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++){
            
            if(stack.empty()){
                stack.push(s.charAt(i));
            }
            else if(s.charAt(i) == stack.peek()){
                stack.pop();
            }
            else{
                stack.push(s.charAt(i));
            }
        }

        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        String result = sb.reverse().toString(); 
        return result;    
    }
}




// boolean flag = true;
// String temp = " ";
//     while(flag){
//         flag = false;
//         for(int i=0; i<s.length()-1; i++){
//             if(s.charAt(i) == s.charAt(i+1)){
//                 i++;
//                 flag = true;
//             }
//             else{
//                 temp += s.charAt(i);
//             }
//         }
//         s = temp;
//     }
//     return s;