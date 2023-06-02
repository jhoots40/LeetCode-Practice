class Solution {
    public String capitalizeTitle(String title) {
        List<String> words = new ArrayList<>();
        String result = "";
        
        int start = 0;
        for(int i = 0; i < title.length(); i++) {
            if(title.charAt(i) == ' ') {
                words.add(title.substring(start, i));
                start = i + 1;
            }
        }
        words.add(title.substring(start, title.length()));
        
        for(String s : words) {
            if(s.length() <= 2) {
                for(int i = 0; i < s.length(); i++) {
                    if(s.charAt(i) < 97) result += (char) (s.charAt(i) + 32);
                    else result += (char) s.charAt(i);
                }
            }
            else {
                if(s.charAt(0) >= 97) result += (char) (s.charAt(0) - 32);
                else result += (char) s.charAt(0);
                
                for(int i = 1; i < s.length(); i++) {
                    if(s.charAt(i) < 97) result += (char) (s.charAt(i) + 32);
                    else result += (char) s.charAt(i);
                } 
            }
            result += ' ';
        }
        
        return result.substring(0, result.length() - 1);
    }
}