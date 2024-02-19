public class Q5 {
    public Pair<CircularlyLinkedList<E>, CircularlyLinkedList<E>> splitList(CircularlyLinkedList<E> L) {
        // إذا كانت القائمة L فارغة، فقم بإرجاع قائمتين فارغتين
        if (L.isEmpty()) {
            return new Pair<>(new CircularlyLinkedList<>(), new CircularlyLinkedList<>());
        }

        Node slowRunner = L.getHead();
        Node fastRunner = L.getHead();

        // تحديد نقطة الانقسام في القائمة
        while (fastRunner.getNext() != L.getHead() && fastRunner.getNext().getNext() != L.getHead()) {
            slowRunner = slowRunner.getNext();
            fastRunner = fastRunner.getNext().getNext();
        }

        // إنشاء القائمة الأولى والقائمة الثانية
        CircularlyLinkedList<E> list1 = new CircularlyLinkedList<>();
        CircularlyLinkedList<E> list2 = new CircularlyLinkedList<>();

        list1.setHead(L.getHead());
        list1.setTail(slowRunner);

        list2.setHead(slowRunner.getNext());
        list2.setTail(L.getTail());

        // ربط القوائم المتصلة دوريًا
        list1.getTail().setNext(list2.getHead());
        list2.getTail().setNext(list1.getHead());

        return new Pair<>(list1, list2);
    }


}
