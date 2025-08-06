package Queue.queueLinkedListImpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Queue<E> implements Iterable<E>{

    private Node<E> front;
    private Node<E> rear;
    private int size;

    public Queue(){

    }

    public Queue(Iterable<? extends E> collection){
        enqueueAll(collection);
    }

    public static class Node<E>{
        E element;
        Node<E> next;
        public Node(E element){
            this.element=element;
        }
    }

    public void enqueue(E element){
        Node<E> newNode = new Node<>(element);
        if(isEmpty()){
            front=newNode;
            rear=newNode;
        }else{
            rear.next=newNode;
            rear=newNode;
        }
        size++;
    }


    public E peek(){
        if(isEmpty()){
            throw new EmptyQueueException("Queue is empty");
        }
        return (E) front.element;
    }

    public void enqueueAll(Iterable<? extends E> collection){
        for(E element : collection){
            enqueue(element);
        }
    }
    public List<E> dequeueAll(){
        if(isEmpty()){
            throw new EmptyQueueException("Queue is empty");
        }
        List<E> dequeued = new ArrayList<>();
        Node<E> temp = front;
        while (temp != null){
            dequeued.add(dequeue());
            temp=temp.next;
        }
        return dequeued;
    }
    public E dequeue(){
        if (isEmpty()){
            throw new EmptyQueueException("Queue is empty");
        }
        E dequeued = (E) front.element;
        front=front.next;
        return dequeued;
    }

    public boolean isEmpty(){
        return front==null;
    }
    public int size(){
        return size;
    }
    @Override
    public String toString(){
        if (isEmpty()){
            return null;
        }
        StringBuilder sb = new StringBuilder("(FRONT) ==> ");
        Node<E> temp = front;
        while(temp != null){
            if(temp.next!=null){
                sb.append(temp.element).append(" <- ");
            }else {
                sb.append(temp.element).append(" <==");
            }
            temp=temp.next;
        }
        sb.append("(REAR)");
        return sb.toString();
    }

    @Override
    public Iterator<E> iterator(){
        return new Iterator<E>() {
            Node<E> currFront = front;
            @Override
            public boolean hasNext() {
                return currFront!=null;
            }

            @Override
            public E next() {
                E next = (E) currFront.element;
                currFront=currFront.next;
                return next;
            }
        };
    }
}
