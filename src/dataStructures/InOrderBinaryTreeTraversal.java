package dataStructures;

public class InOrderBinaryTreeTraversal {

	public static class TreeNode1 {
		TreeNode1 left;
		TreeNode1 right;
		int data;

		TreeNode1(int data) {
			this.data = data;
		}
	}

	public static TreeNode1 createBinaryTree() {
		TreeNode1 root = new TreeNode1(40);
		TreeNode1 node20 = new TreeNode1(20);
		TreeNode1 node60 = new TreeNode1(60);
		TreeNode1 node10 = new TreeNode1(10);
		TreeNode1 node30 = new TreeNode1(30);
		TreeNode1 node50 = new TreeNode1(50);
		TreeNode1 node70 = new TreeNode1(70);

		// connect the nodes:
		root.left = node20;
		root.right = node60;

		node20.left = node10;
		node20.right = node30;

		node60.left = node50;
		node60.right = node70;

		return root;
	}

	public void inOrderTraversal(TreeNode1 root, int level) {
		if (root != null) {
			if (level < 4) {
				inOrderTraversal(root.left, level + 1);
				System.out.print(root.data + " ");
				inOrderTraversal(root.right, level + 1);
			}
		}
	}

	public static void main(String[] args) {
		InOrderBinaryTreeTraversal inOrder = new InOrderBinaryTreeTraversal();
		TreeNode1 rootNode = createBinaryTree();
		inOrder.inOrderTraversal(rootNode, 0); // 10 20 30 40 50 60 70
	}

}
