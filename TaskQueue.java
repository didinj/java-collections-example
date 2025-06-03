import java.util.LinkedList;
import java.util.Queue;

public class TaskQueue {
    public static void main(String[] args) {
        Queue<String> taskQueue = new LinkedList<>();
        taskQueue.add("Task 1");
        taskQueue.add("Task 2");

        while (!taskQueue.isEmpty()) {
            System.out.println("Processing: " + taskQueue.poll());
        }
    }
}
