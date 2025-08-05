package LinkedList.circularDoublyLinkedList;

import LinkedList.doublyLinkedList.EmptyListException;
import LinkedList.listInterface.List;

import java.util.Iterator;

public class LinkedList<E> implements List<E> {
    private Node<E> head;
    private int size = 0;
    private static class Node<E>{
        E element;
        Node<E> prev;
        Node<E> next;
        public Node(E element){
            this.element=element;
        }
    }

    @Override
    public void addFirst(E element) {
        Node<E> newNode = new Node<>(element);
        if(isEmpty()){
            newNode.next=newNode;
            newNode.prev=newNode;
            head=newNode;
        }else{
            Node<E> oldHead = head;
            newNode.prev=oldHead.prev;
            newNode.prev.next = newNode;
            newNode.next=oldHead;
            head=newNode;
        }
        size++;
    }

    @Override
    public void addLast(E element) {
       Node<E> newNode = new Node<>(element);
       if (isEmpty()){
           addFirst(element);
       }else{
           head.prev.next=newNode;
           newNode.prev=head.prev;
           newNode.next=head;
           head.prev=newNode;
           size++;
       }
    }

    @Override
    public void addAtIndex(int index, E element) {
        if(index>size || index<0) {
            throw new IndexOutOfBoundsException("Index out of Range");
        }
        if(isEmpty() || index==0) {
            addFirst(element);
        } else if (size-1==index) {
            addLast(element);
        }else {
            Node<E> prevNode = head;
            Node<E> newNode = new Node<>(element);
            for(int i=0; i<index-1; i++) {
                prevNode=prevNode.next;
            }
            newNode.next=prevNode.next;
            newNode.prev=prevNode;
            prevNode.next=newNode;
            size++;
        }
    }

    @Override
    public void addAll(Iterable<? extends E> collection) {
       for(E element:collection){
           addLast(element);
       }
    }

    @Override
    public E remove(E element) {
        return null;
    }

    @Override
    public E removeFirst() {
        E removed = null;
        if (isEmpty()){
            throw new EmptyStackException("List is empty");
        }
        removed = (E) head.element;
        head.next.prev = head.prev;
        head.prev.next = head.next;
        head=head.next;
        size--;
        return removed;
    }

    @Override
    public E removeLast() {
        E removed=null;
        if(isEmpty()){
            throw new EmptyStackException("List is empty");
        }
        else if(size==1){
            removed=removeFirst();
        }else {
            removed = (E) head.prev.element;
            Node<E> currLast = head.prev;
            currLast.prev.next = head;
            head.prev = currLast.prev;
            size--;
        }
        return removed;
    }

    @Override
    public E removeByIndex(int index) {
        return null;
    }

    @Override
    public E get(int index) {
        if (isEmpty()){
            throw new EmptyListException("List is empty");
        }
        if(index>=size || index < -1){
            throw new IndexOutOfBoundsException("Index out of range");
        }
        Node<E> temp = head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        return (E) temp.element;
    }

    @Override
    public E getFirst() {
        if(isEmpty()){
            throw new EmptyStackException("List is empty");
        }
        return (E) head.element;
    }

    @Override
    public E getLast() {
        if(isEmpty()){
            throw new EmptyStackException("List is empty");
        }
        return (E) head.prev.element;
    }

    @Override
    public int indexOf(E element) {
        return 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return head==null;
    }

    @Override
    public void clear() {
         head=null;
    }

    @Override
    public boolean contains(E element) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public String toString(){
        Node<E> temp = head;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<size;i++){
            sb.append(temp.element).append("->");
            temp=temp.next;
        }
        sb.append("[(head node)-> ").append(head.element).append("]");
        return sb.toString();
    }
}
