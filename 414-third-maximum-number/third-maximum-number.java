class Solution {
    public int thirdMax(int[] nums) {
        HashSet<Integer> uniqueNumbers = new HashSet<>();
        for (int num : nums) {
            uniqueNumbers.add(num);
        }

        Integer[] arr = uniqueNumbers.toArray(new Integer[0]);
        int size = arr.length;

        if (size == 1) {
            return arr[0];
        }

        Arrays.sort(arr, Collections.reverseOrder());

        return (size >= 3) ? arr[2] : arr[0];
    }
}