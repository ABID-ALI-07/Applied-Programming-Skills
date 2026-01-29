import java.util.Stack;

class Solution {
    public int[] finalPrices(int[] prices) {
        // Stack stores indices of prices looking for a discount
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < prices.length; i++) {
            // While current price can serve as a discount for the price at stack.peek()
            while (!stack.isEmpty() && prices[stack.peek()] >= prices[i]) {
                int index = stack.pop();
                prices[index] -= prices[i]; // Apply the discount in-place
            }
            stack.push(i);
        }
        
        return prices;
    }
}
