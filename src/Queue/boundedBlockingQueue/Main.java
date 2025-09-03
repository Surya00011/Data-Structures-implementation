package Queue.boundedBlockingQueue;
class Main {
    public static void main(String[] args) throws InterruptedException {
        BoundedBlockingQueue<Integer> queue = new BoundedBlockingQueue<>(2);

        Runnable producer = () -> {
            for (int i = 1; i <= 5; i++) {
                queue.enqueue(i);
                try { Thread.sleep(100); } catch (InterruptedException ignored) {}
            }
        };

        Runnable consumer = () -> {
            for (int i = 1; i <= 5; i++) {
                queue.dequeue();
                try { Thread.sleep(150); } catch (InterruptedException ignored) {}
            }
        };

        Thread p1 = new Thread(producer, "Producer-1");
        Thread p2 = new Thread(producer, "Producer-2");
        Thread c1 = new Thread(consumer, "Consumer-1");
        Thread c2 = new Thread(consumer, "Consumer-2");

        p1.start(); p2.start(); c1.start(); c2.start();

        p1.join(); p2.join(); c1.join(); c2.join();

        System.out.println("All threads finished.");
    }
}