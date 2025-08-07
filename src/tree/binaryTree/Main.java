package tree.binaryTree;

public class Main {
    public static void main(String[] args) {
        BinaryTree<String> tree = new BinaryTree<>("A");
        tree.insertLeft(tree.getRoot(),"B");
        BinaryTree.Node<String> cNode  = tree.insertRight(tree.getRoot(),"C");
        tree.insertLeft(cNode,"D");
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
        System.out.println(tree.contains(tree.getRoot(),"C"));
    }
}
