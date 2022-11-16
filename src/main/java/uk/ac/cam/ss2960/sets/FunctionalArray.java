package uk.ac.cam.ss2960.sets;

public class FunctionalArray {
    private final SearchSet.BinaryTreeNode head;
    private final int length;

    private static void instantiate(SearchSet.BinaryTreeNode tree, int length) {
        
    }

    FunctionalArray(int length) {
        this.length = length;
        head = new SearchSet.BinaryTreeNode(0);
        SearchSet.BinaryTreeNode currentNode = head;
        for (int i = 0; i < length; i++) {
            currentNode.setLeft(new SearchSet.BinaryTreeNode(0));
            currentNode.setRight(new SearchSet.BinaryTreeNode(0));
        }
    }

    public void set(int index, int value) {
        SearchSet.BinaryTreeNode currentNode = head;

        for (int i = 0; i<index; i++) {
            if (index % 2 == 0) {
                currentNode = currentNode.getLeft();
            } else {
                currentNode = currentNode.getRight();
            }
        }

        currentNode.setValue(value);
    }

    public int get(int index) {
        if (index >= length) { throw new ArrayIndexOutOfBoundsException(); }

        SearchSet.BinaryTreeNode currentNode = head;

        for (int i = 0; i<index; i++) {
            if (index % 2 == 0) {
                currentNode = currentNode.getLeft();
            } else {
                currentNode = currentNode.getRight();
            }
        }

        return currentNode.getValue();
    }
}
