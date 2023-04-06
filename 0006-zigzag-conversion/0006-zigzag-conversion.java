class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 0) return "error";
        if(numRows == 1) return s;
        ArrayList<Character>[] output = new ArrayList[numRows];
        for(int i = 0; i < output.length; i++) {
            output[i] = new ArrayList<Character>();
        }
        boolean zagging = false;
        int k = 0;
        while(k < s.length()) {
            if(!zagging) {
                for(int i = 0; i < numRows; i++) {
                    output[i].add(s.charAt(k++));
                    if(k >= s.length()) break;
                }
                if(numRows != 2) zagging = true;
            } else {
                for(int i = output.length - 2; i > 0; i--) {
                    output[i].add(s.charAt(k++));
                    if(k >= s.length()) break;
                }
                zagging = false;
            }
        }
        String result = "";
        for(int i = 0; i < output.length; i++) {
            for(int j = 0; j < output[i].size(); j++) {
                result += output[i].get(j);
            }
        }
        return result;
    }
}