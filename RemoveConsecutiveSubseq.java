import java.util.*;

public class RemoveConsecutiveSubseq {
    public static int[] remove(int[] arr) {
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            // Check if stack is empty or top of stack is different from current element
            if (st.isEmpty() || st.peek() != arr[i]) {
                st.push(arr[i]);
            } else {
                // Remove consecutive elements
                while (!st.isEmpty() && st.peek() == arr[i]) {
                    st.pop();
                }
            }
        }

        // Convert stack to array
        int[] res = new int[st.size()];
        for (int i = res.length - 1; i >= 0; i--) {
            res[i] = st.pop();
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 10, 10, 10, 4, 4, 4, 5, 7, 7, 2};
        int[] result = remove(arr);

        // Print the result array
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
    }
}
