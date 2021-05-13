class CircularQueue{
	int capacity;
	int front = -1;
	int rear = -1;
	int[] queue;

	CircularQueue(int capacity){
		this.capacity = capacity;
		queue = new int[this.capacity];
	}


	boolean isFull(){
		if(front == rear+1){
			return true;
		}else if(front == 0 && rear == capacity-1){
			return true;
		}else{
			return false;
		}
	}

	boolean isEmpty(){
		if(front == -1 && rear == -1){
			return true;
		}
		else{
			return false;
		}
	}

	void enqueue(int x){
		if(isFull()){
			System.out.println("Queue is full\n");
			
		}else{
			if(rear == capacity - 1){
				rear = 0;
				queue[rear] = x;
				if(front == -1){
					front++;
				}
				System.out.println("Successfully inserted "+x+"\n");
			}else{
				rear++;
				queue[rear] = x;
                                if(front == -1){
                                        front++;
                                }
                                System.out.println("Successfully inserted "+x+"\n");   
			}		
		}	
	}

	void dequeue(){
		if(isEmpty()){
			System.out.println("Queue is empty \n");
		}else{
			if(front == rear){
				int item = queue[front];
				rear = front = -1;
				System.out.println("Successfully deleted "+ item+"\n");
			}else if(front == capacity - 1){
				int item = queue[front];
                                front = 0;
				System.out.println("Successfully deleted "+ item+"\n");

                        }else{
				int item = queue[front];
                                front++;
                                System.out.println("Successfully deleted "+ item+"\n");

			}
		}
	}

	void display(){
		if(isEmpty()){
			System.out.println("Queue is empty \n");

		}else{
			String out = "";
			if(rear>=front){
				for(int i = front; i<=rear; i++){
					out+=Integer.toString(queue[i])+" "; 	
				}
			}else{
				for(int i = front; i<capacity; i++){
					out+=Integer.toString(queue[i])+" ";
				}

				for(int i = 0; i<=rear; i++){
					out+=Integer.toString(queue[i])+" ";
				}
			}

			System.out.println(out+"\n");


		}
	}

		
	public static void main(String args[]){
		CircularQueue cq = new CircularQueue(5);
		cq.enqueue(1);
		cq.enqueue(2);
		cq.enqueue(3);
		cq.enqueue(4);
		cq.enqueue(5);

		cq.enqueue(6); // queue is full

		cq.display();

		cq.dequeue();

		cq.display();

		cq.dequeue();

                cq.display();

		System.out.println("circular insertion starts...\n");

		cq.enqueue(6);

		cq.display();

		cq.enqueue(7);

                cq.display();


	}



}
