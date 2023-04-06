class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        boolean isEven = false;
        double size = nums1.length + nums2.length;
        int upperBound = 0, lowerBound = 0;
        if((nums1.length + nums2.length) % 2 == 0)
            isEven = true;

        if(isEven) {
            upperBound = (int) (size / 2);
            lowerBound = (int) (size / 2) - 1;
        } else {
            upperBound = (int) (size / 2);
            lowerBound = (int) (size / 2);
        }
        int[] temp = merge(nums1, nums2, upperBound + 1);
        return ((double) temp[lowerBound] + (double) temp[upperBound]) / 2;
    }

    public int[] merge(int[] A, int[] B, int size) {
        int i = 0, j = 0, k = 0;
        int[] result = new int[size];
            while(k < size && i < A.length && j < B.length) {
                if(A[i] < B[j])
                    result[k++] = A[i++];
                else
                    result[k++] = B[j++];
            }

            while(k < size && i < A.length)
                result[k++] = A[i++];

            while(k < size && j < B.length)
                result[k++] = B[j++];
        return result;
    }
}