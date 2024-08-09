package dataStructures;

public class LinkedListConcept {

	static Node head;

	public static class Node {
		Node next;
		int data;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	// add data
	public void addData(int data) {
		//create a new node with given data
		Node newNode = new Node(data);
		newNode.next = null;
		
		//if head is null which means list is empty hence we assign the new node to the head
		if (head == null) {
			head = newNode;
		} else {
			//else traverse till the end and insert the new_node there
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			//insert the new node at the last
			temp.next = newNode;
		}
	}

	// display data:
	public void display() {
		Node temp = head;
		//traverse through the linked list
		while (temp.next != null) {
			//print the data at the current node 
			System.out.println(temp.data + " ");
			//go to the next node
			temp = temp.next;
		}
	}

	public static void main(String[] args) {
		LinkedListConcept list = new LinkedListConcept();
		list.addData(30);
		list.addData(20);
		list.display();
		

	}

}
