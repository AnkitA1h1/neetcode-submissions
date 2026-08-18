class Solution {
    public int majorityElement(int[] nums) {
        int len = nums.length;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<len;i++){
            if(map.containsKey(nums[i])){
                int val = map.get(nums[i])+1;
                map.replace(nums[i],val);
            }else{
                map.put(nums[i],1);
            }
        }

        int min = Integer.MIN_VALUE;
        int res=0;
        for(Integer key : map.keySet()){
            if(map.get(key) > min){
                min = map.get(key);
                res = key;
            }
        }
        
        return res;
    }
}