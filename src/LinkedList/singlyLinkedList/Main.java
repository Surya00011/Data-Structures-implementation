package LinkedList.singlyLinkedList;

import LinkedList.listInterface.List;
public class Main {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.addFirst(12);
        list.addFirst(11);
        list.addFirst(23);
        list.addLast(34);
        list.addLast(89);
        list.addFirst(35);
        list.addAtIndex(2,67);
        list.addAtIndex(0,90);
        System.out.println(list.removeByIndex(0));
        System.out.println(list.removeFirst());
        System.out.println(list.removeLast());
        System.out.println(list.isEmpty());
        System.out.println(list);
        LinkedList<String> strList = new LinkedList<>();
        strList.addFirst("Surya");
        strList.addLast("Super");
        strList.addAtIndex(1,"Hello");
        System.out.println(strList);
        System.out.println(strList.contains("Surya"));
        System.out.println("Element at index "+list.get(0));
        System.out.println("First Element "+list.getFirst());
        System.out.println("Last Element "+strList.getLast());
        System.out.println(list.getLast());
        System.out.println("Size "+list.size());
        System.out.println(strList.remove("Surya"));
        System.out.println(strList);
        list.addAll(java.util.List.of(23,45,56));
        System.out.println("Index of "+ list.indexOf(23));
        System.out.println(list);
        System.out.println(list.remove(56));
        System.out.println(list);
        list.clear();
        strList.clear();
    }
}
