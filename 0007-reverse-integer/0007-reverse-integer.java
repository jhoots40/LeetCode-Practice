class Solution {
    public int reverse(int x) {
        if(x == Integer.MIN_VALUE) return 0;
        int update = x;
        boolean negative = false;
        if(update < 0) {
            negative = true;
            update = update * -1;
        }
        int result = 0;
        int size = log10(update);
        for(int i = 0; i < size + 1; i++) {
            int compute = update % 10;
            result += Math.pow(10, (size - i)) * compute;
            update = update / 10;
        }
        if(result == Integer.MAX_VALUE || result == Integer.MIN_VALUE) return 0;
        if(negative) return result * -1;
        return result;
    }

    public int log10(int N)
    {
        int result = (int)(Math.log(N) / Math.log(10));
        return result;
    }
}