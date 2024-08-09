package dataStructures;

public class StackImplementationUsingArray {
	
	int size;
	int arr[] ;
	int top;
	
	public StackImplementationUsingArray(int size) {
		this.size = size;
		this.arr= new int[size];
		this.top = -1;
	}
	
	//empty check
	public boolean isEmpty() {
		return (top == -1);
	}
	
	//full check
	public boolean isFull() {
		return (size-1 == top);
	}
	
	//peek -->get the top element without removing it
	public int peek() {
		if(!this.isEmpty()) {
			return arr[top];
		}else {
			return -1;
		}
	}
	
	//push
	public void push(int num) {
		if(!this.isFull()) {
			top++;
			arr[top] = num;
			System.out.println(num + ":" + "Element pushed");
		}else {
			System.out.println("stack is full");
		}
	}
	
	//pop
	public int pop() {
		if(!this.isEmpty()) {
			int topCopy = top;
			top--;
			System.out.println("Element popped " + arr[topCopy]);
			return arr[topCopy];
		}else {
			System.out.println("stack is empty...");
			return -1;
		}
	}

	public static void main(String[] args) {
		StackImplementationUsingArray stack = new StackImplementationUsingArray(10);
		
		stack.pop();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		
		stack.pop();
		stack.pop();
		int value = stack.peek();
		System.out.println(value);
		

	}

}
