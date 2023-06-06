class Solution {
    public void duplicateZeros(int[] arr) {
        int i = 0;
        
        while(i < arr.length) {
            if(arr[i] == 0) {
                shift(arr, i);
                i++;
            }
            i++;
        }

    }
    
    public void shift(int[] arr, int start) {
        int prev = arr[start];
        arr[start] = 0;
        int i = start + 1;
        while(i < arr.length) {
            int temp = arr[i];
            arr[i] = prev;
            prev = temp;
            i++;
        }
    }
}