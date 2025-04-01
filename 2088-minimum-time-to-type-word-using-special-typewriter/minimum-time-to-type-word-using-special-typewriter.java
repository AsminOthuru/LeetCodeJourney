class Solution {
    public int minTimeToType(String word) {
        int time = 0;
        char current = 'a'; 
        
        for (char target : word.toCharArray()) {
            int distance = Math.abs(target - current);
            int circularDistance = Math.min(distance, 26 - distance);
            
            time += circularDistance + 1; 
            current = target;
        }
        
        return time;
    }
}
