import java.util.*;

// generic tree structure
public class Tree <T> {
    Node root;

    public Tree(T rootData) {
        this.root = new Node(rootData);
        this.root.left = null;
        this.root.right = null;
    }

    static class Node <T> {
        T data; // this is the image of the option
        Node parent;
        Node left;
        Node right;

        public Node (T data){
            this.data = data;
        }

    }

    public void insert2NodesAfter(Node node, T leftData, T rightData) {
        node.left = new Node(leftData);
        node.right = new Node(rightData);
    }

    public void deleteNextOptions(Node node){
        node.left = null;
        node.right = null;
    }

    // debugging purposes
    public void printTree(Node node){
        System.out.println(node.data);
        Node left = node.left;
        Node right = node.right;
        if (left != null) {
            printTree(left);
        }
        if (right != null) {
            printTree(right);
        }
    }

    /*
    public static void main (String[] args) {
        Tree<Integer> tree = new Tree<Integer>(5);
        tree.insert2NodesAfter(tree.root, 6, 7);
        tree.insert2NodesAfter(tree.root.left, 8, 5);
        tree.printTree(tree.root);
        System.out.println();
        tree.deleteNextOptions(tree.root.left);
        tree.printTree(tree.root);
    }
    */
}


