package com.porwau.datastructures;

/**
 * Structure of TreeNode - data and left and right nodes. Structure of Tree -
 * only root node. We are going for Binary Search Tree as they are most used
 * binary trees Left node gets data which is less than parent and right node is
 * larger than parent Binary search tree has no duplicates
 * 
 * @author Utkarsh Porwal
 *
 */
class BinarySearchTree {

	private TreeNode root;// root node of tree

	public void insert(int value) {
		// if just after root else anywhere.
		TreeNode newNode = new TreeNode(value);
		if (root == null) {// this is the first node
			System.out.println("creating root node with value-  " + value);
			root = newNode;
			return;
		} else {
			System.out.println("Calling insert on TreeNode class for value - " + value);
			root.insert(value);
		}
	}

	class TreeNode {
		public TreeNode(int data) {
			this.data = data;
		}

		/**
		 * insert the value in the binary search tree.
		 * 
		 * @param value to insert.
		 * 
		 */
		public void insert(int value) {
			if (value == data) {
				return;
			} else {
				if (value > data) {// go right
					if (this.getRight() == null) {// insert this.
						right = new TreeNode(value);
					} else {
						right.insert(value);
					}
				} else {// go left
					if (this.getLeft() == null) {// insert this.
						left = new TreeNode(value);
					} else {
						left.insert(value);
					}
				}
			}

		}

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

		/**
		 * this is traverse method of the node.
		 * Inorder means doing the left side, then node
		 * and then right
		 * When done on BST - it gives ascending list
		 */
		public void traverseInOrder() {
			if (left != null) {
				left.traverseInOrder();
			}
			System.out.print(data + " ,");
			if (right != null) {
				right.traverseInOrder();
			}
		}
		
		public TreeNode get(int value) {
			if(value == data) {
				System.out.println();
				System.out.println(value +" found.");

				return this;
			} else {
				if(value < data) {
					return left.get(value);
				}else {
					return right.get(value);
				}
				
			}
//			System.out.println("Value " + value + " doesn't exist.");
//			return null;
		}

	}

	/**
	 * this is invoked on the tree but calls the traverseInOrder of the node.
	 */
	public void traverseInOrder() {
		if (root != null) {
			root.traverseInOrder();// method is called on the node.
		}
	}

	public TreeNode get(int value) {
		if(root.getData() == value) {
			return root;
		}else {
			return root.get(value);
		}
	}
}

public class BinarySearchTreesImpl {

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(9);
		bst.insert(4);
		bst.insert(20);
		bst.insert(1);
		bst.insert(6);
		bst.insert(15);
		bst.insert(170);
		bst.traverseInOrder();
		bst.get(100);
	}

}