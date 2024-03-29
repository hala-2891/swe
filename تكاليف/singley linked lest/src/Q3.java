public class Q3 {//بالتأكيد! هنا تنفيذ لطريقة size() في فئة SinglyLinkedList بشرط عدم الاحتفاظ بمتغير الحجم كمتغير فردي.

    // هذه الحالة، يمكننا تحديد حجم القائمة المرتبطة بالاعتماد على عدد العقد التي تمر عبرها.

    //هنا التنفيذ:

    //java
    public int size() {
        int count = 0;
        Node currentNode = head;

        while (currentNode != null) {
            count++;
            currentNode = currentNode.next;
        }

        return count;
    }


   // في هذا التنفيذ، نقوم بتهيئة متغير العداد count إلى القيمة الصفرية. ثم نقوم بتعيين المؤشر currentNode على العقدة الأولى في القائمة (head).

   // نقوم بتكرار الحلقة حتى نصل إلى نهاية القائمة المرتبطة، حيث يصبح currentNode يساوي null. في كل تكرار، نزيد قيمة العداد count بواحد وننقل المؤشر currentNode إلى العقدة التالية في القائمة.

   // في النهاية، يتم إرجاع قيمة العداد count التي تم تحديدها بعد عد العقد في القائمة المرتبطة.

    //هذا هو التنفيذ الذي يعتمد على عد العقد التي تمر عبرها لتحديد حجم القائمة المرتبطة بدون الاحتفاظ بمتغير الحجم كمتغير فردي.

    // أتمنى أن يكون الشرح واضحًا ومفهومًا. إذا كان لديك أي أسئلة إضافية، فلا تتردد في طرحها.
}
