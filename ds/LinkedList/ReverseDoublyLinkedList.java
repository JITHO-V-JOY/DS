class Node{
	int data;
	Node prev;
	Node next;
}

class ReverseDoublyLinkedList{
	Node head;

	void insert(int x){
		Node node = new Node();
		node.data = x;
		node.prev = null;
		node.next = null;

		if(head == null){
			head = node;
			System.out.println("Successfully inserted "+x+"\n");
			return;
		}
		Node temp = head;
		while(temp.next != null){
			temp = temp.next;
		}

		temp.next = node;
		node.prev = temp;
		System.out.println("Successfully inserted "+x+"\n");

	}

	void reverse(){
	
		Node temp = null;
		Node current = head;
		while(current.next != null){
			temp = current.next;
			current.next = current.prev;
			current.prev = temp;
			current = current.prev;
		}

		temp = current.next;
		current.next = current.prev;
		current.prev = temp;

		head = current;

		System.out.println("Successfully reversed\n");
	}

	void display(){
	
		Node temp = head;
		String out="";
		while(temp != null){
			out+=Integer.toString(temp.data)+" ";
			temp = temp.next;
		}

		System.out.println(out+"\n");
	}


	public static void main(String args[]){
		ReverseDoublyLinkedList rd = new ReverseDoublyLinkedList();
		rd.insert(1);
		rd.insert(2);
		rd.insert(3);
		rd.insert(4);
		//rd.insert(5);

		rd.display();

		rd.reverse();
		rd.display();
	}


}
