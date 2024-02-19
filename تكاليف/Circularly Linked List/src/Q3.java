public class Q3 {
    public boolean equals(CircularlyLinkedList<E> other) {
        if (size() != other.size()) {
            return false;  // إذا كانت الأحجام مختلفة، فإن القوائم لا يمكن أن تكون متساوية
        }

        Node currentThis = tail; // قم بإنشاء متغيرين، currentThis و currentOther، وقم بتعيينهما للعقدة tail في القوائم المقابلة.

        Node currentOther = other.tail;

        do {
            currentThis = currentThis.getNext();
            currentOther = currentOther.getNext();

            if (!currentThis.getElement().equals(currentOther.getElement())) {
                return false;  // إذا كانت العناصر مختلفة، فإن القوائم ليست متساوية
            }
        } while (currentThis != tail);

        return true;  // جميع العناصر متساوية
    }







/