class Solution {
    
    // first attempt was correct just not fast enough
    /*public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        
        int result = 0;
        
        for(int i = nums.length - 1; i >= 0; i--) {
            int currentResult = 1, temp_k = k;
            
            //workhorse code here
            for(int j = i - 1; j >= 0; j--) {
                temp_k -= nums[i] - nums[j];
                if(temp_k < 0) break;
                currentResult++;
            }
            
            result = Math.max(result, currentResult);
        }
        
        return result;
    }*/
    
    public int maxFrequency(int[] a, int k) {
        int n = a.length;
        
        Arrays.sort(a);
        
        int ans = 0;
        int left = 0;
        
        long sum = 0;
        
        for(int right=0; right<n; right++) {
            sum += a[right];
            
            while(a[right]*1L*(right-left+1)-sum>k) {
                sum -= a[left];
                left++;
            }
            
            ans = Math.max(ans, right-left+1);
        }
        
        return ans;
    }
}