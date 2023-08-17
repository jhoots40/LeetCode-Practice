class Solution {
    public String decodeCiphertext(String encodedText, int rows) {
        if(rows == 1) return encodedText;
        
        int columns = encodedText.length() / rows;
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < columns; i++) {
            for(int j = i; j < encodedText.length(); j += columns + 1) {
                sb.append(encodedText.charAt(j));
            }
        }
        
        return sb.toString().stripTrailing();
    }
}