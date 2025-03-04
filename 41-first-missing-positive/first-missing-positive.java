class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> numsSet = new HashSet<>();
        
        for (int num : nums) {
            if (num > 0) {
                numsSet.add(num);
            }
        }

        int k = 1; 

        while (numsSet.contains(k)) {
            k++;
        }

        return k; 
    }
}