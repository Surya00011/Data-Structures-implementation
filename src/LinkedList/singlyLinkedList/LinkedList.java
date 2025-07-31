package LinkedList.singlyLinkedList;

public class LinkedList<E> {
    private Node head;

    private static class Node<E> {
        E element;
        Node next;
        public Node(E element) {
            this.element = element;
        }
    }

    public void addFirst(E element) {
        Node newNode = new Node(element);
        if(head!=null) {
            newNode.next=head;
            head=newNode;
        } else {
            head = newNode;
        }
    }

    public void addLast(E element) {
        Node temp=head;
        Node currentLast;
        while(temp.next!=null) {
            temp=temp.next;
        }
        currentLast=temp;
        Node newLast = new Node(element);
        currentLast.next=newLast;
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

    public E removeFirst() {
        if(head==null) {
            throw new EmptyListException("LinkedList is empty");
        }
        E removed = (E) head.element;
        head=head.next;
        return removed;
    }

    public E removeLast() {
        if (head == null) {
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

}