public class Q4 {
import java.util.Arrays;

    public class ArrayStackClone implements Cloneable {
        private Object[] elements;
        private int top;

        public ArrayStackClone(int capacity) {
            elements = new Object[capacity];
            top = -1;
        }

        public void push(Object element) {
            if (top == elements.length - 1) {
                throw new StackOverflowError();
            }
            top++;
            elements[top] = element;
        }

        public Object pop() {
            if (isEmpty()) {
                throw new IllegalStateException("Stack is empty");
            }
            Object element = elements[top];
            elements[top] = null;
            top--;
            return element;
        }

        public boolean isEmpty() {
            return top == -1;
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            ArrayStackClone clonedStack = (ArrayStackClone) super.clone();
            clonedStack.elements = Arrays.copyOf(elements, elements.length);
            return clonedStack;
        }
    }



}
