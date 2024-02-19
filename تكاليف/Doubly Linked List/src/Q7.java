public class Q7 {
    public class DoublyLinkedListCloneable<E> extends DoublyLinkedList<E> implements Cloneable {
        @Override
        public DoublyLinkedListCloneable<E> clone() {
            DoublyLinkedListCloneable<E> newList = new DoublyLinkedListCloneable<>();

            Node<E> current = head;
            while (current != null) {
                newList.addLast(current.getElement());
                current = current.getNext();
            }

            return newList;
        }
    }


}
