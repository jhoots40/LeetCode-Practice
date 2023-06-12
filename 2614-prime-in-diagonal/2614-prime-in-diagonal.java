class Solution {
    public int diagonalPrime(int[][] nums) {
        int result = 0;
        
        for(int i = 0; i < nums.length; i++) {
            if(isPrime(nums[i][i])) result = Math.max(result, nums[i][i]);
            if(isPrime(nums[i][nums.length - i - 1])) result = Math.max(result, nums[i][nums.length - i - 1]);
        }
        
        return result;
    }
    
    boolean isPrime(int n) {
        if(n <= 1) return false;
        
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) return false;
        }
        
        return true;
    }
}