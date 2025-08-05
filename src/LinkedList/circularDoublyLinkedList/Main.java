package LinkedList.circularDoublyLinkedList;

import LinkedList.listInterface.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.addFirst("Surya");
        list.addFirst("Kain");
        list.addFirst("Main");
        list.addFirst("Rko");
        list.addLast("Beast");
        list.addLast("McMan");
        list.addLast("Mohan");
        list.addAtIndex(list.size()-1,"Brok");
        list.addFirst("Goldberg");
        list.addAll(java.util.List.of("John","jack","Arthur","Dutch"));
        System.out.println(list);
        System.out.println(list.get(list.size()-1));
        System.out.println(list.getLast());
        System.out.println(list.get(0));
        System.out.println(list);
        System.out.println(list.removeLast());
        System.out.println(list);
        System.out.println(list.removeLast());
        System.out.println(list);
    }
}
