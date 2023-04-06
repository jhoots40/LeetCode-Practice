class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int[] copy = new int[m];
        for(int i = 0; i < m; i++) {
            copy[i] = nums1[i];
        }

        int i = 0;
        int j = 0;
        int k = 0;
        while(i < m && j < n) {
            if(copy[i] > nums2[j]) {
                nums1[k++] = nums2[j++];
            }
            else
            {
                nums1[k++] = copy[i++];
            }
        }

        while(i < m) {
            nums1[k++] = copy[i++];
        }

        while(j < n) {
            nums1[k++] = nums2[j++];
        }
    }
}