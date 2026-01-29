import java.util.Stack;

class Task_21{
    // Stack of pairs: <price, span>
    // The stack maintains elements in decreasing order of price.
    private Stack<int[]> stack;

    public StockSpanner() {
        // Initialize an empty stack
        stack = new Stack<>();
    }
    
    public int next(int price) {
        // Initialize the span for the current price to 1
        int span = 1;
        
        // While the stack is not empty and the top element's price
        // is less than or equal to the current price
        while (!stack.isEmpty() && stack.peek()[0] <= price) {
            // Add the span of the top element to the current span
            span += stack.pop()[1];
        }
        
        // Push the current price and its calculated span onto the stack
        stack.push(new int[]{price, span});
        
        // Return the calculated span
        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
