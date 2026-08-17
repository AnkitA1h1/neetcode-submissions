class Solution {
    public boolean hasDuplicate(int[] arr) {
        Set<Integer> set = new HashSet<>();
        if(arr.length == 0) return false;
        boolean res= false;
        for(int i=0;i<arr.length;i++){
            res = set.add(arr[i]);
            if(!res) return !res;
        }

        return !res;
    }
}