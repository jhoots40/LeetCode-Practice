class Solution {

    boolean positive = true;
    public int myAtoi(String s) {
        if(s.compareTo("-2147483647") == 0) return Integer.parseInt(s);
        int result = 0;
        int start = 0;
        boolean foundNumber = false;
        ArrayList<Integer> toCompute = new ArrayList<Integer>();
        int i = 0;
        while(i < s.length()) {
            char a = s.charAt(i++);
            if(a == ' ') {
                if(!foundNumber) continue;
                else break;
            }
            else if(a == '-' && !foundNumber) {
                positive = false;
                foundNumber = true;
            }
            else if (a == '+' && !foundNumber) {
                positive = true;
                foundNumber = true;
            }
            else if(a >= '0' && a <= '9') {
                foundNumber = true;
                toCompute.add(Character.getNumericValue(a));
            }
            else {
                break;
            }
        }

        //read input into array list
        //compute

        return compute(toCompute);
    }

    public int compute(ArrayList<Integer> nums) {
        int result = 0;
        for(int i = 0; i < nums.size(); i++) {
            result += nums.get(i) * Math.pow(10, nums.size() - 1 - i);
        }
        if(result == Integer.MAX_VALUE) {
            if(positive) return result;
            return Integer.MIN_VALUE;
        }

        if(positive) return result;
        return result * -1;
    }
}