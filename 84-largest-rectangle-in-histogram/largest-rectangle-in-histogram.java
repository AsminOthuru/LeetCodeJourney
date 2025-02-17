class Solution {
    public int largestRectangleArea(int[] heights) {
        int[] nsr=nextSmallerRight(heights);
        int[] nsl=nextSmallerLeft(heights);
        int maxArea = 0;
        

        for(int i=0;i<heights.length;i++){
            int height=heights[i];
            int width=nsr[i]-nsl[i]-1;
            int area=height*width;
            maxArea = Math.max(maxArea, area);
        }

      return maxArea;
        
    }
    public int[] nextSmallerRight(int[] arr) {
        int[] result = new int[arr.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            result[i] = stack.isEmpty() ? arr.length : stack.peek();
            stack.push(i);
        }

        return result;
    }

    public int[] nextSmallerLeft(int[] arr) {
        int[] result = new int[arr.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            result[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }

        return result;
    }
}