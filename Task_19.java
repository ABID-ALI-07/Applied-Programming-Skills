import java.util.*;

class Task_19 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // Map to store: element -> its next greater element
        Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        // Monotonic stack approach to find next greater for all elements in nums2
        for (int num : nums2) {
            while (!stack.isEmpty() && stack.peek() < num) {
                map.put(stack.pop(), num);
            }
            stack.push(num);
        }

        // Build the result for nums1 using the precomputed map
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            result[i] = map.getOrDefault(nums1[i], -1);
        }

        return result;
    }
}
