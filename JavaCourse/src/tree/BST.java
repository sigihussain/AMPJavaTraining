package tree;


public class BST {
	private Node root;
	public Node getRoot() {
		return root;
	}
	public void setRoot(Node root) {
		this.root = root;
	}
	public BST()
	{
		root=null;
	}
	public void add(int value) {
		Node node=new Node(value);
		if(root==null)
		{
			root=node;
			return;
		}
		Node temp=root;
		
		while(temp!=null)
		{
			if(temp.value<value)
			{
				//temp=temp.rightchild;
				if(temp.rightchild==null)
				{
					temp.rightchild=node;
					return;
				}else {
					temp = temp.rightchild;
					continue;
				}
			}
	    	else {
	    		//temp=temp.leftchild;
	    		if(temp.leftchild==null)
				{
					temp.leftchild=node;
					return;
				}else {
					temp = temp.leftchild;
					continue;
				}
	    	}
				
			}
		}
	}


	