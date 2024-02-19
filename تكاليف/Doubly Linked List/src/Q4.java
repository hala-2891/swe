public class Q4 {
    public DoublyLinkedList<E> concatenateLists(DoublyLinkedList<E> L, DoublyLinkedList<E> M) {
        DoublyLinkedList<E> LPrime = new DoublyLinkedList<>();
        LPrime.setHead(L.getHead());
        LPrime.setTrailer(M.getTrailer());

        Node<E> tailL = L.getTrailer().getPrev();
        Node<E> headM = M.getHead().getNext();

        if (tailL == L.getHead() && headM == M.getTrailer()) {
            return LPrime;
        }

        L.getTrailer().setPrev(M.getTrailer());
        M.getTrailer().setNext(L.getTrailer());

        tailL.setNext(headM);
        headM.setPrev(tailL);

        return LPrime;
    }


}
