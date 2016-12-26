package DataStructure;

import java.util.Collections;
import java.util.PriorityQueue;

public class DataStreamMedian {
	public static int[] medianII(int[] nums) {
        // write your code here
		 if(nums == null)
	            return null;  
	        int[] res = new int[nums.length];  
	          
	        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
	        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(1000, Collections.reverseOrder());
	        
	        res[0] = nums[0];  
	        maxHeap.add(nums[0]);  

	        for(int i = 1; i < nums.length; i++) {  
	            int x = maxHeap.peek();  
	            if(nums[i] <= x) {  
	                maxHeap.add(nums[i]);  
	            } else {  
	                minHeap.add(nums[i]);  
	            }  
	            if(maxHeap.size() > minHeap.size()+1 ) { 
	                minHeap.add(maxHeap.poll());  
	            } else if(maxHeap.size() < minHeap.size()) {  
	                maxHeap.add(minHeap.poll());  
	            }  
	            res[i] = maxHeap.peek();  
	        }  
	        return res;
    }
	public static void main(String[] args) {
		int[] nums = {1,5};
		medianII(nums);
	}
}
