class Solution {

    public String encode(List<String> strs) {

        StringBuilder encodingString = new StringBuilder();

        for(String str : strs){
            int len = str.length();

            encodingString.append(len).append("#").append(str);
        }

        return encodingString.toString();
    }

    public List<String> decode(String str) {
        List<String> listStr = new ArrayList<>();

        for(int i=0;i<str.length();){
            int start = str.indexOf("#",i)+1;
            int len = Integer.parseInt(
                str.substring(i, start-1)
            );
            int end =  len+start;
            listStr.add(str.substring(start,end));
            i=end;
        }

        return listStr;
    }
}
