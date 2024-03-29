public class Q6 {//! هنا توجد تنفيذية للخوارزمية التي تم وصفها:

 //   java
    public SinglyLinkedList reverseLinkedList(SinglyLinkedList L) {
        Node previous = null;
        Node current = L.head;

        while (current != null) {
            Node next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        L.head = previous;

        return L;
    }


    //في هذا التنفيذ، يتم استدعاء الدالة reverseLinkedList على كائن من فئة SinglyLinkedList ويتم تمريره كوسيطة L.

    //نقوم بتعيين المؤشر "previous" إلى قيمة null والمؤشر "current" إلى رأس (head) القائمة L.

    // نقوم بتكرار الخطوات التالية حتى يصبح المؤشر "current" هو العقدة الأخيرة في القائمة:
    //  - نقوم بتعيين المؤشر "next" ليشير إلى العقدة التالية بعد "current".
          //  - نقوم بتحويل اتجاه الارتباط للعقدة الحالية بحيث يشير "current.next" إلى العقدة السابقة بدلاً من العقدة التالية.
//- نقوم بتحريك المؤشر "previous" إلى العقدة الحالية (التي كانت في البداية العقدة السابقة).
          //  - نقوم بتحريك المؤشر "current" إلى العقدة التالية (التي كانت في البداية العقدة الحالية).

   // بعد انتهاء الخوارزمية، نقوم بتحويل اتجاه الارتباط للعقدة الأخيرة بحيث يشير "current.next" إلى العقدة السابقة بدلاً من العقدة التالية.

  //  ثم نقوم بتحديث رأس القائمة L ليشير إلى العقدة الأخيرة (التي أصبحت الآن العقدة الأولى بعد عكس القائمة).

   // أخيرًا، نقوم بإرجاع القائمة المعكوسة L كنتيجة.

   // أتمنى أن يكون هذا المثال مفيدًا. إذا كان لديك أي أسئلة أخرى، فلا تتردد في طرحها.
}
