package DataStructure;

import java.util.Stack;

public class MinStack {
	Stack<Integer> stack;
    Stack<Integer> min;
    int minNum = Integer.MAX_VALUE;
    public MinStack() {
        // do initialize if necessary
        stack = new Stack<Integer>();
        min = new Stack<Integer>();
    }

    public void push(int number) {
        // write your code here
        stack.push(number);
        if(min.isEmpty() || number <= min.peek()){
            min.push(number);
        }
    }

    public int pop() {
        // write your code here
        int num = stack.pop();
        if(!min.isEmpty() && num == min.peek()){
            min.pop();
        }
        return num;
    }

    public int min() {
        // write your code here
        if(min.isEmpty()){
            return 0;
        }else{
            return min.peek();
        }
    }
}
