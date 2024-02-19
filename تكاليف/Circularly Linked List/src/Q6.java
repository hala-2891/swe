public class Q6 {
    public CircularlyLinkedList<E> clone() { // تسوي نسخه بنفس القيم والحاله الداخلبه للكائن او النود
        CircularlyLinkedList<E> newList = new CircularlyLinkedList<>();

        if (isEmpty()) {
            return newList;
        }

        Node<E> currentNode = head;

        // إنشاء عقدة جديدة لكل عنصر وتوصيلها ببعضها البعض
        do {
            newList.addLast(currentNode.getElement());
            currentNode = currentNode.getNext();
        } while (currentNode != head);

        return newList;
    }


}
