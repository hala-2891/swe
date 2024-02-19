public class Q5 {
    public class DoublyLinkedList<E> {
        private Node<E> sentinel;

        public DoublyLinkedList() {
            sentinel = new Node<>(null, null, null);
            sentinel.setNext(sentinel);
            sentinel.setPrev(sentinel);
        }

        // إضافة عنصر في بداية القائمة
        public void addFirst(E element) {
            Node<E> newNode = new Node<>(element, sentinel.getNext(), sentinel);
            sentinel.getNext().setPrev(newNode);
            sentinel.setNext(newNode);
        }

        // إضافة عنصر في نهاية القائمة
        public void addLast(E element) {
            Node<E> newNode = new Node<>(element, sentinel, sentinel.getPrev());
            sentinel.getPrev().setNext(newNode);
            sentinel.setPrev(newNode);
        }

        // إزالة عنصر من القائمة
        public void remove(E element) {
            Node<E> current = sentinel.getNext();

            while (current != sentinel) {
                if (current.getElement().equals(element)) {
                    Node<E> prevNode = current.getPrev();
                    Node<E> nextNode = current.getNext();
                    prevNode.setNext(nextNode);
                    nextNode.setPrev(prevNode);
                    break;
                }

                current = current.getNext();
            }
        }

        // الدوال الأخرى...
    }


}
