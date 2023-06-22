class Solution {
    public int minOperations(String s) {
        if(s.length() == 1) return 0;
        
        return Math.min(check(s, '0'), check(s, '1'));
    }
    
    
    public int check(String s, char next) {
        int result = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != next) result++;
            
            next = next == '0' ? '1' : '0';
        }
        return result;
    }
}