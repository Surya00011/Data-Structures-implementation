package LinkedList.singlyLinkedList;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.addFirst(12);
        list.addFirst(11);
        list.addFirst(23);
        list.addLast(34);
        list.addLast(89);
        list.addFirst(35);
        list.add(2,67);
        list.add(0,90);
        list.add(56);
        System.out.println(list.remove(0));
        System.out.println(list.removeFirst());
        System.out.println(list.removeLast());
        System.out.println(list.isEmpty());
        System.out.println(list);
        LinkedList<String> strList = new LinkedList<>();
        strList.addFirst("Surya");
        strList.addLast("Super");
        strList.add(1,"Hello");
        System.out.println(strList);
        System.out.println(strList.contains("Surya"));
        System.out.println("Element at index "+list.get(0));
        System.out.println("First Element "+list.getFirst());
        System.out.println("Last Element "+strList.getLast());
        System.out.println(list.getLast());
        System.out.println("Size"+list.size());
        list.addAll(List.of(23,45,56));
        list.indexOf(23);
        System.out.println(list);
        list.forEach(System.out::println);
        list.clear();
        strList.clear();
    }
}
