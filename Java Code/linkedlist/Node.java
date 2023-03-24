package linkedlist;

public class Node {
	int data;
	Node next;
	
	Node(int data)
	{
		this.data=data;
		next=null;
	}
	
	public static void insertValueAtEnd(Node head, int data)
	{
		Node newNode= new Node(data);
		Node currNode=head;
		
		while(currNode.next!=null)
		{
			currNode= currNode.next;
		}
		
		currNode.next= newNode;
	}
	
	public static Node deleteNodeAtPos(Node head, int pos)
	{
		if(pos==1)
		{
			return head.next;
		}
		
		Node currNode= head;
		for(int i=1;i<pos-1;i++)
		{
			if(currNode==null)
			{
				return head;
			}
			currNode=currNode.next;
		}
		
		currNode.next= currNode.next.next;
		return head;
	}
	
	public static void printLinkedList(Node head)
	{
		Node currNode= head;
		while(currNode!=null)
		{
			System.out.print(currNode.data+" --> ");
			currNode= currNode.next;
		}
		
		System.out.println();
	}
}
