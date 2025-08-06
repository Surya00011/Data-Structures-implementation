package Queue.circularQueue;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Queue<E> implements Iterable<E> {

    private Node<E> front;
    private Node<E> rear;
    private int size;

    public Queue() {}

    public Queue(Iterable<? extends E> collection) {
        enqueueAll(collection);
    }

    public static class Node<E> {
        E element;
        Node<E> next;

        public Node(E element) {
            this.element = element;
        }
    }

    public void enqueue(E element){
        Node<E> newNode = new Node<>(element);
         if(isEmpty()){
             front = rear = newNode;
         }else{
             rear.next= newNode;
             newNode.next=front;
             rear = newNode;
         }
         size++;
    }

    public void enqueueAll(Iterable<? extends E> collection){
        for(E element: collection){
            enqueue(element);
        }
    }

    public E dequeue(){
        if(isEmpty()){
            throw new EmptyQueueException("Queue is empty");
        }
        E dequeued = (E) front.element;
        front=front.next;
        return dequeued;
    }

    public List<E> dequeueAll(){
        if (isEmpty()){
            throw new EmptyQueueException("Queue is empty");
        }
        List<E> dequeued = new ArrayList<>();
        Node<E> temp = front;
        for(int i=0;i<size;i++){
            dequeued.add(dequeue());
            temp=temp.next;
        }
        return dequeued;
    }

    public E peek(){
        if(isEmpty()){
            throw new EmptyQueueException("Queue is empty");
        }
        return (E) front.element;
    }

    public boolean isEmpty(){
        return front==null;
    }

    public int size(){
        return size;
    }

    @Override
    public String toString(){
        if(isEmpty()){
            return null;
        }
        StringBuilder sb = new StringBuilder("(FRONT)==>");
        Node<E> temp = front;
        for(int i=0;i<size;i++){
            sb.append(temp.element).append("<-");
            temp=temp.next;
        }
        sb.append("(REAR) Points to front ").append(front.element);
        return sb.toString();
    }
    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            Node<E> curr = front;
            int visited = 0;

            @Override
            public boolean hasNext() {
                return visited < size;
            }

            @Override
            public E next() {
                E val = curr.element;
                curr = curr.next;
                visited++;
                return val;
            }
        };
    }
}
