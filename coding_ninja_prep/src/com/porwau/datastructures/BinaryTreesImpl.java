package com.porwau.datastructures;



/**
 * Structure of TreeNode - data and left and right nodes.
 * Structure of Tree - only root node.
 * @author Utkarsh Porwal
 *
 */
class BinaryTree {
	
	TreeNode root;
	
	class TreeNode{
		private int data;
		private TreeNode left;
		private TreeNode right;

		public int getData() {
			return data;
		}
		public void setData(int data) {
			this.data = data;
		}
		public TreeNode getLeft() {
			return left;
		}
		public void setLeft(TreeNode left) {
			this.left = left;
		}
		public TreeNode getRight() {
			return right;
		}
		public void setRight(TreeNode right) {
			this.right = right;
		}

		
	}
}
public class BinaryTreesImpl {

	public static void main(String[] args) {

	}

}
