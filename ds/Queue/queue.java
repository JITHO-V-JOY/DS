

class Queue{
	 int capacity;
	 int front = -1;
	 int rear = -1;
	 int[] queue;
	
	Queue(int capacity){
		this.capacity = capacity;
		queue = new int[this.capacity];
	}
	
	boolean isEmpty() {
		return ( front == -1 || front > rear);
	}
	
	boolean isFull() {
		return (rear == capacity-1);
	}
	
	void enque(int num) {
		if(isFull()) {
			System.out.println("Queue is full\n");
		} else {
			
			queue[++rear] = num;
			
			if(front == -1) {
				front++;
			}
			
			System.out.println(num +" inserted\n");	
			
		}
		
	}
	
	void deque() {
		if(isEmpty()) {
			System.out.println("Queue is empty\n");
			front = rear = -1; // for reusing the queue;
		}else {
			int num = queue[front];
			System.out.println(num+" deleted\n");
			front++;
		}
	}
	
	String getString(int[] queue) {
		
		
		String out="";
		for(int i = front; i<= rear; i++) {
			int num = queue[i];
			out+= Integer.toString(queue[i])+" ";
		}
		
		return out;
	}
	
	void traverse() {

			if(isEmpty()) {
				System.out.println("Queue is empty\n");
			}
			else {
		
				System.out.println(getString(queue)+"\n");
			}
		
	}
	
	void frontElement() {

		if(isEmpty()) {
			System.out.println("Queue is empty\n");
		}
		else {
		System.out.println(queue[front]+ " is front element\n");
		}
	}
	
	void rearElement() {
		if(isEmpty()) {
			System.out.println("Queue is empty\n");
		}
		else {
		System.out.println(queue[rear]+ " is rear element\n");
		}
	}
	
	
}

class Main{
	public static void main(String args[]) {
		Queue q = new Queue(10);
		q.enque(1);
		q.enque(2);
		q.enque(3);
		q.enque(4);
		q.enque(5);
		q.enque(6);
		q.enque(7);
		q.enque(8);
		q.enque(9);
		q.enque(10);
		
		q.enque(11);
		
		q.traverse();
		
		q.deque();
		q.traverse();
		
		q.deque();
		q.traverse();
		
		q.deque();
		q.traverse();
		
		q.deque();
		q.traverse();
		
		q.deque();
		q.traverse();
		
		q.deque();
		q.traverse();
		
		q.deque();
		q.traverse();
		
		
		q.deque();
		q.traverse();
		
		q.deque();
		q.traverse();
		
		q.deque();
		q.traverse();
		
		q.deque();
		q.traverse();
		
		q.frontElement();
		q.rearElement();
		
		q.enque(1);
		q.traverse();
		
	}
}
