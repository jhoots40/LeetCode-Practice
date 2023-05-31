class Solution {
    public int maximumDetonation(int[][] bombs) {
        int exploded = 0;
        
        for(int i = 0; i < bombs.length; i++)
        {
            HashMap<Integer, Integer> map = new HashMap<>();
            map.put(i, 0);
            dfs(i, bombs, map);
            exploded = Math.max(exploded, map.size());
        }
        
        return exploded;
    }
    
    private void dfs(int current, int[][] bombs, HashMap<Integer, Integer> exploded)
    {
        int x = bombs[current][0], y = bombs[current][1], r = bombs[current][2];
        
        for(int i = 0; i < bombs.length; i++) {
            if(i == current) continue;
            int x_i = bombs[i][0], y_i = bombs[i][1], r_i = bombs[i][2];
            double distance = Math.sqrt(Math.pow(x_i - x, 2) + Math.pow(y_i - y, 2));
            if(distance <= r) 
            {
                if(exploded.containsKey(i)) continue;
                exploded.put(i, 0);
                dfs(i, bombs, exploded);
            }
        }
    }
}