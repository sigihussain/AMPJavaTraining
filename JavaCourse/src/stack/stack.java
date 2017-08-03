package stack;

import java.util.Scanner;

public class stack {
	int length;
	int top;
	int Array[];
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size");
		int l=s.nextInt();
		stack mystack=new stack(l);
		System.out.println("checking stack is empty:");
		System.out.println(mystack.empty());
		for(int i=0;i<l;i++) {
			System.out.println("enter the element");
			int ele=s.nextInt();
		mystack.push(ele);
		//System.out.println(mystack.empty());
		
		}
		
		
		mystack.printstack();
		System.out.println(" ");
		System.out.println(mystack.peek()+ " is in the peek");
		
		System.out.print("LIFO from stack ");
		while(!mystack.empty())
		{
			
			System.out.print( mystack.pop()+" ");
		}
			
			//System.out.println(mystack.pop()+ "  is poped");
			
	}
	
public stack(int n)
{
length=n;
Array=new int[length];
top=0;

}
public boolean empty()
{
	if(top==0)
	{
		return true;
	}
	else
	{
		return false;
	
	}
}
public void push(int m)
{
	if(top<length)
	{
		Array[top]=m;
		top++;
	}
	else
	{
		System.out.println("stack overflow");
	}
}
public int peek()
{
	if (top>0)
	{
		return Array[top-1];
	}
	else
	{
		return   -1;
	}
}
 void printstack()
{
	 System.out.print("stack elements ");
for(int i=0;i<Array.length;i++)
{
	
	System.out.print(Array[i]+" ");
}

}
	public int pop()
	{
		
			int temp=this.peek();
			//Array[top-1]= -1;
			top--;
			return temp;
		
		
}
}
