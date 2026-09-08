class Solution {
    public int searchInsert(int[] nums, int target) {
        int len = nums.length;
        if(target < nums[0]) return 0;
        if(target > nums[len-1])return len;
        
        int start =0;
        int end = len-1;
        int mid =-1;
        while(start<=end){
            mid = (end + start)/2;
            if(target == nums[mid]) return mid;
            else if(target < nums[mid]){
                end = mid-1;
            }else start = mid+1;
        }

        if(target < nums[mid]) return mid;

        return mid+1;

    }
}