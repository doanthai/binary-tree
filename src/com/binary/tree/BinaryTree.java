package com.binary.tree;

public class BinaryTree {
  private Node root;

  public Node getRoot() {
    return root;
  }

  public void setRoot(Node root) {
    this.root = root;
  }

  public BinaryTree(int key) {
    this.root = new Node(key);
  }

  public BinaryTree() {
    this.root = null;
  }

  public void traverseInOrder(Node node) {
    if (node != null) {
      traverseInOrder(node.getLeft());
      System.out.print(node.getKey());
      traverseInOrder(node.getRight());
    }
  }

  public void traversePostOrder(Node node) {
    if (node != null) {
      traversePostOrder(node.getLeft());
      traversePostOrder(node.getRight());
      System.out.print(node.getKey());
    }
  }

  public void traversePreOrder(Node node) {
    if (node != null) {
      System.out.print(node.getKey());
      traversePreOrder(node.getLeft());
      traversePreOrder(node.getRight());
    }
  }
}
