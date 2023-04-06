class Solution {
    public int search(int[] nums, int target) {
        int k = findK(nums, target);
        return rotatedSearch(nums, target, k);
    }

    public int rotatedSearch(int[] nums, int target, int k) {
        int low, mid, high;
        low = 0;
        high = nums.length - 1;
        mid = (high + low) / 2;

        while(low <= high) {
            if(target == nums[(mid + k) % nums.length]) { //found the target
                return (mid + k) % nums.length;
            }
            else if(target > nums[(mid + k) % nums.length]) { // target is too large
                low = mid + 1;
                mid = (high + low) / 2;
            }
            else if(target < nums[(mid + k) % nums.length]) { // target is too small
                high = mid - 1;
                mid = (high + low) / 2;
            }
        }
        return -1;
    }

    int findK(int[] nums, int target) {
        int low, mid, high;
        low = 0;
        high = nums.length - 1;
        while(low < high) {
            if(nums[low] < nums[high]) {
                return low;
            }
            mid = low + (high - low)/2;
            if(nums[mid] > nums[high]){
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
}