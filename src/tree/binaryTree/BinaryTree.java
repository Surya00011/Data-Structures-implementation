package tree.binaryTree;

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
