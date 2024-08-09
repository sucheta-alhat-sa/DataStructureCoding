package dataStructures;

public class PostOrderTraversal {
	
	public static class TreeNode{
		TreeNode left;
		TreeNode right;
		int data;
		TreeNode(int data) {
			this.data = data;
		}
	}
	
	public static TreeNode createBinaryTree() {
		TreeNode root = new TreeNode(40);
		TreeNode node20 = new TreeNode(20);
		TreeNode node60 = new TreeNode(60);
		TreeNode node10 = new TreeNode(10);
		TreeNode node30 = new TreeNode(30);
		TreeNode node50 = new TreeNode(50);
		TreeNode node70 = new TreeNode(70);
		
		root.left = node20;
		root.right = node60;
		
		node20.left = node10;
		node20.right = node30;
		
		node60.left = node50;
		node60.right = node70;
		
		return root;
	}
	
	public void postOrderTraversal(TreeNode root) { //entire tree is given to the method
		if(root != null) {
			postOrderTraversal(root.left);  //here the entire left side tree i.e (20, 10,30) subtree will be given, then it will move to the left node i.e 10
			postOrderTraversal(root.right); //as after 10 we do not have any right node
			System.out.print(root.data + " "); //left node data will be printed
		}
	}

	public static void main(String[] args) {
		PostOrderTraversal pt = new PostOrderTraversal();
		TreeNode rootNode = createBinaryTree();
		pt.postOrderTraversal(rootNode); // 10 30 20 50 70 60 40 

	}

}
