class Solution {
    public int countTriples(int n) {
        int result = 0;
        int a, b;
        a = b = 1;
        
        while(a < n || b < n) {
            double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
            
            if((c % 1) == 0 && c <= n) {
                if(a == b) result += 1;
                else       result += 2;
            }
            
            if(b == n - 1) {
                a += 1;
                b = a;
            }
            else b += 1;
        }
        return result;
    }
}