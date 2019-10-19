import java.util.*;

// generic tree struture (type T)
public class Tree <T> {
    Node root;

    // Tree initializes to node with rootData
    public Tree(T rootData) {
        this.root = new Node(rootData);
        this.root.left = null;
        this.root.right = null;
    }

    // Note that it may need a String parameter to keep track of the task name
    static class Node <T> { 
        T data; // this is the image of the option
        Node parent;
        Node left;
        Node right;

        public Node (T data){
            this.data = data;
        }

    }

    // adds 2 nodes at a time to each layer because you need to add binary options every time
    public void insert2NodesAfter(Node node, T leftData, T rightData) {
        node.left = new Node(leftData);
        node.right = new Node(rightData);
    }

    // deletes next options 
    public void deleteNextOptions(Node node){
        node.left = null;
        node.right = null;
    }

    // debugging purposes (prints the tree)
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

    // debugging purpoes (main routine)
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
