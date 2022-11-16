package uk.ac.cam.ss2960.sets;

import java.util.ArrayList;

public class SearchSet {
  public class BinaryTreeNode {
    private int mValue;
    private BinaryTreeNode mLeft;
    private BinaryTreeNode mRight;

    public BinaryTreeNode(int value) { mValue = value;  }

    public int getValue() { return mValue; }
    public void setValue(int value) { mValue = value; }

    public BinaryTreeNode getLeft() { return mLeft; }
    public BinaryTreeNode getRight() { return mRight; }
    public void setLeft(BinaryTreeNode tree) { mLeft = tree; }
    public void setRight(BinaryTreeNode tree) { mRight = tree; }
  }


  private int mElements;
  private BinaryTreeNode mHead;

  public SearchSet() {
    mElements = 0;
    mHead = null;
  }

  public void insert(int value) {
    BinaryTreeNode currentNode = mHead;
    while (true) {
      if (mHead == null) {
        mHead = new BinaryTreeNode(value);
        mElements++;
        return;
      }

      if (currentNode.getValue() < value) {
        if (currentNode.getRight() == null) {
          currentNode.setRight(new BinaryTreeNode(value));
          mElements++;
          return;
        }
        currentNode = currentNode.getRight();
      } else {
        if (currentNode.getLeft() == null) {
          currentNode.setLeft(new BinaryTreeNode(value));
          mElements++;
          return;
        }
        currentNode = currentNode.getLeft();
      }




    }

  }

  public int getNumberElements() {
    return mElements;
  }

  public boolean contains(int value) {
    ArrayList<BinaryTreeNode> nodes = new ArrayList<>();
    nodes.add(mHead);
    while (!nodes.isEmpty()) {
      BinaryTreeNode node = nodes.get(0);
      if (node == null) { return false; }
      if (node.getValue() == value) { return true; }
      nodes.add(node.getLeft());
      nodes.add(node.getRight());
      nodes.remove(0);
    }
    return false;
  }

  public void main(String[] args) {

  }
}
