class Node{
	int data;
	Node left;
	Node right;
}

class BinarySearchTree{
	Node root;

	void insert(int x){
		Node node = new Node();
		node.data = x;
		node.left = null;
		node.right = null;

		Node temp = root;
		Node prev = root;
		if(temp == null){
			root = node;
			System.out.println("Successfully insert "+x+" at root\n");
			return;
		}

		while(temp != null){
			if(x > temp.data){
				prev = temp;
				temp = temp.right;
			}
			else{
				prev = temp;
				temp = temp.left;
			}
		}

		if(x > prev.data){
			prev.right = node;
			System.out.println("Successfully inserted "+x+" at the right of "+prev.data+"\n");
		}
		else{
			prev.left = node;
			System.out.println("Successfully inserted "+x+" at the left of "+prev.data+"\n");

		}
	}


	void preorder(Node node){
		if(node == null){
			return;
		}
		System.out.println(node.data);
		preorder(node.left);
		preorder(node.right);
		
	}

	void inorder(Node node){
		if(node == null){
                        return;
                }
		inorder(node.left);
                System.out.println(node.data);
                inorder(node.right);

	}

	void postorder(Node node){
		if(node == null){
			return;
		}
		postorder(node.left);
		postorder(node.right);
		System.out.println(node.data);

	}
}



class Main{
	public static void main(String args[]){
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(10);
		bst.insert(8);
		bst.insert(20);
		bst.insert(30);
		bst.insert(18);
		bst.insert(5);
		bst.insert(7);
		
		System.out.println("preorder traversal");
		bst.preorder(bst.root);
		System.out.println("inorder traversal");
		bst.inorder(bst.root);
		System.out.println("postorder traversal");
		bst.postorder(bst.root);
	}
}
