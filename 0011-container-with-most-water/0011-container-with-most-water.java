class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int i = 0, j = height.length - 1;

        while(i < j) {
            if(height[i] < height[j]) {
                maxArea = Integer.max(maxArea, height[i] * (j - i));
                i++;
            } else {
                maxArea = Integer.max(maxArea, height[j] * (j - i));
                j--;
            }
        }
        return maxArea;
    }
}