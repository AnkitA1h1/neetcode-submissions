class Solution {
    public int minOperations(String[] logs) {
        //Stack<String> st = new Stack<>();
        int depth =0;
        
        for(String log : logs){
            if(log.equals("../") /*!st.isEmpty()*/){
                //st.pop();
                if(depth>0)
                depth--;
            }else if(!log.equals("./"))
            depth++;
            //st.push(log);
        }

        return depth;
    }
}