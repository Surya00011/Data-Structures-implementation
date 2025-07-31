package LinkedList.singlyLinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.addFirst(12);
        list.addFirst(11);
        list.addFirst(23);
        list.addLast(34);
        list.addLast(89);
        list.addFirst(35);
        System.out.println(list.remove(0));
        System.out.println(list.removeFirst());
        System.out.println(list.removeLast());
        System.out.println(list);
    }
}
