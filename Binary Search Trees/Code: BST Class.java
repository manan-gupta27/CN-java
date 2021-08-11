/*
 * Binary Tree Node class
 * 
 * class BinaryTreeNode<T> { 
 * 		T data; 
 * 		BinaryTreeNode<T> left; 
 * 		BinaryTreeNode<T> right;
 * 		public BinaryTreeNode(T data) 
 * 		{ 
 * 			this.data = data; 
 * 		}
 * }
 */

 /* 
 * Main Method being used internally
 *	public static void main(String[] args) throws IOException {
 *		BinarySearchTree bst = new BinarySearchTree();
 *		int choice, input;
 *		int q = Integer.parseInt(br.readLine());
 *		while (q-- > 0) {
 *			st = new StringTokenizer(br.readLine());
 *			choice = Integer.parseInt(st.nextToken());
 *			switch (choice) {
 *			case 1:
 *				input = Integer.parseInt(st.nextToken());
 *				bst.insert(input);
 *				break;
 *				case 2:
 *				input = Integer.parseInt(st.nextToken());
 *				bst.remove(input);
 *				break;
 *			case 3:
 *				input = Integer.parseInt(st.nextToken());
 *				System.out.println(bst.search(input));
 *				break;
 *			default:
 *				bst.printTree();
 *				break;
 *			}
 *		}
 *	}
 */

public class BinarySearchTree {
    private static BinaryTreeNode<Integer> root;
    
     private static BinaryTreeNode<Integer> insertData(int data, BinaryTreeNode<Integer> root) {
		if (root == null) {
			BinaryTreeNode<Integer> newNode = new BinaryTreeNode<Integer>(data);
			return newNode;
		}
		if (root.data >= data) {
			root.left = insertData(data, root.left);
		} else if (root.data < data) {
			root.right = insertData(data, root.right);
		} 
		return root;
	}
    
	public void insert(int data) {
		//Implement the insert() function
        root = insertData(data, root);
        
	}
    
	private BinaryTreeNode<Integer> deleteData(int data, BinaryTreeNode<Integer> root) {
		if (root == null) {
			return null;
		}
		if (data < root.data) {
			root.left = deleteData(data, root.left);
			return root;
		} else if (data > root.data) {
			root.right = deleteData(data, root.right);
			return root;
		} else {
			if (root.left == null && root.right == null) {
				return null;
			} else if (root.left == null) {
				return root.right;
			} else if (root.right == null) {
				return root.left;
			} else {
				BinaryTreeNode<Integer> minNode = root.right;
				while (minNode.left != null) {
					minNode = minNode.left;
				}
				root.data = minNode.data;
				root.right = deleteData(minNode.data, root.right);
				return root;
			}
		}
	}
	public void remove(int data) {
		//Implement the remove() function
        root = deleteData(data, root);
	}
    
    private static void printTreee(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return;
		}
		String toBePrinted = root.data + ":";
		if (root.left != null) {
			toBePrinted += "L:" + root.left.data + ",";
		}
		if (root.right != null) {
			toBePrinted += "R:" + root.right.data;
		}
		System.out.println(toBePrinted);
		printTreee(root.left);
		printTreee(root.right);
	}
	
	
	public void printTree() {
		//Implement the printTree() function
	printTreee(root);
	}
	private boolean searchHelper(int data, BinaryTreeNode<Integer> root) {
		if (root == null) {
			return false;
		}
		if (root.data == data) {
			return true;
		} else if (data > root.data) {
			return searchHelper(data, root.right);
		} else {
			return searchHelper(data, root.left);
		}
	}
	public boolean search(int data) {
		//Implement the search() function
        return searchHelper(data, root);
	}
	

}
