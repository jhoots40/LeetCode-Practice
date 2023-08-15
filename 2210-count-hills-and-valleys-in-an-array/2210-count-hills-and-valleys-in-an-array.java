class Solution {
    public int countHillValley(int[] nums) {
        int count = 0;
        
        for(int i = 1; i < nums.length - 1; i++) {
            //check if the valley or hill is the same
            if(nums[i] == nums[i - 1]) continue;
            
            int leftNeighbor = i - 1;
            int rightNeighbor = i + 1;
            
            while(leftNeighbor >= 0 && nums[leftNeighbor] == nums[i]) 
                leftNeighbor--;
            
            while(rightNeighbor < nums.length && nums[rightNeighbor] == nums[i]) 
                rightNeighbor++;
            
            if(leftNeighbor < 0 || rightNeighbor >= nums.length) continue;
            
            //hill
            if(nums[leftNeighbor] < nums[i] && nums[rightNeighbor] < nums[i]) count++;
            //valley
            if(nums[leftNeighbor] > nums[i] && nums[rightNeighbor] > nums[i]) count++;
        }
        
        return count;
    }
}