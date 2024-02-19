public class Q3 {
    public void concatenate(LinkedQueue<E> Q2) {
        if (Q2.isEmpty()) {
            return; // لا يوجد عناصر في Q2 لدمجها
        }

        if (isEmpty()) {
            front = Q2.front;
        } else {
            back.next = Q2.front;
        }

        back = Q2.back;
        size += Q2.size;

        Q2.front = null;
        Q2.back = null;
        Q2.size = 0;
    }



