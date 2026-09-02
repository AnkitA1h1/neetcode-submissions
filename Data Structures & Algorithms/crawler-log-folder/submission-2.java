class Solution {
    public int minOperations(String[] logs) {
        Stack<String> st = new Stack<>();
        
        for(String log : logs){
            if(log.equals("./")){
                continue;
            }else if(log.equals("../") && !st.isEmpty()){
                st.pop();
                continue;
            }else if(!log.equals("../"))
            st.push(log);
        }

        return st.size();
    }
}