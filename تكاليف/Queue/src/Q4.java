public class Q4 {
import java.util.LinkedList;
import java.util.Queue;

    public class JosephusProblem {
        public static int josephus(int n, int k) {
            Queue<Integer> queue = new LinkedList<>();

            // إضافة أرقام الأشخاص إلى الطابور
            for (int i = 1; i <= n; i++) {
                queue.add(i);
            }

            while (queue.size() > 1) {
                // إزالة الشخص الأول ووضعه في المؤقت
                for (int i = 0; i < k - 1; i++) {
                    int person = queue.remove();
                    queue.add(person);
                }

                // إزالة الشخص الأول من بداية الطابور ووضعه في المؤقت
                queue.remove();
            }

            // الشخص الناجي في المشكلة جوزيفوس
            return queue.peek();
        }

        public static void main(String[] args) {
            int n = 7; // عدد الأشخاص في الدائرة
            int k = 3; // عدد الأشخاص الذين يتم تخطيهم في كل دورة

            int survivor = josephus(n, k);
            System.out.println("The survivor in Josephus problem is person number: " + survivor);
        }
    }


}
