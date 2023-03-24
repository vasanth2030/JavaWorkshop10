package linkedlist;

public class LinkedlistMain {
	public static void main(String[] args) {
		Node head= new Node(10);
		Node.insertValueAtEnd(head, 20);
		Node.insertValueAtEnd(head, 30);
		Node.insertValueAtEnd(head, 40);
		Node.insertValueAtEnd(head, 50);
		
		Node.printLinkedList(head);
		
		head= Node.deleteNodeAtPos(head, 2);
		Node.printLinkedList(head);

		head= Node.deleteNodeAtPos(head, 1);
		Node.printLinkedList(head);
	}
}
