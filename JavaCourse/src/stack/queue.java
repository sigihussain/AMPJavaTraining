package stack;

import java.util.Scanner;

public class queue {
	int length;
	int head;  int tail;
	int Array[];
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size");
		int l=s.nextInt();
		queue myqueue=new queue(l);
		System.out.println("checking queue is empty:");
		System.out.println(myqueue.empty());
		for(int i=0;i<l;i++) {
			System.out.println("enter the element");
			int ele=s.nextInt();
		myqueue.enqueue(ele);
		//System.out.println(mystack.empty());
		
		}
		
		
		
		System.out.print("fifo from stack ");
		while(!myqueue.empty())
		{
			
			System.out.print( myqueue.dequeue()+"   ");
		}
			
			//System.out.println(mystack.pop()+ "  is poped");
			
	}
	


public queue(int n)
{
length=n;
Array=new int[length];
head=-1;
tail=-1;

}
public boolean empty()
{
	if(head==-1 && tail==-1)
	{
		return true;
	}
	else
	{
		return false;
	
	}
}
public void enqueue(int m)
{
	tail++;
//	head++;
	if(tail<length)
	{
		Array[tail]=m;
		if(tail==0) {
			head++;
		}
		//tail++;
	}
	
}


 /*void printstack()
{
	 System.out.print("stack elements ");
for(int i=0;i<Array.length;i++)
{
	
	System.out.print(Array[i]+" ");
}

}*/
	public int dequeue()
	{
int temp=Array[head];
		if(this.empty()) {
		return -1;
		}
		else if (head==tail)
		{
			head=-1;
			tail=-1;
			return temp;
		}
		
		else
		{
			head++;
		return temp;
		}
	
		
	}
}
