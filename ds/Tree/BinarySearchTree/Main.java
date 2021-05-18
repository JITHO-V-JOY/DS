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

	Node leftMostNode(Node tmp){
		while(tmp.left != null){
			tmp = tmp.left;
		}

		return tmp;
	}

	Node prevNode(Node temp, int key){
		Node prev = temp;
		while(temp!= null){
			if(temp.data == key){
				break;
			}
			else if(temp.data > key){
				prev = temp;
				temp = temp.left;
			}
			else{
				prev = temp;
				temp = temp.right;
			}
		}
		if(temp == null){
			return null;
		}
		else{
			return prev;
		}
	}

	Node find(Node tmp, int key){
		 while(tmp != null){
                        if(tmp.data == key){
                                break;
                        }
                        else if(tmp.data > key ){
                                tmp = tmp.left;
                        }else{
                                tmp = tmp.right;
                        }

                }
		if(tmp == null){
			return null;
		}
		else{
			return tmp;
		}

	}

	Node inorderSuccessor(Node root, int key){
		
		Node current = find(root, key);
		if(current == null) return null;

		if(current.right != null){
			 //case 1: if it has right subtree
			return leftMostNode(current.right);
		}else{
			 //case 1: if it has no right subtree
			Node successor = null;
			Node ancestor = root;

			while(ancestor.data != current.data){
				if(ancestor.data < current.data){
					successor = ancestor;
					ancestor = ancestor.left;
				}else{
					ancestor = ancestor.right;
				}
			}

			return successor;
		}
	}

	void deleteNode(Node root, int key){
		Node current = find(root, key);
		Node prev = prevNode(root, key);

		if(current == null){
			System.out.println("Node is not found\n");
			return;
		}
		// case 1: leaf node
		if(current.left == null && current.right == null){
			if(current.data < prev.data){
				prev.left = null;
				System.out.println("Node "+key+"  is deleted\n");

			}
			else{
				prev.right = null;
				System.out.println("Node "+key+"  is deleted\n");
			}
		}
		// case 2: Node has one child
		else if (current.left == null || current.right == null){
			if(current.left != null){
				current = current.left;
				if(prev.data < current.data){
					prev.right = current;
				}
				else{
					prev.left = current;
				}
				System.out.println("Node "+key+"  is deleted\n");
			}
			else{
				current = current.right;
				 if(prev.data < current.data){
                                        prev.right = current;
                                }
                                else{
                                        prev.left = current;
                                }
                                System.out.println("Node "+key+"  is deleted\n");
                        }

		}
		// case 3: Node has both children 
		else{
			Node inorderSuccessor = inorderSuccessor(root, key);
			Node prevnode = prevNode(root, inorderSuccessor.data);
			if(inorderSuccessor.left == null && inorderSuccessor.right == null){
				if(prevnode.data > inorderSuccessor.data){
					prevnode.left = null;
				}else{
					prevnode.right = null;
				}
				current.data = inorderSuccessor.data;
				System.out.println("Node "+key+"  is deleted\n");
			}
			else{
				current.data = inorderSuccessor.data;
				current.right = inorderSuccessor.right;
				System.out.println("Node "+key+"  is deleted\n");

			}

			


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
		bst.insert(9);
		
		System.out.println("preorder traversal");
		bst.preorder(bst.root);
		System.out.println("inorder traversal");
		bst.inorder(bst.root);
		System.out.println("postorder traversal");
		bst.postorder(bst.root);

		Node inorderSuccessor = bst.inorderSuccessor(bst.root, 10);
		System.out.println("inorder successor of 10 is "+ inorderSuccessor.data);

		bst.deleteNode(bst.root, 10);
		bst.inorder(bst.root);
		
	}
}
