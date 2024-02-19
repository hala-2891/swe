public class Q2 {
    public int size() {
        Node current = tail;  // ابدأ من العقدة الأخيرة (الذيل)
        int count = 0;  // قم بتهيئة العداد إلى 0

        if (current != null) {
            count = 1;  // زيادة العداد بمقدار 1 للعقدة الأخيرة (الذيل)
            current = current.getNext();  // انتقل إلى العقدة التالية
        }

        while (current != tail) {
            count++;  // زيادة العداد بمقدار 1 لكل عقدة
            current = current.getNext();  // انتقل إلى العقدة التالية
        }

        return count;
    }

