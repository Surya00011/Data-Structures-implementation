package tree.binarySearchTree;


import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree <E extends Comparable<E>>{

    private Node<E> root;
    public BinarySearchTree(E root){
        this.root = new Node<E>(root);
    }
    public BinarySearchTree(){
        this.root=null;
    }
    public static class Node<E>{
        E key;
        Node<E> left;
        Node<E> right;
        public Node(E key){
            this.key=key;
        }
    }
    public void insert(E key){
        if(root==null){
            root=new Node<>(key);
        }else{
            insert(root,key);
        }
    }
    private void insert(Node<E> root,E key){
        if (key.compareTo(root.key) > 0){
            if (root.right==null){
                root.right = new Node<E>(key);
                return;
            }
            insert(root.right,key);
        }else if(key.compareTo(root.key) < 0){
            if (root.left==null) {
                root.left= new Node<E>(key);
                return;
            }
            insert(root.left,key);
        }
    }

    public void levelOrder(Node<E> root) {
        if (root == null) return;
        Queue<Node<E>> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            Node<E> current = queue.poll();
            System.out.print(current.key + " ");
            if (current.left != null) queue.offer(current.left);
            if (current.right != null) queue.offer(current.right);
        }
    }
    public void preOrder(Node<E> currentRoot){
        if(currentRoot==null) return;
        System.out.print(currentRoot.key+" ");
        preOrder(currentRoot.left);
        preOrder(currentRoot.right);
    }

    public void postOrder(Node<E> root){
        if(root==null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.key+" ");
    }

    public void inOrder(Node<E> node) {
        if (node == null) return;
        inOrder(node.left);
        System.out.print(node.key + " ");
        inOrder(node.right);
    }

    public Node<E> search(Node<E> root,E key){
       if (root==null) return null;
       if( key.equals(root.key)) return root;
       if(key.compareTo(root.key)>0 ){
           return search(root.right,key);
       }
       else if (key.compareTo(root.key) < 0 ){
           return search(root.left,key);
       }
       return null;
    }

    public boolean contains(Node<E> root,E key){
        if (root==null) return false;
        if( key.equals(root.key)) return true;
        if(key.compareTo(root.key)>0 ){
            return contains(root.right,key);
        }
        else if (key.compareTo(root.key) < 0 ){
            return contains(root.left,key);
        }
        return false;
    }

    public Node<E> delete(Node<E> root,E key){
         if(root==null) return root;
         if(key.equals(root.key)){
             if (root.right==null){
                 return root.left;
             }else if(root.left==null){
                 return root.right;
             }else{
                 root.key= findMin(root.right ,key);
                 root.right=delete(root.right, root.key);
             }
         }
         if(key.compareTo(root.key)>0) root.right = delete(root.right,key);
         root.left = delete(root.left,key);
         return root;
    }

    private E findMin(Node<E> root, E key){
        E min = root.key;
        while (root.left != null){
            min = root.left.key;
            root=root.left;
        }
        return min;
    }

    public Node<E> getRoot(){
        return root;
    }
}
