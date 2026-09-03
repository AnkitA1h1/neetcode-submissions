class Solution {
    public boolean isValid(String s) {
        Deque<Character> dq = new ArrayDeque<>();

        // for(int i=0;i<s.length();i++){
        //     char ch = s.charAt(i);
        //     if(ch=='(' || ch=='{' || ch=='['){
        //         dq.push(ch);
        //     }

        //     if(ch==')'){
        //         if(!dq.isEmpty() && dq.peek()=='('){
        //             dq.pop();
        //         }else return false;
                
        //     }else if(ch=='}'){
        //         if(!dq.isEmpty() && dq.peek()=='{'){
        //             dq.pop();
        //         }else return false;

        //     }else if(ch==']'){
        //         if(!dq.isEmpty() && dq.peek()=='['){
        //             dq.pop();
        //         }else return false;

        //     }
        // }

        for(char ch : s.toCharArray()){
            if(ch=='(' || ch=='{' || ch=='['){
                dq.push(ch);
            }else {
                if(dq.isEmpty()) return false;
                char peek = dq.peek();

                if((ch == ')' && peek == '(') || 
                (ch == ']' && peek == '[') || 
                (ch == '}' && peek == '{')){
                    dq.pop();
                }else return false;
            }
        }

        return dq.isEmpty();
    }
}
