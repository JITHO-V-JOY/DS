
// FIFO principle
class Stack{
	
	int capacity;
	int top = -1;
	int[] stack;
	
	Stack(int capacity){
		this.capacity = capacity;
		stack = new int[this.capacity];
	}
	
	boolean isEmpty() {
		return(top == -1);
	}
	
	boolean isFull() {
		return (top == capacity-1);
	}
	
	void push(int num) {
		
		if(isFull()) {
			System.out.println("Stack Overflow\n");
		} else {
			stack[++top] = num;
			System.out.println(num+ " inserted\n");
		}
		
	}
	
	void pop() {
		if(isEmpty()) {
			System.out.println("Stack Underflow \n");
		}else {
			System.out.println(stack[top--]+" deleted\n");
		}
	}
	
	
	
	
	void peek(){
		if(isEmpty()) {
			System.out.println("Stack Underflow \n");
		}else {
			System.out.println(stack[top]+" peek element\n");
		}
		
	}
	
}


class Main{
	
	public static void main(String args[]) {
	Stack st = new Stack(10);
	st.push(1);
	st.push(2);
	st.push(3);
	st.push(4);
	st.push(5);
	st.push(6);
	st.push(7);
	st.push(8);
	st.push(9);
	st.push(10);
	
	st.push(11); //stack overflow
	
	st.peek();
	
	st.pop();
	st.pop();

	st.peek();
	
	st.pop();
	st.pop();
	st.pop();
	st.peek();
	st.pop();
	st.pop();
	st.pop();
	st.peek();
	st.pop();
	st.pop();
	
	st.pop(); // stack underflow
	
	
	
	}
	
}
