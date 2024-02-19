public class Q3 {
    public boolean equals(DoublyLinkedList<E> otherList) {
        if (size() != otherList.size()) {
            return false;
        }

        Node<E> currentThis = head.getNext();
        Node<E> currentOther = otherList.head.getNext();

        while (currentThis != trailer) {
            if (!currentThis.getElement().equals(currentOther.getElement())) {
                return false;
            }

            currentThis = currentThis.getNext();
            currentOther = currentOther.getNext();
        }

        return true;
    }


}
