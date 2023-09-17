package stack;

public class ArrayStack {

	static final int MAX_SIZE = 30;
	int arr[] = new int[MAX_SIZE];
	int top = -1;
	
	/**
	 * We are going to push the element in the stack
	 */
	
	void push(int val) {
		if(top == MAX_SIZE -1 ) {
			throw new IndexOutOfBoundsException("Stack Overflow");
		}
		arr[++top] = val;
	}
	
	/**
	 * We are going to pop out the element
	 */
	
	int pop() {
		
		if(top == -1) {
			throw new IndexOutOfBoundsException("Stack underFlow");
		}
		return arr[top--];
		
	}
	
	/**
	 * To find the peak element
	 */
	
	int peek() {
		return arr[top];
	}
}
