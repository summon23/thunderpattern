package DataStructure;

public class BinaryTree {
    /*
        Node for Tree
     */
    static class Node {
        int key;
        Node left, right;

        public Node(int item) {
            key = item;
            left = right = null;
        }
    }

    Node root;

    BinaryTree(int nodeValue) {
        root = new Node(nodeValue);
    }

    BinaryTree() {
        root = null;
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.root = new Node(1);

        tree.root.left = new Node(2);
        tree.root.right = new Node(3);

        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(3);
    }


}
