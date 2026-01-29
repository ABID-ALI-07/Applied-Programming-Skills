import java.util.Stack;

class Task_20 {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] answer = new int[n];
        // Stack to store the indices of the temperatures array
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            // While the current temperature is warmer than the temperature 
            // at the index stored at the top of the stack
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int prevIndex = stack.pop();
                // Calculate the difference in days
                answer[prevIndex] = i - prevIndex;
            }
            // Push the current index onto the stack
            stack.push(i);
        }

        return answer;
    }
}
