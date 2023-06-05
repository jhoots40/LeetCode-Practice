class Solution {
    public String reverseVowels(String s) {
        List<Character> l = new ArrayList<>();
        
        
        for(int i = s.length() - 1; i >= 0; i--) {
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || 
               s.charAt(i) == 'o' || s.charAt(i) == 'u' || s.charAt(i) == 'A' || 
               s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || 
               s.charAt(i) == 'U' ) {
                l.add(s.charAt(i));
            }
        }
        
        String result = "";
        
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || 
               s.charAt(i) == 'o' || s.charAt(i) == 'u' || s.charAt(i) == 'A' || 
               s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || 
               s.charAt(i) == 'U' ) {
                result += l.remove(0);
            }
            else {
                result += s.charAt(i);
            }
        }
        
        return result;
    }
}