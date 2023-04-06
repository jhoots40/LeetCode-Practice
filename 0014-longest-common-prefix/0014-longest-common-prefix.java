class Solution {
    public String longestCommonPrefix(String[] strs) {
        int min = Integer.MAX_VALUE;
        String result = "";
        
        for(int i = 0; i < strs.length; i++) {
            if(strs[i].length() < min)
                min = strs[i].length();
        }

        for(int i = 0; i < min; i++) {
            int k = 0;
            boolean check = true;
            while(k + 1 < strs.length) {
                if(strs[k].charAt(i) == strs[k + 1].charAt(i)) {
                    k++;
                    continue;
                } else {
                    check = false;
                    break;
                }
            }
            
            if(check == true)
                result += strs[0].charAt(i);
            else break;
        }
        
        return result;
    }
}
