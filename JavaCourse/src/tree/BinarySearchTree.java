package tree;

import java.io.Console;

public class BinarySearchTree {

	public static void main(String[] args) {
		BST bst=new BST();
        bst.add(50);
		bst.add(17);
		bst.add(72);
		bst.add(54);
		bst.add(76);
		bst.add(23);
		bst.add(54);
		bst.add(25);
		
		BSTsearch searchTree = new BSTsearch();
		int searchValue = 25;
		searchBST(bst, searchTree, searchValue);
		searchValue = 26;
		searchBST(bst, searchTree, searchValue);
		searchValue = 54;
		searchBST(bst, searchTree, searchValue);
	}

	private static void searchBST(BST bst, BSTsearch searchTree, int searchValue) {
		boolean isPresent = searchTree.search(bst, searchValue);
		if(isPresent) {
			System.out.println("Binary Search Tree contains "+searchValue);
		} else {			
			System.out.println("Binary Search Tree does not contain "+searchValue);

			
		}
	}

}
