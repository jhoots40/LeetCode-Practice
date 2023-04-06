class Solution {
    public String countAndSay(int n) {
        if (n == 1) return "1"; 
        return formula(n, 2, "1");
    }

    public String formula(int n, int curr, String result) {
        StringBuilder s = new StringBuilder();
        char current = result.charAt(0);
        int count = 1;
        for(int i = 1; i < result.length(); i++) {
            if(current == result.charAt(i)) {
                count++;
            }
            else {
                s.append(count);
                s.append(current);
                count = 1;
                current = result.charAt(i);
            }
        }
        s.append(count);
        s.append(current);
        if(n == curr) {
            return s.toString();
        }
        return formula(n, curr + 1, s.toString());
    }
}