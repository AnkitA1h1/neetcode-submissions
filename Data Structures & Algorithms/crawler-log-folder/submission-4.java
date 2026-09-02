class Solution {
    public int minOperations(String[] logs) {
        //Stack<String> st = new Stack<>();
        int depth =0;
        
        for(String log : logs){
            if(log.equals("./")){
                continue;
            }else if(log.equals("../") && depth>0 /*!st.isEmpty()*/){
                //st.pop();
                depth--;
                continue;
            }else if(!log.equals("../"))
            depth++;
            //st.push(log);
        }

        return depth;
    }
}