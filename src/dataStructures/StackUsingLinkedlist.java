package dataStructures;

public class StackUsingLinkedlist {
	//define the Node head
	Node head;
	
	//create the Node class and define value and Node next
	class Node{
		int value;
		Node next;
	}
	
	//create the public constructor
	public StackUsingLinkedlist() {
		head = null;
	}
	
	//create the push method:
	public void push(int value) {
		Node extraHead = head;
		head = new Node();
		head.value = value;
		head.next = extraHead;
	}
	
	//create the pop method
	public int pop() {
		if(head == null) {
			System.out.println("stack is empty");
		}
		
		int value = head.value;
		head = head.next;
		return value;
	}
	
	public static void main(String[] args) {
		StackUsingLinkedlist stack = new StackUsingLinkedlist();
		//System.out.println(stack.pop()); //NullPointerException
		
		stack.push(50);
		stack.push(30);
		stack.push(60);
		stack.push(20);
		stack.push(10);
		
		System.out.println(stack.pop());
	}

}
