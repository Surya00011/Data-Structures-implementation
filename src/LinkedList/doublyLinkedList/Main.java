package LinkedList.doublyLinkedList;

import java.util.List;

public class Main {
    public static void main(String[] args) {
       LinkedList<String> list = new LinkedList<>(List.of("Surya","CSE"));
       LinkedList<String> duplicate = new LinkedList<>(list);
       LinkedList<String> linkedList = new LinkedList<>(List.of("Surya","Mani"));
       LinkedList<String> list1 = new LinkedList<>(List.of("Surya","Kamal"));
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
       System.out.println(duplicate.removeByIndex(2));
       System.out.println(duplicate.remove("Surya"));
       System.out.println(duplicate.remove("Computer Science"));
       System.out.println(duplicate);
       //System.out.println(list1.remove("Surya"));
       System.out.println(list1.getLast());
       System.out.println(list1.getFirst());
       System.out.println(list1.get(0));
       System.out.println(list1.contains("Surya"));
       System.out.println(list1.indexOf("Surya"));
       list.clear();
       list1.clear();
       linkedList.clear();
       duplicate.clear();
    }
}
