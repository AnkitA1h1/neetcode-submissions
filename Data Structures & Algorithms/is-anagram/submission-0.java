class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        // int s1 =0;
        // int s2 =0;

        // for(int i=0;i<s.length();i++){
        //     s1 += s.charAt(i)-'a';
        //     s2 += t.charAt(i)-'a';
        // }
        // if(s1 != s2) return false;


        // return true;

        char[] sArr = s.toCharArray();
        Arrays.sort(sArr);
        char[] tArr = t.toCharArray();
        Arrays.sort(tArr);

        for(int i=0;i<sArr.length;i++){
            if(sArr[i]!=tArr[i]) return false;
        }

        return true;


    }
}