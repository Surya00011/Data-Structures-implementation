package tree.binarySearchTree;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {
       BinarySearchTree<Integer> tree = new BinarySearchTree<>();
       tree.insert(30);
       tree.insert(20);
       tree.insert(40);
       tree.insert(45);
       tree.insert(39);
       System.out.print("LevelOrder: ");
       tree.levelOrder(tree.getRoot());
       System.out.println();
       tree.delete(tree.getRoot(),40);
       System.out.print("LevelOrder: ");
       tree.levelOrder(tree.getRoot());
       System.out.println();
       System.out.println("PreOrder: ");
       tree.preOrder(tree.getRoot());
       System.out.println();
        System.out.println("PostOrder: ");
        tree.postOrder(tree.getRoot());
        System.out.println();
        System.out.println("InOrder: ");
        tree.inOrder(tree.getRoot());
        System.out.println();
        Optional.ofNullable(tree.search(tree.getRoot(), 45))
                .ifPresentOrElse(
                        node -> System.out.println("Found: " + node.key),
                        () -> System.out.println("Key not found!")
                );
        System.out.println("isFound: "+tree.contains(tree.getRoot(),39));
    }
}
