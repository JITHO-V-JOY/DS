
class Node{
	
	int data;
	Node prev;
	Node next;
}

public class DoublyLinkedList {
	Node head;

	int lengthOfList(){
	
		Node tmp = head;
		int count =0;
		if(tmp == null){
			return count;
		}
		while(tmp != null){
			count++;
			tmp = tmp.next;
		}

		return count;
	}

	
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

	void insertAtLocation(int loc , int x){
		int temp = loc;
		Node node = new Node();
		node.data = x;
		node.prev = null;
		node.next = null;

		if(loc == 1 && head == null){ // empty list
			head = node;
			System.out.println( x+" Succesfully inserted at "+ temp+"\n");
			return;
		}

		if(loc == 1){
			node.next = head.next;
			head.prev = node;
			head = node;
			System.out.println( x+" Succesfully inserted at "+temp+"\n");
			return;
		}

		if(loc > lengthOfList()){
			System.out.println("location exceeded the length of list\n");
			return;
		}

		Node tmp = head;
		while(loc-2 > 0){
			tmp = tmp.next;
			loc--;
		}
		node.next = tmp.next;
		node.next.prev = node;
		tmp.next = node;
		node.prev = tmp;

		System.out.println( x+" Succesfully inserted at "+temp+"\n");


	}

	void deleteAt(int loc){
		int temp = loc;
		if(loc > lengthOfList()){
			System.out.println("location exceeded the length of the linked list\n");
			return;
		}
		
		Node tmp = head;
		Node pre = head;
		while(loc-1 >0 ){
			pre = tmp;
			tmp = tmp.next;
			loc--;
		}
		pre.next = tmp.next;
		tmp.next.prev = pre;

		System.out.println("Successfully deleted the element at "+ temp+"\n");



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


		doubly.insertAtLocation(2, 6);
		doubly.insertAtLocation(3, 7);

		doubly.display();
		doubly.displayReverse();

		doubly.deleteAt(2);
		doubly.display();
                doubly.displayReverse();


		doubly.deleteAt(4);

		doubly.display();
		doubly.displayReverse();


		

        }

}

