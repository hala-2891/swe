public class Q6 {


    public class CircularDoublyLinkedList<E> {
        private Node<E> head;
        private Node<E> tail;

        public CircularDoublyLinkedList() {
            head = null;
            tail = null;
        }

        public void addFirst(E element) {
            Node<E> newNode = new Node<>(element);
            if (head == null) {
                newNode.setNext(newNode);
                newNode.setPrev(newNode);
                head = newNode;
                tail = newNode;
            } else {
                newNode.setNext(head);
                newNode.setPrev(tail);
                head.setPrev(newNode);
                tail.setNext(newNode);
                head = newNode;
            }
        }

        public void remove(E element) {
            if (head == null) {
                return;
            }

            Node<E> current = head;
            while (current != null) {
                if (current.getElement().equals(element)) {
                    if (current == head && current == tail) {
                        head = null;
                        tail = null;
                    } else if (current == head) {
                        head = head.getNext();
                        head.setPrev(tail);
                        tail.setNext(head);
                    } else if (current == tail) {
                        tail = tail.getPrev();
                        tail.setNext(head);
                        head.setPrev(tail);
                    } else {
                        current.getPrev().setNext(current.getNext());
                        current.getNext().setPrev(current.getPrev());
                    }
                    return;
                }
                current = current.getNext();
            }
        }

        public void rotate() {
            if (head != null) {
                head = head.getNext();
                tail = tail.getNext();
            }
        }

        public void rotateBackward() {
            if (head != null) {
                head = head.getPrev();
                tail = tail.getPrev();
            }
        }

        // الدوال الأخرى...
    }


    //باستخدام هذا الكود، يمكننا تنفيذ قائمة مزدوجة الارتباط الدائرية بدون عقد
}
