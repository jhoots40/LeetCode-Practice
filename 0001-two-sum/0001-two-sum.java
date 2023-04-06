class Solution {
    public int[] twoSum(int[] nums, int target) {
        int x = -1; 
        int y = -1; //return values
        boolean exit = false;
        for(int i = 0; i < nums.length; i++) {
            int current = nums[i];
            for(int j = i + 1; j < nums.length; j++) {
                if(current + nums[j] == target) {
                    x = i;
                    y = j;
                    exit = true;
                    break;
                }
            }
            if(exit) break;
        }
        int[] ret = {x, y};
        return ret;
    }
}