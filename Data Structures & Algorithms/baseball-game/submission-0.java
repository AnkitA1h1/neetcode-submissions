class Solution {
    public int calPoints(String[] operations) {
        Deque<Integer> st = new ArrayDeque<>();
        int sum=0;
       for(String op : operations){
            if(op.equals("C")){
                if(!st.isEmpty())
                    sum -= st.pop();
            }else if(op.equals("D")){
                if(!st.isEmpty()){
                    int cur = st.peek()*2;
                    st.push(cur);
                    sum += cur;
                }
            }else if(op.equals("+")){
                if(!st.isEmpty()){
                    int last = st.pop();
                    int cur = st.peek() + last;
                    st.push(last);
                    st.push(cur);
                    sum +=cur;
                }
            }else{
                int cur = Integer.parseInt(op);
                st.push(cur);
                sum +=cur;
            }
       }

       return sum; 
    }
}