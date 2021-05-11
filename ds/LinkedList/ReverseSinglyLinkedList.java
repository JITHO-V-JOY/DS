class Node{
	int data;
	Node link;

}

class ReverseSinglyLinkedList{
	Node head;

	void insert(int x){
		Node node = new Node();
		node.data = x;
		node.link = null;

		if(head == null){
			head = node;
			System.out.println("Successfully inserted "+ x+"\n");
			return;
		}

		Node temp = head;
		while(temp.link != null){
			temp = temp.link;
		}

		temp.link = node;
		System.out.println("Successfully inserted "+ x+"\n");
	}

	void reverse(){
		Node prev = null;
		Node next = null;

		while(head!=null){
			next = head.link;
			head.link = prev;
			prev = head;
			head = next;
		}

		head = prev;

		System.out.println("Successfully reversed\n");
	}

	void display(){
		String out="";
		Node temp = head;
		while(temp != null){
			out+=Integer.toString(temp.data)+" ";
			temp = temp.link;
		}

		System.out.println(out+"\n");
	}

	public static void main(String args[]){
		ReverseSinglyLinkedList  rs = new ReverseSinglyLinkedList();
		rs.insert(1);
		rs.insert(2);
		rs.insert(3);
		rs.insert(4);
		rs.insert(5);

		rs.display();

		rs.reverse();

		rs.display();
	}

}
