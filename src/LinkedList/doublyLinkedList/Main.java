package LinkedList.doublyLinkedList;

import java.util.List;

public class Main {
    public static void main(String[] args) {
       LinkedList<String> list = new LinkedList<>(List.of("Surya","CSE"));
       LinkedList<String> duplicate = new LinkedList<>(list);
       System.out.println(duplicate);
       duplicate.addLast("Engineering");
       duplicate.addFirst("Computer Science");
       duplicate.addLast("College");
       duplicate.addAtIndex(0,"Hi");
        System.out.println(duplicate);
    }
}
