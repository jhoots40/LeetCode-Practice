class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int poisonedCount = 0;
        
        int lastPoisoned = timeSeries[0];
        
        for(int i = 1; i < timeSeries.length; i++) {
            if(timeSeries[i] <= lastPoisoned + duration - 1)
                poisonedCount += timeSeries[i] - lastPoisoned;
            else poisonedCount += duration;
            lastPoisoned = timeSeries[i];
        }
        
        return poisonedCount + duration;
    }
}