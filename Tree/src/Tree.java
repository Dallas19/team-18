import java.util.*;

public class Tree {
    private Node<T> root;

    public Tree(T rootData) {
        root = new Node<T>();
        root.data = rootData;
        root.left = null;
        root.right = null;
    }

    public static class Node<T> {
        private T data; // this is the image of the option
        private Node<T> parent;
        private Node<T> left;
        private Node<T> right;
    }

    public insertNodeAfter(Node<T> node, Node<T> left, Node<T> right, T data) {
        node.data = data;
        node.left = left;
        node.right = right;
    }

    public deleteNextOptions(Node<T> node){
        node.left = null;
        node.right = null;
    }
}

