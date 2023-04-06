class Solution {
    public int romanToInt(String s) {
        int result = 0;

        for(int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if(current == 'I') {
                if(i + 1 == s.length()) {
                    result += 1;
                    continue;
                }
                char next = s.charAt(++i);
                if(next == 'V') {
                    result += 4;
                    continue;
                }
                if(next == 'X') {
                    result += 9;
                    continue;
                }
                i--;
                result += 1;
            }
            else if(current == 'V') result += 5;
            else if(current == 'X') {
                if(i + 1 == s.length()) {
                    result += 10;
                    continue;
                }
                char next = s.charAt(++i);
                if(next == 'L') {
                    result += 40;
                    continue;
                }
                if(next == 'C') {
                    result += 90;
                    continue;
                }
                i--;
                result += 10;
            }
            else if(current == 'L') result += 50;
            else if(current == 'C') {
                if(i + 1 == s.length()) {
                    result += 100;
                    continue;
                }
                char next = s.charAt(++i);
                if(next == 'D') {
                    result += 400;
                    continue;
                }
                if(next == 'M') {
                    result += 900;
                    continue;
                }
                i--;
                result += 100;
            }
            else if(current == 'D') result += 500;
            else if(current == 'M') result += 1000;
        }

        return result;
    }
}