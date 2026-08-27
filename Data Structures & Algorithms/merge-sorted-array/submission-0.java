class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] res = new int[m+n];
        int c=0;
        int p1=0;
        int p2=0;

        while(p1<m && p2<n){

            if(nums1[p1]<nums2[p2]){
                res[c++] = nums1[p1++];
            }else if(nums1[p1]>nums2[p2]){
                res[c++] = nums2[p2++];
            }else{
                res[c++] = nums1[p1++];
                res[c++] = nums2[p2++];
            }
        }

       while(p1<m){
            res[c++] = nums1[p1++];
       }

       while(p2<n){
            res[c++] = nums2[p2++];
       }


       for(int i=0;i<(m+n);i++){
        nums1[i] = res[i];
       }
    }
}