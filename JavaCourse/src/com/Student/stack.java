package com.Student;
import java.util.Scanner;


public  class stack {
	int  size;
	int stackarray[];
	 int top;
	   public stack(int size)
	  {
		   this.size = size;
	//maxSize = size;
	 stackarray = new int[size];
	 top = -1;
	  }
	
   public static void main(String[] args) {
		  
	      int element,size;
	      Scanner sc=new  Scanner(System.in);
	      System.out.println("enter the  size");
		   
 		  // size= sc.nextInt();
 		   stack thestack = new stack(sc.nextInt()); 
		

		    int ch = -1;
		    while(ch!=0) {
		    	System.out.println("enter your choice enter 1 for push, 2 for pop, 0 for exit");
	     		 ch= sc.nextInt();
	     		 
	     		 
			    switch(ch)
			     {
			case 1:
			         System.out.println("Push:-");
			         System.out.println("enter element");
			         element=sc.nextInt();
		             thestack. push(element);
		             System.out.println("stack = ");
		             thestack.printStack(thestack);
		             
			         break;
				        
			case 2:
				
				         	System.out.println("pop");
				         	thestack.pop();
				         	thestack.printStack(thestack);
				         	 break;
						        
				     
			     }    		    }
		    
     		 
	
   }

private  void printStack(stack thestack) {
	for(int  stackElement=0;stackElement <thestack.size;stackElement++) {
		 System.out.println("index = "+stackElement+ " value = "+stackarray[stackElement]);
	 }
}

	public void push(int element)
	{
		if(isFull())
		{
		System.out.println("Stack overflow");
		}
	else
	{
		top++;
		stackarray[top]=element;
		
	}
	}
	
	public  int pop()
		{
		if(isEmpty())
				{
			return 0;
				}
		else
		{
			return stackarray[top--];
			
		}
		}
public 	Boolean isFull()
{
			if (top==size-1)
				return true;
			else
				return false;
		}
		 Boolean isEmpty()
		{
			if(top==-1)
				return true;
			else
				return false;
		}
		}
		
	
	
