package binarySearchTree;

public class Tree{
	public Node root;
	
	public Tree() {
		this.root = null;
	}
	
	public void insert(int value) {
		Node placeToInsertParent = this.root;
		Node nodeToAdd = new Node(value);
		if (this.root == null) {
			this.root = nodeToAdd;
			return;
		}
		while (placeToInsertParent != null){
			if ((value < placeToInsertParent.value) & (placeToInsertParent.leftChild == null)) {
				placeToInsertParent.leftChild = nodeToAdd;
				return;
			} else if ((value < placeToInsertParent.value) & (placeToInsertParent.leftChild != null)) {
				placeToInsertParent = placeToInsertParent.leftChild;
				continue;
			} else if ((value >= placeToInsertParent.value) & (placeToInsertParent.leftChild == null)) {
				placeToInsertParent.rightChild = nodeToAdd;
				return;
			} else {
				placeToInsertParent = placeToInsertParent.rightChild;
				continue;
			}
		}
		
	}
	
	public Node insert(Node placeToAdd, int value) {
		if (this.root == null) {
			this.root = new Node(value);
			return this.root;
		}
		if (placeToAdd == null) 
			return new Node(value);
		else if (value < placeToAdd.value) {
			placeToAdd.leftChild = insert(placeToAdd.leftChild, value);
			return placeToAdd;
		}else {
			placeToAdd.rightChild = insert(placeToAdd.rightChild, value);
			return placeToAdd;
		}
	}
	
//	public String search(int value) {
//		int valueToFind = value;
//		Node placeToSearch = this.root;
//		String result = "";
//		if (this.root == null) {
//			result = "Tree empty";
//			return result;
//		}
//		while (placeToSearch != null) {
//			if (valueToFind == placeToSearch.value) {
//				result = "Found!";
//				return result;
//			} else if (valueToFind < placeToSearch.value) {
//				placeToSearch = placeToSearch.leftChild;
//				continue;
//			} else {
//				placeToSearch = placeToSearch.rightChild;
//				continue;
//			}
//		}
//		result = "Nothing found.";
//		return result;
//		
//	}
	
	public void search(Node placeToSearch, int value) {
		if (this.root == null) {
			System.out.println("Empty Tree");
			return;
		}
		if (placeToSearch.value == value) {
			System.out.println("Found!");
			return;
		}
		else if (value < placeToSearch.value) {
			if (placeToSearch.leftChild == null) {
				System.out.println("Not Found.");
				return;
			}
			this.search(placeToSearch.leftChild, value);
			return;
		}
		else {
			if (placeToSearch.rightChild == null) {
				System.out.println("Not Found.");
				return;
			}
			this.search(placeToSearch.rightChild, value);
			return;
		}
	}
}

