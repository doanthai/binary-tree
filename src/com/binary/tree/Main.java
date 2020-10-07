package com.binary.tree;

public class Main {

  public static void main(String[] args) {
    BinaryTree tree = new BinaryTree();

    tree.setRoot(new Node(1));
    tree.getRoot().setLeft(new Node(2));
    tree.getRoot().setRight(new Node(3));
    tree.getRoot().getLeft().setLeft(new Node(4));

    System.out.print("Pre order Traversal: ");
    tree.traversePreOrder(tree.getRoot());
    System.out.print("\nIn order Traversal: ");
    tree.traverseInOrder(tree.getRoot());
    System.out.print("\nPost order Traversal: ");
    tree.traversePostOrder(tree.getRoot());
  }
}
