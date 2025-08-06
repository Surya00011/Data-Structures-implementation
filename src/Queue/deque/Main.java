package Queue.deque;

public class Main {
    public static void main(String[] args) {
         Deque<String> deque = new Deque<>();
         deque.offerFirst("Surya");
         deque.offerFirst("Dutch");
         deque.offerFirst("Arthur");
        System.out.println(deque);
    }
}
