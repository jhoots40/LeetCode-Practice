class Solution {
    public int findLHS(int[] nums) {
        if(nums.length == 1) return 0;
        
        int max_length = 0;
        
        for(int i = 0; i < nums.length; i++) {
            //if(max_length >= nums.length - i) break;
            boolean valid = false;
            int bottom_length = 1;
            int top_length = 1;
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[j] + 1 == nums[i]) {
                    top_length++;
                    valid = true;
                }
                if(nums[j] - 1 == nums[i]) {
                    bottom_length++;
                    valid = true;
                }
                if(nums[j] == nums[i]) {
                    top_length++;
                    bottom_length++;
                }
            }
            if(valid == false) continue;
            max_length = Math.max(max_length, Math.max(top_length, bottom_length));
        }
        
        return max_length;
    }
}