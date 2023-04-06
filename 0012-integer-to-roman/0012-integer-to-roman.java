class Solution {
    public String intToRoman(int num) {
        String result = "";

        // M
        int calculate = num / 1000;
        num = num % 1000;
        for(int i = 0; i < calculate; i++) {
            result += "M";
        }

        calculate = num / 100;
        num = num % 100;
        if(calculate == 9) {
            result += "CM";
        }
        else if (calculate > 4) {
            result += "D";
            for(int i = 0; i < calculate - 5; i++) {
                result += "C";
            }
        }
        else if (calculate == 4) {
            result += "CD";
        }
        else {
            for(int i = 0; i < calculate; i++) {
                result += "C";
            }
        }

        calculate = num / 10;
        num = num % 10;
        if(calculate == 9) {
            result += "XC";
        }
        else if (calculate > 4) {
            result += "L";
            for(int i = 0; i < calculate - 5; i++) {
                result += "X";
            }
        }
        else if (calculate == 4) {
            result += "XL";
        }
        else {
            for(int i = 0; i < calculate; i++) {
                result += "X";
            }
        }

        if(num == 9) {
            result += "IX";
        }
        else if (num > 4) {
            result += "V";
            for(int i = 0; i < num - 5; i++) {
                result += "I";
            }
        }
        else if (num == 4) {
            result += "IV";
        }
        else {
            for(int i = 0; i < num; i++) {
                result += "I";
            }
        }

        return result;
    }
}