class Solution {
    public boolean containsDuplicate(int[] nums) {
        sort(nums, 0, nums.length - 1);
        int prev = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == prev)
                return true;
            else
                prev = nums[i];
        }
        return false;
    }

    public void sort(int[] nums, int l, int r) {
        if(l == r)
            return;

        int mid = (l + r) / 2;
        sort(nums, l, mid);
        sort(nums, mid + 1, r);

        merge(nums, l, mid, r);
    }

    public void merge(int[] nums, int l, int m, int r) {
        int leftSize = m - l + 1;
        int rightSize = r - m;

        int[] tmpLeft = new int[leftSize];
        int[] tmpRight = new int[rightSize];

        for(int i = 0; i < leftSize; i++)
            tmpLeft[i] = nums[l + i];
        for(int i = 0; i < rightSize; i++)
            tmpRight[i] = nums[m + 1 + i];

        int i = 0; int j = 0;

        int k = l;
        while (i < leftSize && j < rightSize) {
            if (tmpLeft[i] <= tmpRight[j]) {
                nums[k] = tmpLeft[i];
                i++;
            }
            else {
                nums[k] = tmpRight[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < leftSize) {
            nums[k] = tmpLeft[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < rightSize) {
            nums[k] = tmpRight[j];
            j++;
            k++;
        }
    }
}