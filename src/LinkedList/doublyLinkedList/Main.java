package LinkedList.doublyLinkedList;

import java.util.List;

public class Main {
    public static void main(String[] args) {
       LinkedList<String> list = new LinkedList<>(List.of("Surya","CSE"));
       LinkedList<String> duplicate = new LinkedList<>(list);
       LinkedList<String> linkedList = new LinkedList<>(List.of("Surya","Mani"));
       System.out.println(duplicate);
       duplicate.addLast("Engineering");
       duplicate.addFirst("Computer Science");
       duplicate.addLast("College");
       duplicate.addAtIndex(0,"Hi");
       duplicate.forEach(System.out::println);
       duplicate.removeFirst();
       System.out.println(duplicate);
       System.out.println("Removed "+ linkedList.removeLast());
       System.out.println(linkedList);
       System.out.println(duplicate);
       System.out.println(duplicate.removeLast());
       System.out.println(duplicate.removeLast());
       System.out.println(duplicate.removeAtIndex(2));
       System.out.println(duplicate.remove("Surya"));
       System.out.println(duplicate);
    }
}
