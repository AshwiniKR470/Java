package datastructure.stack;
class Node
{
	int data;
	Node next;
	Node(int data)
	{
		this.data=data;
		this.next=null;
	}
}
class Stack
{
	Node top;
	Stack()
	{
		top=null;
	}
	void push(int data)
	{
		Node newNode=new Node(data);
		newNode.next=top;
		top=newNode;
		System.out.println(data+" Inserted");
	}
	void pop()
	{
		if(top==null)
		{
			System.out.println("Stack is Empty");
		}
		else
		{
			System.out.println("Deleted Element:"+top.data);
			top=top.next;
		}
	}
	void peek()
	{
		if(top==null)
		{
			System.out.println("Stack is Empty");
		}
		else
		{
			System.out.println("Top Element:"+top.data);
		}
	}
	void display()
	{
		if(top==null)
		{
			System.out.println("Stack is Empty");
		}
		else
		{
			Node temp=top;
			System.out.println("Stack Elements:");
			while(temp!=null)
			{
				System.out.println(temp.data);
				temp=temp.next;
			}
		}
	}
}
public class ImplementationOfStackUsingLL {

	public static void main(String[] args) {
		Stack s=new Stack();
		s.push(10);
        s.push(20);
        s.push(30);
        s.display();
        s.peek();
        s.pop();
        s.display();

	}

}
