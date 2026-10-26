class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int idx = (m+n)-1;
        m = m-1;
        n = n-1;
        while(n>=0 && m>=0){
            if(nums1[m] <= nums2[n]){
                nums1[idx] = nums2[n];
                idx--;
                n--;
            }else{
                nums1[idx] = nums1[m];
                idx--;
                m--;
            }
        }

        while(n>=0){
            nums1[idx] = nums2[n];
            idx--;
            n--;
        }

    }
}