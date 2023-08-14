class Solution {
    public int findComplement(int num) {
        String binary = "";
        
        while(num != 0) {
            binary += "" + num % 2;
            num /= 2;
        }
        
        for(int i = 0; i < binary.length(); i++) {
            if(binary.charAt(i) == '0') {
                num += Math.pow(2, i);
            }
        }
        
        return num;
    }
}