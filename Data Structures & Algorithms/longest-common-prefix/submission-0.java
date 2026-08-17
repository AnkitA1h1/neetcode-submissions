class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        Arrays.sort(strs);
        String res="";
        int l1 = strs[0].length();
        int l2 = strs[n-1].length();
        int len =  l1 < l2 ? l1 : l2;
        for(int i=0;i< len ;i++){
            char ch =strs[0].charAt(i);
            if(ch != strs[n-1].charAt(i)) return res;

            res += ch;
        }

        return res;
        
    }
}