public class Q1 {//لحل هذا السؤال، دعنا نلقي نظرة على تنفيذ دالة addFirst في فئة CircularlyLinkedList كما هو موجود في مقتطف الشفرة 3.16. سنقوم بإعادة تصميم الشرط else في الأسطر 39 و 40 من تلك الدالة لتجنب استخدام أي متغير محلي. دعنا نقوم بذلك خطوة بخطوة:

   // java
    public void addFirst(E e) {
        if (size == 0) {
            head = new Node<>(e, null);
            head.setNext(head);
        } else {
            Node<E> newest = new Node<>(e, head);
            head.setNext(newest);
            head = newest;
        }
        size++;
    }



    public void addFirst(E e) {
        if (size == 0) {
            head = new Node<>(e, null);
            head.setNext(head);
        } else {
            head.setNext(new Node<>(e, head.getNext()));
            head = head.getNext();
        }
        size++;
    }

