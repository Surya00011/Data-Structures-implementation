package tree.binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree<E>{

    private Node<E> root;

    public BinaryTree(E root){
        this.root= new Node<>(root);
    }

    public static class Node<E>{
        Node<E> left;
        Node<E> right;
        E element;
        public Node(E element){
            this.element=element;
        }
    }
    public Node<E> getRoot() {
        return root;
    }

    public boolean contains(Node<E> node, E value) {
        if (node == null) return false;
        if (node.element.equals(value)) return true;
        return contains(node.left, value) || contains(node.right, value);
    }


    public void levelOrder(Node<E> root) {
        if (root == null) return;
        Queue<Node<E>> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            Node<E> current = queue.poll();
            System.out.print(current.element + " ");
            if (current.left != null) queue.offer(current.left);
            if (current.right != null) queue.offer(current.right);
        }
    }


    public Node<E> insertLeft(Node<E> parent, E data) {
        parent.left = new Node<>(data);
        return parent.left;
    }

    public Node<E> insertRight(Node<E> parent, E data) {
        parent.right = new Node<>(data);
        return parent.right;
    }

    public void inOrder(Node<E> node) {
        if (node == null) return;
        inOrder(node.left);
        System.out.print(node.element + " ");
        inOrder(node.right);
    }
    public void preOrder(Node<E> node){
        if(node==null) return;
        System.out.print(node.element+" ");
        preOrder(node.left);
        preOrder(node.right);
    }
    public void postOrder(Node<E> node){
        if (node==null) return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.element+" ");
    }

}
