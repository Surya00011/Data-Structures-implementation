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

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return front==null;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder("(FRONT)==> ");
        Node<E> temp =front;
        while(temp != null){
            sb.append(temp.element).append(" <-> ");
            temp=temp.next;
        }
        sb.append("(REAR)");
        return sb.toString();
    }
}
