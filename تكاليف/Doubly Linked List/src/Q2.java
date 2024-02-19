public class Q2 {

    //java
    public int size() {
        int count = 0;
        Node<E> current = head.getNext();

        while (current != trailer) {
            count++;
            current = current.getNext();
        }

        return count;
    }


}
