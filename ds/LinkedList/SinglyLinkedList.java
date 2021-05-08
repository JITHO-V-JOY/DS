
// singly linked list node;
 class Node{
	int data;
	Node next;
}


 class SinglyLinkedList{
	Node head; // created the head of the linkedlist;
	
	
	int lengthOfList() {
		Node tmp = head;
		int count = 0;
		if(tmp == null) {
			return count;
		}
		while(tmp != null) {
			count++;
			tmp = tmp.next;
		}
		
	  return count;
	}
	
	void insert(int x) {
		Node n = new Node();
		n.data = x;
		n.next = null;
		
		if(head == null) { // empyt linked list
			head = n;
			System.out.println(x+" inserted successfully\n");
		}
		else {
			Node tmp = head;
			while(tmp.next != null) {
				tmp = tmp.next;
			}
			
			tmp.next = n;
			System.out.println(x+" inserted successfully\n");
		}
		
	}
	
	
	void insertAtLocation(int loc, int x) {
		int temp = loc;
		Node n = new Node();
		n.data = x;
		n.next = null;
		
		if(loc == 1 && head == null) {// empty linked list;
			head = n;
			System.out.println(x+" inserted successfully at location "+loc+"\n");
			return;
			
		}
		
		if(loc == 1) { // to insert at first position
			n.next = head;
			head = n;
			System.out.println(x+" inserted successfully at location "+loc+"\n");
			return;
			
		}
		
		if(loc > lengthOfList()) { // index exceeded the length;
			System.out.println("index exceeded the length");
			return;
		}
		
		
		
		Node tmp = head;
		while(loc-2 > 0) {
			tmp = tmp.next;
			loc--;
		}
		
		n.next = tmp.next;
		tmp.next = n;
		
		System.out.println(x+" inserted successfully at location "+temp+"\n");
		
	}
	
	void deleteAt(int loc) {
		int temp = loc;

		if(loc== 1 && head == null) { // empty linked list
			System.out.println("Sorry linked list is empty"); 
			return;
		}
		
		if(loc == 1) { // first node
			head = head.next;
			System.out.println("Succesfully deleted element at location "+loc+"\n"); 
			return;
			
		}
		
		
		if(loc > lengthOfList()) { // index exceeded the length;
			System.out.println("index exceeded the length");
			return;
		}
		
		
		Node tmp = head;
		Node prev = head;
		
		while(loc-1 > 0) {
			prev = tmp;
			tmp = tmp.next;
			loc--;
		}
		
		prev.next = tmp.next;
		System.out.println("Succesfully deleted element at location "+temp+"\n"); 
	}
	
	
	
	void display() {
		if(lengthOfList() == 0) {
			System.out.println("Sorry no item to dispaly!");
			return;
		}
		else {
			Node tmp = head;
			String out = "";
			while(tmp !=null) {
				out+=Integer.toString(tmp.data)+" ";
				tmp = tmp.next;
			}
			
			System.out.println(out+"\n");
		}
	}
	
	
}


 class Main {
	
	 public static void main(String[] args) {
		 
		SinglyLinkedList list  = new SinglyLinkedList();
		 
		list.insert(1);
	        list.insert(2);
	        list.insert(3);
	        list.insert(4);
	        
	        list.display();
	        
	        list.deleteAt(3);
	        list.display();
	        list.deleteAt(1);
	        
	        list.display();
	        
	        list.insertAtLocation(1, 5);
	        list.display();
	 
	 
	 }
}
	


