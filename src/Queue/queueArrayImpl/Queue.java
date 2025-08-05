package Queue.queueArrayImpl;

public class Queue<E> {
    private static final int MAX_SIZE = 10;
    E arr[];
    int rear;
    public Queue(){
        arr = (E[]) new Object[MAX_SIZE];
        rear=-1;
    }

    public E dequeue(){
        if(rear == -1){
            throw new IndexOutOfBoundsException("Queue is empty");
        }
        E dequeued = arr[0];
        for(int i=1;i<=rear;i++){
            arr[i-1]=arr[i];
        }
        rear--;
        return dequeued;
    }

    public void enqueue(E element){
        if(rear == MAX_SIZE-1){
            throw new IndexOutOfBoundsException("Queue is full");
        }
        arr[++rear] = element;
    }

    public E front(){
        if(rear==-1){
            throw new IndexOutOfBoundsException("Queue is empty");
        }
        return (E) arr[0];
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder("Front ==>");
        for(int i=0;i<=rear;i++){
            sb.append(arr[i]).append(" <- ");
        }
        sb.append("Rear");
        return sb.toString();
    }
}
