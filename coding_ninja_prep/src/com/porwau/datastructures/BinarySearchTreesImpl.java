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
		 * this is traverse method of the node. Inorder means doing the left side, then
		 * node and then right When done on BST - it gives ascending list
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

		/**
		 * @param value to search
		 * @return TreeNode containing the value else null, if not found
		 */
		public TreeNode get(int value) {
			if (value == data) {
				System.out.println(value + " found.");

				return this;
			} else {
				if (value < data) {
					if (left != null) {
						return left.get(value);
					} else {
						System.out.println("Value " + value + " doesn't exist.");
						return null;
					}
				} else {
					if (right != null) {
						return right.get(value);
					} else {
						System.out.println("Value " + value + " doesn't exist.");
						return null;
					}
				}
			}
		}

		/**
		 * @return TreeNode containing the max value in the tree.
		 */
		public TreeNode getMax() {// check on right side
			if (right != null) {
				return right.getMax();
			} else {
				return this;
			}
		}

		/**
		 * @return TreeNode containing the min value in the tree.
		 */
		public TreeNode getMin() {// check on left side.
			if (left != null) {
				return left.getMin();
			} else {
				return this;
			}
		}

		public String toString() {
			return Integer.toString(this.getData());
		}

		// Delete cases
		// 1. node is a leaf
		// 2. node has 1 child
		// 3. node has 2 children
		public boolean delete(int value) {
			if (value > data) {// check on RHS
				right.delete(value);
			} else if (value < data) {// check on LHS
				left.delete(value);
			} else {
				if (left == null && right == null) {

				}
			}
			return false;
		}
	}

	/**
	 * this is invoked on the tree but calls the traverseInOrder of the node.
	 */
	public void traverseInOrder() {
		if (root != null) {
			root.traverseInOrder();// method is called on the node.
		} else {
			System.out.println("Empty Tree!! Can't traverse.");
		}
	}

	public TreeNode get(int value) {
		if (root == null) {
			System.out.println("Empty Tree!! Can't get " + value);
			return null;
		} else {
			return root.get(value);
		}
	}

	public TreeNode getMax() {
		if (root == null) {
			System.out.println("Empty tree!! Max value can't be obtained.");
			return null;
		} else {
			return root.getMax();
		}
	}

	public TreeNode getMin() {
		if (root == null) {
			System.out.println("Empty tree!! Min value can't be obtained.");
			return null;
		} else {
			return root.getMin();
		}
	}

	public boolean delete(int value) {
		TreeNode currNode = root;
		TreeNode parentNode = null;
		while (currNode != null) {
			if (value > currNode.getData()) {
				parentNode = currNode;
				currNode = currNode.getRight();

			} else if (value < currNode.getData()) {// go left
				parentNode = currNode;
				currNode = currNode.getLeft();
			} else {// we found match to delete.
					// 1. node with no right child
				if(currNode.getRight() == null) {
					if(parentNode == null) {//currNode is root.
						this.root = currNode.getLeft();	
					}else {
						parentNode.left = currNode.getLeft();
					}
				}
					// 2. node with 2 children
					// 3. Leaf node.

				System.out.println("Delete me " + currNode.getData());
				currNode = null;
				return true;
			}

		}
		// not found if not returned yet.
		System.out.println("Node not found");

		return false;
	}

	/**
	 * @param value - value to lookup in Binary Search tree
	 * @return - true if lookup works else false
	 */
	public boolean lookup(int value) {
		TreeNode currNode = root;
		while (currNode != null) {
			if (currNode.getData() < value) {
				currNode = currNode.getRight();
			} else if (currNode.getData() > value) {
				currNode = currNode.getRight();
			} else {
				return true;
			}
		}
		return false;
	}

	public TreeNode getMinAlt() {
		TreeNode currNode = root;
		while (currNode != null) {
			if (currNode.getLeft() != null) {
				currNode = currNode.getLeft();
			} else {
				return currNode;
			}
		}
		return null;
	}

	public TreeNode getMaxAlt() {
		TreeNode currNode = root;
		while (currNode.getRight() != null) {
			currNode = currNode.getRight();
		}
		return currNode;
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
		System.out.println();
		bst.get(9);
		System.out.println("Max value is " + bst.getMax());
		System.out.println("Min value is " + bst.getMin());
		System.out.println("Min value via alt is " + bst.getMinAlt());
		System.out.println("Max value via alt is " + bst.getMaxAlt());

		int lookupValue = 100;
		System.out.println("BST Lookup of " + lookupValue + " is "
				+ (bst.lookup(lookupValue) == true ? "successful" : "not successful"));
		bst.delete(6);
		bst.traverseInOrder();

	}
}
