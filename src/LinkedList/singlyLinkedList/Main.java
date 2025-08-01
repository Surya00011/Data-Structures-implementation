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
        System.out.println(list.get(0));
        list.clear();
        strList.clear();
    }
}
