class Solution {
    public int sumOfUnique(int[] nums) {
        Map<Integer, Boolean> map = new HashMap<>();
        int result = 0;
        
        for(int n : nums) {
            if(map.containsKey(n)) {
                if(map.get(n) == true) {
                    map.replace(n, false);
                    result -= n;
                }
                continue;
            }
            
            map.put(n, true);
            result += n;
        }
        
        return result;
    }
}