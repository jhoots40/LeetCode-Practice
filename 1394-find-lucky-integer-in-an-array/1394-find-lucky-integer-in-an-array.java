class Solution {
    public int findLucky(int[] arr) {
        Arrays.sort(arr);
        
        int current = 0;
        int count = 0;
        for(int i = arr.length - 1; i >= 0; i--) {
            if(current != arr[i]) {
                if(i + 1 <= arr.length - 1 && count == arr[i + 1]) return count;
                count = 1;
                current = arr[i];
            }
            else {
                count++;
            }
        }
        
        if(count == arr[0]) return count;
        return -1;
    }
}