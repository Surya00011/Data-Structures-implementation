package LinkedList.singlyLinkedList;

import LinkedList.listInterface.List;

import java.util.Iterator;
import java.util.NoSuchElementException;


public class LinkedList<E> implements List<E> {
    private Node<E> head;

    public LinkedList(){

    }

    public LinkedList(E[] arr) {
        for (E element : arr) {
            addLast(element);
        }
    }
    public LinkedList(Iterable<? extends E> c) {
        for (E element : c) {
            addLast(element);
        }
    }

    private static class Node<E> {
        E element;
        Node<E> next;
        public Node(E element) {
            this.element = element;
            this.next=null;
        }
    }


    public void addFirst(E element) {
        Node<E> newNode = new Node<>(element);
        newNode.next=head;
        head=newNode;
    }

    public void addLast(E element) {
        if(isEmpty()) {
            addFirst(element);
        } else {
            Node<E> temp=head;
            Node<E> currentLast;
            while(temp.next!=null) {
                temp=temp.next;
            }
            currentLast=temp;
            Node<E> newLast = new Node<>(element);
            currentLast.next=newLast;
        }
    }


    public E remove(E element) {
        E removed = null;
        if (isEmpty()) {
             throw new EmptyListException("LinkedList is empty");
        }

        if (head.element.equals(element)) {
            removed = removeFirst();
        }
        else {
            Node<E> prev = head;
            while (prev.next != null) {
                if (prev.next.element.equals(element)) {
                    removed = (E) prev.next.element;
                    prev.next = prev.next.next;
                } else {
                    prev = prev.next;
                }
            }
        }
        return removed;
    }

    public E removeByIndex(int index) {
        E removed=null;
        if(isEmpty()){
            throw  new EmptyListException("LinkedList is empty");
        }
        if(index>size() || index<0){
            throw  new IndexOutOfBoundsException("Index out of range");
        }
        if(index==0) {
            removed=removeFirst();
        }
        else {
            Node<E> temp=head;
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

    public void addAtIndex(int index, E element) {
        if(isEmpty()){
            addFirst(element);
        }
        else if(index == 0) {
            Node<E> newNode = new Node<E>(element);
            newNode.next =head;
            head=newNode;
        }
        else {
            Node<E> prev = head;
            for(int i=0; i<index-1; i++) {
                prev=prev.next;
            }
            Node<E> temp = prev.next;
            Node<E> newNode = new Node<>(element);
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
        Node<E> temp = head;
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

        Node<E> temp = head;
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

        Node<E> temp = head;
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
        Node<E> temp = head;
        while(temp.next != null){
            temp=temp.next;
        }
        return (E) temp.element;
    }

    public void addAll(Iterable<? extends E> collection){
        for(E element : collection){
            addLast(element);
        }
    }
    public int size() {
        int count = 0;
        Node<E> temp = head;
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
        Node<E> temp = head;
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
        Node<E> temp = head;
        while(temp != null) {
            sb.append(temp.element).append(" -> ");
            temp= temp.next;
        }
        sb.append("null");
        return sb.toString();
    }

    public void reverse(){
        if(isEmpty())
            throw new EmptyListException("List is empty");
        Node<E> prevNode = null;
        Node<E> currentNode = head;
        while (currentNode != null){
            Node<E> oldCurr = currentNode.next;
            currentNode.next = prevNode;
            prevNode = currentNode;
            currentNode= oldCurr;
        }
        head = prevNode;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            Node<E> current = head;

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