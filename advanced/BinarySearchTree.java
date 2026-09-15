/**
 * 05 - BinarySearchTree
 * A binary search tree: insert, search, inorder/preorder/postorder traversals.
 *
 * Concepts: trees, recursion, BST ordering invariant, traversals.
 *
 * Run:
 *   javac BinarySearchTree.java
 *   java BinarySearchTree
 *
 * Sample output:
 *   Inorder (sorted): 20 30 40 50 60 70 80
 *   Search 40: found
 *   Search 99: not found
 */
public class BinarySearchTree {
    private static class Node {
        int key;
        Node left, right;
        Node(int key) { this.key = key; }
    }

    private Node root;

    public void insert(int key) {
        root = insert(root, key);
    }

    private Node insert(Node node, int key) {
        if (node == null) {
            return new Node(key);
        }
        if (key < node.key) {
            node.left = insert(node.left, key);
        } else if (key > node.key) {
            node.right = insert(node.right, key);
        }
        return node; // duplicates ignored
    }

    public boolean search(int key) {
        Node cur = root;
        while (cur != null) {
            if (key == cur.key) {
                return true;
            }
            cur = (key < cur.key) ? cur.left : cur.right;
        }
        return false;
    }

    public void inorder()   { inorder(root);   System.out.println(); }
    public void preorder()  { preorder(root);  System.out.println(); }
    public void postorder() { postorder(root); System.out.println(); }

    private void inorder(Node n) {
        if (n != null) { inorder(n.left); System.out.print(n.key + " "); inorder(n.right); }
    }

    private void preorder(Node n) {
        if (n != null) { System.out.print(n.key + " "); preorder(n.left); preorder(n.right); }
    }

    private void postorder(Node n) {
        if (n != null) { postorder(n.left); postorder(n.right); System.out.print(n.key + " "); }
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        int[] keys = {50, 30, 70, 20, 40, 60, 80};
        for (int k : keys) {
            bst.insert(k);
        }
        System.out.print("Inorder (sorted): ");
        bst.inorder();
        System.out.print("Preorder: ");
        bst.preorder();
        System.out.println("Search 40: " + (bst.search(40) ? "found" : "not found"));
        System.out.println("Search 99: " + (bst.search(99) ? "found" : "not found"));
    }
}
