package stackDs.array.implementation;

import java.util.Iterator;

public class Stack<E> implements Iterable<E>{
    private E[] stackArray;
    private int index;
    private int capacity;
    public Stack(){
        index=0;
        capacity=12;
        stackArray= (E [])new Object[capacity];
    }
    private void increseCapacity(){
        capacity*=2;
        E[] tempArray = (E[]) new Object[capacity];
        for(int i=0;i<stackArray.length;i++){
            tempArray[i]=stackArray[i];
        }
        stackArray=tempArray;
    }

    /**
     *
     * @param element Element to be pushed
     *
     */
    public void push(E element){
        if(index==capacity){
            increseCapacity();
        }
        stackArray[index++]=element;
    }

    public boolean isEmpty() {
        return index <= 0;
    }

    public E peek(){
        if(size()==0){
            throw new StackEmptyException("stackDs.array.implementation.Stack is empty");
        }
        return stackArray[index-1];
    }
    public int size(){
        return index;
    }
    public E pop(){
        E peekElement = peek();
        E [] tempArray = (E []) new Object[capacity-1];
        for(int i=0;i<tempArray.length;i++){
            tempArray[i]=stackArray[i];
        }
        stackArray=tempArray;
        index--;
        return peekElement;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Top -->[");
        for (int i = index-1; i >=0; i--) {
            sb.append(stackArray[i]);
            if (i > 0 ) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            int current=0;
            @Override
            public boolean hasNext() {
                return current<index;
            }

            @Override
            public E next() {
                return stackArray[current++];
            }
        };
    }
}
