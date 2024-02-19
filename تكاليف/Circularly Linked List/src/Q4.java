public class Q4 {
    //java
    public boolean sameSequence(CircularlyLinkedList<E> L, CircularlyLinkedList<E> M) { //تتحقق ما اذا كانت النودز لها نفس التسلسل او لا
        Node currentL = L.getTail();
        Node currentM = M.getTail();

        // تحديد نقطة البداية في القائمة L
        // تحديد نقطة البداية في القائمة M

        do {
            if (!currentL.getElement().equals(currentM.getElement())) {
                return false;  // العناصر غير متساوية، القوائم لا تحتوي على نفس التسلسل
            }

            currentL = currentL.getNext();  // انتقال إلى العقدة التالية في القائمة L
            currentM = currentM.getNext();  // انتقال إلى العقدة التالية في القائمة M
        } while (currentL != L.getTail());  // حتى يتم زيارة جميع العقد في القائمة L

        // مقارنة نهائية بين العناصر
        if (!currentL.getElement().equals(currentM.getElement())) {
            return false;  // العناصر غير متساوية، القوائم لا تحتوي على نفس التسلسل
        }

        return true;  // القوائم تحتوي على نفس التسلسل
    }
}
