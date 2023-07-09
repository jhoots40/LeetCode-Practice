class Solution {
    public int unequalTriplets(int[] nums) {
        int result = 0;
        
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                for(int k = j + 1; k < nums.length; k++) {
                    if(nums[i] != nums[k] && nums[k] != nums[j] && nums[j] != nums[i]) result++;
                }
            }
        }
        
        return result;
    }
}