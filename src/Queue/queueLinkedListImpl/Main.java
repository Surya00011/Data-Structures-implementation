package Queue.queueLinkedListImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Queue<String> pplQueue = new Queue<>();
        pplQueue.enqueue("Surya");
        pplQueue.enqueue("Arthur");
        pplQueue.enqueue("John");
        Queue<String> duplicate = new Queue<>(pplQueue);
        pplQueue.forEach(System.out::println);
        System.out.println(pplQueue);
        System.out.println("Peek: "+pplQueue.peek());
        System.out.println("dequeued: "+ pplQueue.dequeue());
        System.out.println(pplQueue);
        System.out.println("Peek: "+pplQueue.peek());
        List<String> dequeuedList = duplicate.dequeueAll();
        System.out.println(dequeuedList);
    }
}
