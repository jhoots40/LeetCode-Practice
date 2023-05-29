class Solution {
    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        int[] result = new int[queries.length];
        Arrays.fill(result, 0);
        for(int i = 0; i < queries.length; i++) {
            for(int j = 0; j < words.length; j++) {
                if(f(queries[i]) < f(words[j])) result[i]++;
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