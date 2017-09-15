package tree;

public class Node {
	public Node leftchild;
	public Node rightchild;
	public int value;
	public Node() {
		leftchild=rightchild=null;
		value=0;
		
	}
public Node(int value)
{
	leftchild=rightchild =null;
	this.value=value;
}
}
