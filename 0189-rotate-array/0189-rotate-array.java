class Solution {
    public void rotate(int[] nums, int k) {
        //copy array
        int[] placeholder = new int[nums.length];
        for(int i = 0; i < nums.length; i++) placeholder[i] = nums[i];
            
        
        for(int i = 0; i < nums.length; i++) {
            int position = (i + k) % nums.length;
            nums[position] = placeholder[i];
        }
    }
}