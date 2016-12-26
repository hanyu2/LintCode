package DataStructure;

import java.util.Stack;

public class LargestRectangleInHistogram {
	public int largestRectangleArea(int[] height) {
        // write your code here
        Stack<Integer> stack = new Stack<Integer>();
        int max = 0;
        for(int i = 0; i <= height.length; i++){
            int h = i == height.length ? 0 : height[i];
            if(stack.isEmpty() || h >= height[stack.peek()]){
                stack.push(i);
            }else{
                int dp = stack.pop();
                int area = height[dp] * (stack.isEmpty() ? i : i - 1 - stack.peek()) ;
                max = Math.max(max, area);
                i--;
            }
        }
        return max;
    }
}
