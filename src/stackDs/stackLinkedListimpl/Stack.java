package stackDs.stackLinkedListimpl;

import java.util.Iterator;

public class Stack <E> implements Iterable<E>{

    private Node<E> top;
    private int size;

    private static class Node<E>{
        E element;
        Node<E> next;
        public Node(E element){
            this.element=element;
        }
    }

    public E push(E element){
        Node<E> newNode = new Node<>(element);
        if(isEmpty()){
            top=newNode;
        }else{
            newNode.next=top;
            top=newNode;
        }
        size++;
        return (E) top.element;
    }
    public E pop(){
        E popped = null;
        if(isEmpty()){
            throw new EmptyStackException("Stack is empty");
        }
        popped = (E) top.element;
        top=top.next;
        size--;
        return popped;
    }
    public E peek(){
        if(isEmpty()){
            throw  new EmptyStackException("Stack is empty");
        }
        return (E) top.element;
    }
    public boolean isEmpty(){
        return top==null;
    }
    public int size(){
        return size;
    }

    @Override
    public String toString(){
        Node<E> tempTop = top;
        StringBuilder sb = new StringBuilder("Top ==> ");
        while(tempTop != null){
            sb.append(tempTop.element).append("->");
            tempTop=tempTop.next;
        }
        sb.append("null");
        return sb.toString();
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            Node<E> currTop = top;
            @Override
            public boolean hasNext() {
                return currTop!=null;
            }

            @Override
            public E next() {
                E nextElement = (E) currTop.element;
                currTop=currTop.next;
                return nextElement;
            }
        };
    }
}
