package Queue.deque;

public class Main {
    public static void main(String[] args) {
         Deque<String> deque = new Deque<>();
         deque.offerFirst("Surya");
         deque.offerFirst("Dutch");
         deque.offerFirst("Arthur");
         deque.offerLast("Speed");
         deque.offerFirst("John");
         System.out.println(deque);
         System.out.println("Dequeued "+ deque.pollFirst());
         System.out.println("Dequeued "+ deque.pollLast());
         System.out.println(deque);
         System.out.println(deque.peekFirst());
         System.out.println(deque.peekLast());
         System.out.println("Dequeued "+ deque.pollFirst());
         System.out.println("Dequeued "+ deque.pollLast());
         System.out.println(deque);
    }
}
