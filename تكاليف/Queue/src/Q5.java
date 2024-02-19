public class Q5 {
import java.util.LinkedList;
import java.util.Queue;

    public class RoundRobinScheduling {
        public static void schedule(Queue<String> tasks, int quantum) {
            while (!tasks.isEmpty()) {
                String task = tasks.remove();
                System.out.println("Executing task: " + task);

                if (task.length() <= quantum) {
                    // المهمة مكتملة
                    System.out.println("Task " + task + " completed.");
                } else {
                    // المهمة لم تكتمل، إعادتها إلى الطابور
                    System.out.println("Task " + task + " partially completed. Adding it back to the queue.");
                    tasks.add(task.substring(quantum));
                }
            }
        }

        public static void main(String[] args) {
            Queue<String> tasks = new LinkedList<>();
            tasks.add("Task1");
            tasks.add("Task2");
            tasks.add("Task3");
            tasks.add("Task4");
            tasks.add("Task5");

            int quantum = 2; // وقت التنفيذ القصير (كوانتم)

            schedule(tasks, quantum);
        }
    }


}
