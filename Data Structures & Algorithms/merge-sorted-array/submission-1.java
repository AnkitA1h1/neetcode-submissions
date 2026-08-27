class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    //     int[] res = new int[m+n];
    //     int c=0;
    //     int p1=0;
    //     int p2=0;

    //     while(p1<m && p2<n){

    //         if(nums1[p1]<nums2[p2]){
    //             res[c++] = nums1[p1++];
    //         }else if(nums1[p1]>nums2[p2]){
    //             res[c++] = nums2[p2++];
    //         }else{
    //             res[c++] = nums1[p1++];
    //             res[c++] = nums2[p2++];
    //         }
    //     }

    //    while(p1<m){
    //         res[c++] = nums1[p1++];
    //    }

    //    while(p2<n){
    //         res[c++] = nums2[p2++];
    //    }


    //    for(int i=0;i<(m+n);i++){
    //     nums1[i] = res[i];
    //    }

    //}

    int p1 = m-1;
    int p2= n-1;
    int k = m+n -1;

    while(p1>=0 && p2>=0){
        if(nums1[p1]>nums2[p2]){
            nums1[k--] = nums1[p1--];
        }else if(nums2[p2]>nums1[p1]){
            nums1[k--] = nums2[p2--];
        }else {
            nums1[k--] = nums1[p1--];
            nums1[k--] = nums2[p2--];
        }
    }

    while(p2>=0){
        nums1[k--] = nums2[p2--];
    }

    }
}