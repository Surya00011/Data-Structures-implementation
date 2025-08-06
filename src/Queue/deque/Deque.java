package Queue.deque;

public class Deque <E>{

    private Node<E> front;
    private Node<E> rear;
    private int size;

    private static class Node<E>{
        E element;
        Node<E> prev;
        Node<E> next;
        public Node(E element){
            this.element=element;
        }
    }

    public void offerFirst(E element){
        Node<E> newNode = new Node<E>(element);
        if(isEmpty()){
            front = newNode;
            rear = newNode;
        }else{
            front.prev = newNode;
            newNode.next = front;
            front=newNode;
        }
        size++;
    }

    public void offerLast(E element){
        if(isEmpty()){
            offerFirst(element);
        }else{
            Node<E> newNode = new Node<>(element);
            rear.next = newNode;
            newNode.prev = rear;
            rear=newNode;
        }
        size++;
    }

    public E peekFirst(){
        if (isEmpty()){
            throw new EmptyDequeException("Queue is empty");
        }
        return (E) front.element;
    }

    public E peekLast(){
        if(isEmpty()){
            throw new EmptyDequeException("Queue is empty");
        }
        return (E) rear.element;
    }

    public E pollFirst(){
        if(isEmpty()){
            throw new EmptyDequeException("Queue is empty");
        }
        E removed = (E) front.element;
        if(front==rear){
            front = rear = null;
        }else {
            front = front.next;
            front.prev = null;
        }
        size--;
        return removed;
    }

    public E pollLast(){
        if(isEmpty()){
            throw new EmptyDequeException("Queue is empty");
        }
        E removed = (E) rear.element;
        if(front == rear){
            front = rear = null;
        }else{
            rear=rear.prev;
            rear.next=null;
        }
        size--;
        return removed;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return front==null;
    }

    @Override
    public String toString(){
        if(isEmpty()){
            return null;
        }
        StringBuilder sb = new StringBuilder("(FRONT)==> ");
        Node<E> temp =front;
        while(temp != null){
            if(temp.next!=null) {
                sb.append(temp.element).append(" <-> ");
            }else {
                sb.append(temp.element).append(" <==");
            }
            temp=temp.next;
        }
        sb.append("(REAR)");
        return sb.toString();
    }
}
