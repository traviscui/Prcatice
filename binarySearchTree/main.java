package binarySearchTree;

public class main {

	public static void main(String[] args) {
		Tree tree = new Tree();
		
		tree.search(tree.root, 66);
		
		tree.insert(200);
		tree.insert(25);
		tree.insert(34);
		tree.insert(66);
		tree.insert(23);
		tree.insert(12);
		tree.insert(90);
		tree.insert(40);
		tree.insert(45);
		tree.insert(44);
		
		tree.search(tree.root, 66);
		tree.search(tree.root, 40);
		tree.search(tree.root, 23);
		tree.search(tree.root, 12);
		tree.search(tree.root, 25);
		tree.search(tree.root, 191919);
		tree.search(tree.root, 0);
		
		Tree tree2 = new Tree();
		
		tree2.search(tree2.root, 66);
		
		tree2.insert(tree2.root, 200);
		tree2.insert(tree2.root, 25);
		tree2.insert(tree2.root, 34);
		tree2.insert(tree2.root, 66);
		tree2.insert(tree2.root, 23);
		tree2.insert(tree2.root, 12);
		tree2.insert(tree2.root, 90);
		tree2.insert(tree2.root, 40);
		tree2.insert(tree2.root, 45);
		tree2.insert(tree2.root, 44);
		
		tree2.search(tree2.root, 66);
		tree2.search(tree2.root, 40);
		tree2.search(tree2.root, 23);
		tree2.search(tree2.root, 12);
		tree2.search(tree2.root, 25);
		tree2.search(tree2.root, 191919);
		tree2.search(tree2.root, 0);
	}

}
