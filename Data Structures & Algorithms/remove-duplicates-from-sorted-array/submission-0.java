class Solution {
    public int removeDuplicates(int[] nums) {
        int p1=0;
        int p2=1;
        int k=1;
        while(p2<nums.length){
            if(nums[p1]!=nums[p2]){
                p1++;
                nums[p1] = nums[p2++];
                k++;
            }else{
                p2++;
            }
            
        }

        return k;
        
    }
}