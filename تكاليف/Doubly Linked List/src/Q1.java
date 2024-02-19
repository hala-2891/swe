public class Q1 {

    public Node<E> findMiddleNode() {
        Node<E> slowPointer = header.getNext();
        Node<E> fastPointer = header.getNext();

        while (fastPointer != trailer && fastPointer.getNext() != trailer) {
            slowPointer = slowPointer.getNext();
            fastPointer = fastPointer.getNext().getNext();
        }

        return slowPointer;
    }


}
