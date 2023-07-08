class Solution {
    public boolean isThree(int n) {
        if(n == 1) return false;
        
        boolean flag = false;
        for(int i = 2; i < n; i++) {
            if(n % i == 0){
                if(!flag) flag = true;
                else return false;
            } 
        }
        
        return flag;
    }
}