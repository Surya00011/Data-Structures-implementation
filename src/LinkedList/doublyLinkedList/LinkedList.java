package LinkedList.doublyLinkedList;

import java.util.Iterator;

public class LinkedList<E> implements Iterable<E>{
    Node<E> head;
    int size=0;

    private static class Node<E> {
        Node<E> prev;
        Node<E> next;
        E element;
        public Node(E element) {
            this.element=element;
        }
    }
    public LinkedList() {

    }
    public LinkedList(Iterable<? extends E> c) {
        for (E element : c) {
            addLast(element);
        }
    }
    public void addFirst(E element) {
        Node<E> newNode = new Node<>(element);
        if(isEmpty()) {
            head=newNode;
        } else {
            newNode.next=head;
            head.prev=newNode;
            head=newNode;
        }
        size++;
    }

    public void addLast(E element) {
        if(isEmpty()) {
            addFirst(element);
        } else {
            Node<E> temp = head;
            Node<E> currLast;
            while(temp.next != null) {
                temp=temp.next;
            }
            currLast=temp;
            Node<E> newNode = new Node<>(element);
            newNode.prev=currLast;
            currLast.next=newNode;
            size++;
        }
    }

    public void addAtIndex(int index, E element) {
        if(index>size || index<0){
            throw new IndexOutOfBoundsException("Index out of Range");
        }
        if(isEmpty() || index==0) {
            addFirst(element);
        } else {
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

    public boolean isEmpty() {
        return head==null;
    }
    public int size(){
        return size;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node<E> temp = head;
        while (temp!=null) {
            sb.append(temp.element).append("->");
            temp=temp.next;
        }
        sb.append("null");
        return sb.toString();
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<>() {
            Node<E> current=head;
            @Override
            public boolean hasNext() {
                return current!=null;
            }

            @Override
            public E next() {
                E data = current.element;
                current = current.next;
                return data;
            }
        };
    }
}