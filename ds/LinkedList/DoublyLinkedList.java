
class Node{
	
	int data;
	Node prev;
	Node next;
}

public class DoublyLinkedList {
	Node head;
	
	void insert(int x) {
		Node node = new Node();
		node.data = x;
		node.prev = null;
		node.next = null;
		
		if(head == null) { // empty linked list
			head = node;
			System.out.println( x+" Succesfully inserted\n");
		}
		else {
			Node tmp = head;
			while(tmp.next != null) {
				tmp = tmp.next;
			}
			tmp.next = node;
			node.prev = tmp;
			
			System.out.println( x+" Succesfully inserted\n");
		}
	}
	
	void display() {
		Node tmp = head;
		String out="";
		while(tmp != null) {
			out += Integer.toString(tmp.data)+" ";
			tmp = tmp.next;
		}
		
		System.out.println(out+"\n");
		
	}
	
	void displayReverse() {
		Node tmp = head;
		String out="";
		while(tmp.next!= null) {
			tmp = tmp.next;
		}
		
		while(tmp!=null) {
			out += Integer.toString(tmp.data)+" ";
			tmp = tmp.prev;
		}
		
		System.out.println("Reversed output \n"+out+"\n");
		
	}

	  public static void main(String args[]) {
                DoublyLinkedList doubly = new DoublyLinkedList();
                doubly.insert(1);
                doubly.insert(2);
                doubly.insert(3);
                doubly.insert(4);
                doubly.insert(5);

                doubly.display();
                doubly.displayReverse();

        }

}

