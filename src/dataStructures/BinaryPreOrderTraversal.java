package dataStructures;

public class BinaryPreOrderTraversal {

	//create the class TreeNode -->used to create the treenode
	public static class TreeNode {
		TreeNode left;
		TreeNode right;
		int data;

		TreeNode(int data) {
			this.data = data;
		}
	}

	public  static TreeNode createBinaryTree() {
		// create the nodes
		TreeNode rootNode = new TreeNode(40);
		
		TreeNode Node20 = new TreeNode(20);
		TreeNode Node60 = new TreeNode(60);
		TreeNode Node50 = new TreeNode(50);
		TreeNode Node30 = new TreeNode(30);
		TreeNode Node70 = new TreeNode(70);
		TreeNode Node10 = new TreeNode(10);
		TreeNode Node5 = new TreeNode(5);

		// attach the nodes
		rootNode.left = Node20;
		rootNode.right = Node60;

		Node20.left = Node10;
		Node20.right = Node30;
		
		Node10.left = Node5;

		Node60.left = Node50;
		Node60.right = Node70;

		return rootNode;

	}
	
	public void binaryTreeTraversal(TreeNode root) {
		if(root != null) {
			System.out.println(root.data);
		 
		binaryTreeTraversal(root.left);
		binaryTreeTraversal(root.right);
		}
		
		
	}

	public static void main(String[] args) {
		BinaryPreOrderTraversal bt = new BinaryPreOrderTraversal();
		TreeNode rootNode = createBinaryTree();
		bt.binaryTreeTraversal(rootNode);

	}

}
