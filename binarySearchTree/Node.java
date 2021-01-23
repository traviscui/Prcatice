package binarySearchTree;

public class Node {
	public Node leftChild;
	public Node rightChild;
	public int value;
	
	public Node(int value) {
		this.leftChild = null;
		this.rightChild = null;
		this.value = value;
	}
	
	public void setChild(String side, Node node) {
		if (side == "left")
			this.leftChild = node;
		else
			this.rightChild = node;
	}
}
