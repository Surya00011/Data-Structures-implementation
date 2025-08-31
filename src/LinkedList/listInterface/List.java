package LinkedList.listInterface;

public interface List<E> extends Iterable<E>{
    void addFirst(E element);
    void addLast(E element);
    void addAtIndex(int index,E element);
    void addAll(Iterable<? extends E> collection);
    E remove(E element);
    E removeFirst();
    E removeLast();
    E removeByIndex(int index);
    E get(int index);
    E getFirst();
    E getLast();
    int indexOf(E element);
    int size();
    boolean isEmpty();
    void clear();
    boolean contains(E element);
    void reverse();
}
