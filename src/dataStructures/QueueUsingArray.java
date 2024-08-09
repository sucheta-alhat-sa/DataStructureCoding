package dataStructures;

public class QueueUsingArray {
	
	int queueArr[];
	int front;
	int rear;
	int currentSize; //current array size
	int capacity; //total array capacity/size
	
	public QueueUsingArray(int size) {
		this.capacity = size;
		this.front = 0;
		this.rear = -1;
		this.queueArr = new int[this.capacity];
	}
	
	//isEmpty
	public boolean isEmpty() {
		if(currentSize == 0) {
			return true;
		}else {
			return false;
		}
	}
	
	//isFull
	public boolean isFull() {
		if(currentSize == capacity) {
			return true;
		}else {
			return false;
		}
	}
	
	//enqueue
	public void enQueue(int data) {
		if(isFull()) {
			System.out.println("Queue is full");
		}else {
			rear++;
			if(rear == capacity-1) {
				rear = 0;
			}
			queueArr[rear] = data;
			currentSize++;
			System.out.println(data + ":" + "inserted into queue");
		}
	}
	
	//dequeue
	public void deQueue() {
		if(isEmpty()) {
			System.out.println("queue is empty, cannot remove");
		}else {
			front++;
			if(front==capacity-1) {
				System.out.println("data removed: "+ queueArr[front-1]);
				front = 0;
			}else {
			System.out.println("data removed: "+ queueArr[front-1]);
			}
			currentSize--;
		}
	}

	public static void main(String[] args) {
		QueueUsingArray queue = new QueueUsingArray(10);
		queue.deQueue();
		queue.enQueue(10);
		queue.enQueue(20);
		queue.enQueue(30);
		queue.enQueue(40);
		queue.enQueue(50);
		
		queue.deQueue();
		

	}

}
