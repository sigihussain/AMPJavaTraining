package tree;

public class BSTsearch {
	public boolean search(BST tree,int searchValue) {
		 Node temp;
		if(tree!=null) {
			temp = tree.getRoot();
			while(temp!=null) {
				if(temp.value==searchValue) {
					return true;
				} else if(temp.value>searchValue) {
					temp = temp.leftchild;
					continue;
				} else {
					temp = temp.rightchild;
					continue;
				}
			}
		}
		return false;
	}

	

}
