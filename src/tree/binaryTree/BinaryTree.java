package tree.binaryTree;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.function.Function;

public class BinaryTree<E> {

    private Node<E> root;
    private Function<String, E> parser;

    public BinaryTree(E root) {
        this.root = new Node<>(root);
    }

    public BinaryTree(Function<String, E> parser, E root) {
        this.parser = parser;
        this.root = new Node<>(root);
    }

    public static class Node<E> {
        Node<E> left;
        Node<E> right;
        E element;

        public Node(E element) {
            this.element = element;
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

    public void preOrder(Node<E> node) {
        if (node == null) return;
        System.out.print(node.element + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void postOrder(Node<E> node) {
        if (node == null) return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.element + " ");
    }

    public void construct(Node<E> root) {
       Scanner sc = new Scanner(System.in);
       try {
           System.out.println("Do you want to insert into left of " + root.element);
           boolean insertLeft = sc.nextBoolean();
           if (insertLeft) {
               System.out.println("Enter the value to insert into left of " + root.element);
               sc.nextLine();
               E value = readValue(sc, parser);
               root.left = new Node<>(value);
               construct(root.left);
           }
           System.out.println("Do you want to insert into right of " + root.element);
           boolean insertRight = sc.nextBoolean();
           if (insertRight) {
               System.out.println("Enter the value to insert into right of " + root.element);
               sc.nextLine();
               E value = readValue(sc, parser);
               root.right = new Node<>(value);
               construct(root.right);
           }
       }catch (IllegalArgumentException | InputMismatchException exception){
           System.err.println("Invalid input "+exception.getMessage());
       }
    }

    private static <T> T readValue(Scanner sc, Function<String, T> parser) {
        return parser.apply(sc.nextLine());
    }
}