class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> occur = new HashMap<>();
        HashMap<Integer, Integer> used = new HashMap<>();
        
        for(int i = 0; i < arr.length; i++)
        {
            if(used.containsKey(arr[i])) continue;
            int occurrences = 1;
            for(int j = i + 1; j < arr.length; j++) if(arr[i] == arr[j]) occurrences++;
            if(occur.containsKey(occurrences)) return false;
            occur.put(occurrences, 0);
            used.put(arr[i], 0);
        }
        return true;
    }
}