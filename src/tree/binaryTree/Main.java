package tree.binaryTree;

import java.util.concurrent.CompletableFuture;

public class Main {
    public static void main(String[] args) {

        BinaryTree<Integer> integerBinaryTree = new BinaryTree<>(Integer::parseInt, 1);


        CompletableFuture<Void> buildTreeFuture = CompletableFuture.runAsync(() -> {
            integerBinaryTree.construct(integerBinaryTree.getRoot());
        });

        CompletableFuture<Void> traversalFuture = buildTreeFuture.thenRunAsync(() -> {
            System.out.print("LevelOrder: ");
            integerBinaryTree.levelOrder(integerBinaryTree.getRoot());
            System.out.println();

            System.out.print("Preorder: ");
            integerBinaryTree.preOrder(integerBinaryTree.getRoot());
            System.out.println();

            System.out.print("Postorder: ");
            integerBinaryTree.postOrder(integerBinaryTree.getRoot());
            System.out.println();

            System.out.print("Inorder: ");
            integerBinaryTree.inOrder(integerBinaryTree.getRoot());
            System.out.println();

            System.out.println("Contains 2? " +
                    integerBinaryTree.contains(integerBinaryTree.getRoot(), 2));
            System.out.println();
        });


        BinaryTree<String> tree = new BinaryTree<>("A");
        tree.insertLeft(tree.getRoot(), "B");
        BinaryTree.Node<String> cNode = tree.insertRight(tree.getRoot(), "C");
        tree.insertLeft(cNode, "D");

        System.out.print("Inorder: ");
        tree.inOrder(tree.getRoot());
        System.out.println();
        System.out.print("Preorder: ");
        tree.preOrder(tree.getRoot());
        System.out.println();
        System.out.print("Postorder: ");
        tree.postOrder(tree.getRoot());
        System.out.println();
        System.out.print("LevelOrder: ");
        tree.levelOrder(tree.getRoot());
        System.out.println();
        System.out.println(tree.contains(tree.getRoot(), "C"));

        traversalFuture.join();
    }
}
