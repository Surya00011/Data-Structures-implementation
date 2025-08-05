package Queue.queueArrayImpl;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> que = new Queue<>();
        que.enqueue(3);
        que.enqueue(4);
        que.enqueue(5);
        System.out.println(que);
        System.out.println("front " + que.front());
        System.out.println("dequeued "+que.dequeue());
        System.out.println("dequeued "+ que.dequeue());
        System.out.println("dequeued "+que.dequeue());
    }
}
