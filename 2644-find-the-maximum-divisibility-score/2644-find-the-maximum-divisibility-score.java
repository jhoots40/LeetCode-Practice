class Solution {
    public int maxDivScore(int[] nums, int[] divisors) {
        int result = Integer.MIN_VALUE;
        int index = 0;
        int last = Integer.MIN_VALUE;
        
        for(int i = 0; i < divisors.length; i++) {
            int count = 0;
            for(int j : nums) if(j % divisors[i] == 0) count++;
            if(count > result) {
                index = i;
                result = count;
                last = divisors[i];
            }
            else if(count == result) {
                if(divisors[i] < last) {
                    index = i;
                    last = divisors[i];
                }
            }
        }
        
        
        return divisors[index];
    }
}