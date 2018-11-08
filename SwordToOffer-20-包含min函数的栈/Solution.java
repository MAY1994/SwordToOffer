import java.util.Stack;

public class Solution {
    Stack<Integer> stack = new Stack<Integer>();
    Stack<Integer> minstack = new Stack<Integer>();
    public void push(int node) {
        stack.push(node);
        if(!minstack.isEmpty()){
            if(node <= this.top())
                minstack.push(node);
        }
        else
        	minstack.push(node);
    }
    
    public void pop() {
        int tmp=stack.pop();
        if(tmp == this.top()){
            minstack.pop();
        }
    }
    
    public int top() {
        return minstack.peek();
    }
    
    public int min() {
        return this.top();
    }
}