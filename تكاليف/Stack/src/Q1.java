public class Q1 {
import java.util.Stack;

    public class StackTransfer {
        public static void transfer(Stack<Integer> S, Stack<Integer> T) {
            if (S.isEmpty() || T.isEmpty()) {
                throw new IllegalArgumentException("Both stacks must not be empty.");
            }

            Stack<Integer> TempStack = new Stack<>();

            while (!S.isEmpty()) {
                TempStack.push(S.pop());
            }

            while (!TempStack.isEmpty()) {
                T.push(TempStack.pop());

            }
        }
    }
.
}
