class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {

        // int n=0;
        // char[] arr = abbr.toCharArray();
        // for (int i=0, j=0;i<abbr.length();i++,j++){
           
        //     while(i<abbr.length() && Character.isDigit(abbr.charAt(i))){
        //         n = (n*10)+ (abbr.charAt(i)-'0');
        //         if(n==0) return false;
        //         i++;
        //     }
        //     j = j+n;
        //     if(j==word.length() && i == abbr.length()) return true;
        //     if(j>=word.length() || abbr.charAt(i) != word.charAt(j)) return false;

        //     n=0;
        // }
        // return true;

        int i=0;
        int j=0;

        while(i < abbr.length() && j< word.length()){
            
            if(Character.isDigit(abbr.charAt(i))){
                
                if(abbr.charAt(i) == '0') return false;

                int n=0;

                while(i<abbr.length() && Character.isDigit(abbr.charAt(i))){
                    n = (n*10)+ (abbr.charAt(i)-'0');
                    i++;
                }
                j += n;
            }else{
                if(word.charAt(j) != abbr.charAt(i)) return false;
                i++;
                j++;
            }
            
        }

        return i == abbr.length() && j == word.length();
        
    }   
}