class Solution {
    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        //fill result array to 0
        int[] result = new int[queries.length];
        Arrays.fill(result, 0);
        
        //fill a w array which contains f(W) for all W in words
        int[] w = new int[words.length];
        for(int i = 0; i < w.length; i++) w[i] = f(words[i]);
        
        for(int i = 0; i < queries.length; i++) {
            int query = f(queries[i]);
            for(int j = 0; j < w.length; j++) {
                if(query < w[j]) result[i]++;
            }
        }
        return result;
    }
    
    public int f(String s) {
        char current = '|';
        int count = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) < current) {
                current = s.charAt(i);
                count = 1;
            }
            else if (s.charAt(i) == current) {
                count++;
            }
        }
        return count;
    }
}