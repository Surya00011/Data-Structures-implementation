package LinkedList.singlyLinkedList;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedList<E> implements Iterable<E>{
    private Node head;

    public LinkedList(){

    }

    public LinkedList(E[] arr) {
        for (E element : arr) {
            addLast(element);
        }
    }
    public LinkedList(Collection<? extends E> c) {
        for (E element : c) {
            addLast(element);
        }
    }

    private static class Node<E> {
        E element;
        Node next;
        public Node(E element) {
            this.element = element;
            this.next=null;
        }
    }

    public void addFirst(E element) {
        Node newNode = new Node(element);
        newNode.next=head;
        head=newNode;
    }

    public void addLast(E element) {
        if(isEmpty()) {
            addFirst(element);
        } else {
            Node temp=head;
            Node currentLast;
            while(temp.next!=null) {
                temp=temp.next;
            }
            currentLast=temp;
            Node newLast = new Node(element);
            currentLast.next=newLast;
        }
    }

    public E remove(int index) {
        E removed=null;
        if(index==0) {
            removed=removeFirst();
        } else {
            Node temp=head;
            for(int i=0; i<index-1; i++) {
                temp=temp.next;
            }
            removed = (E) temp.next.element;
            temp.next = temp.next.next;
        }
        return removed;
    }

    public boolean isEmpty(){
        return head==null;
    }

    public void add(E element){
        addLast(element);
    }
    public void add(int index,E element) {
        if(isEmpty()){
            addFirst(element);
        }
        else if(index == 0) {
            Node newNode = new Node(element);
            newNode.next =head;
            head=newNode;
        }
        else {
            Node prev = head;
            for(int i=0; i<index-1; i++) {
                prev=prev.next;
            }
            Node temp = prev.next;
            Node newNode = new Node(element);
            newNode.next = temp;
            prev.next = newNode;
        }
    }
    public E removeFirst() {
        if(isEmpty()) {
            throw new EmptyListException("LinkedList is empty");
        }
        E removed = (E) head.element;
        head=head.next;
        return removed;
    }
    public boolean contains(E element){
        Node temp = head;
        while(temp != null){
            if(temp.element==element){
                return true;
            }
            temp=temp.next;
        }
        return false;
    }
    public E removeLast() {
        if (isEmpty()) {
            throw new EmptyListException("LinkedList is empty");
        }

        if (head.next == null) {
            return removeFirst();
        }

        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }

        E removed = (E) temp.next.element;
        temp.next = null;
        return removed;
    }

    public void clear() {
        head=null;
    }

    public E get(int index) {
        if (isEmpty()) {
            throw new EmptyListException("LinkedList is empty");
        }
        if (index < 0) {
            throw new IndexOutOfBoundsException("Index cannot be negative: " + index);
        }

        Node temp = head;
        for (int i = 0; i < index; i++) {
            if (temp == null) {
                throw new IndexOutOfBoundsException("Index out of range: " + index);
            }
            temp = temp.next;
        }

        if (temp == null) {
            throw new IndexOutOfBoundsException("Index out of range: " + index);
        }

        return (E) temp.element;
    }

    public E getFirst(){
        if(isEmpty()){
            throw new EmptyListException("LinkedList is empty");
        }
        return (E) head.element;
    }
    public E getLast(){
        if(isEmpty()){
            throw new EmptyListException("LinkedList is empty");
        }
        Node temp = head;
        while(temp.next != null){
            temp=temp.next;
        }
        return (E) temp.element;
    }

    public void addAll(Collection<E> collection){
        for(E element : collection){
            addLast(element);
        }
    }
    public int size() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public int indexOf(E element){
        if(isEmpty()){
            throw new EmptyListException("LinkedList is empty");
        }
        Node temp = head;
        int index=0;

        while(temp != null){
            if(temp.element == element){
                return index;
            }
            index++;
            temp=temp.next;
        }
        return -1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node temp = head;
        while(temp != null) {
            sb.append(temp.element+" -> ");
            temp= temp.next;
        }
        sb.append("null");
        return sb.toString();
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            Node current = head;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public E next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                E data = (E) current.element;
                current = current.next;
                return data;
            }
        };
    }

}