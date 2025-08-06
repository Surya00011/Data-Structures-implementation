package Queue.circularQueue;

import java.util.List;

public class Main {
    public static void main(String[] args) {
         Queue<Integer> queue = new Queue<>();
         queue.enqueueAll(List.of(1,2,3,4,5,6,7,8,9));
         System.out.println(queue);
         Queue<Integer> duplicate = new Queue<>(queue);
         System.out.println(queue.size());
         for (int i=1;i<=queue.size();i++) {
             System.out.println("Peek: " + queue.peek());
             System.out.println("Dequeued: " + queue.dequeue());
         }
        System.out.println(duplicate.dequeueAll());

    }
}
