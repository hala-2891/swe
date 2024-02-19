public class Q2 { @SuppressWarnings("unchecked")
    @Override
    public ArrayQueue<E> clone() {
        try {
            ArrayQueue<E> clonedQueue = (ArrayQueue<E>) super.clone();
            clonedQueue.data = data.clone();
            return clonedQueue;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(); // لن تحدث استثناءً نظرًا لأن ArrayQueue قابلة للتكرار
        }
    }


    @SuppressWarnings("unchecked")
    @Override
    public ArrayQueue<E> clone() {
        try {
            ArrayQueue<E> clonedQueue = (ArrayQueue<E>) super.clone();
            clonedQueue.data = data.clone();
            return clonedQueue;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @SuppressWarnings("unchecked")
    @Override
    public ArrayQueue<E> clone() {
        try {
            ArrayQueue<E> clonedQueue = (ArrayQueue<E>) super.clone();
            clonedQueue.data = data.clone();
            return clonedQueue;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

