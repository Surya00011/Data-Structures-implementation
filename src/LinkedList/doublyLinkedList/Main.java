package LinkedList.doublyLinkedList;
import LinkedList.listInterface.List;

public class Main {
    public static void main(String[] args) {
       List<String> list = new LinkedList<>(java.util.List.of("Surya","CSE"));
       List<String> duplicate = new LinkedList<>(list);
       List<String> linkedList = new LinkedList<>(java.util.List.of("Surya","Mani"));
       List<String> list1 = new LinkedList<>(java.util.List.of("Surya","Kamal"));
       list1.addAll(java.util.List.of("Surya","Kamal"));
       System.out.println(duplicate);
       duplicate.addLast("Engineering");
       duplicate.addFirst("Computer Science");
       duplicate.addLast("College");
       duplicate.addAtIndex(0,"Hi");
       //duplicate.forEach(System.out::println);
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
       System.out.println(list1.remove("Surya"));
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
