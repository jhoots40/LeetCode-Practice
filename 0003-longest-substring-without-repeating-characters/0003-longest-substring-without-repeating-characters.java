class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int count = 0;
        int max = 0;
        for(int i = 0; i < s.length(); i++) {
            if(map.containsKey(s.charAt(i))) {
                max = Integer.max(max, count);
                count = 1;
                i = map.get(s.charAt(i)) + 1;
                map.clear();
                map.put(s.charAt(i), i);
            } else {
                map.put(s.charAt(i), i);
                count++;
            }
        }
        return Integer.max(count, max);
    }
}