package com.porwau.prep;

class TreeNode {

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

	public TreeNode() {
		super();
	}

	public TreeNode(int data) {
		this.data = data;
	}
}

class BTree {
	TreeNode root;

	void add(int data) {
		if (root == null) {
			root = new TreeNode(data);
			return;
		}
		addRec(root, data);
	}

	private void addRec(TreeNode root, int data) {
		if(data == root.getData()) return;
		if (data < root.getData()) {
			if (root.getLeft() == null) {
				root.setLeft(new TreeNode(data));
				return;
			} else {
				addRec(root.getLeft(), data);
			}
		}

		if (data > root.getData()) {
			if (root.getRight() == null) {
				root.setRight(new TreeNode(data));
				return;
			} else {
				addRec(root.getRight(), data);
			}
		}
	}

	void traverse() {
		if (root == null) {
			System.out.println("Empty Tree");
			return;
		}
		traverseRec(root);
		System.out.print("null");
	}

	private void traverseRec(TreeNode root) {
		// Left
		if(root.getLeft() != null) {
			traverseRec(root.getLeft());
		}
		System.out.print(root.getData() + "->");
		if(root.getRight() != null) {
			traverseRec(root.getRight());
		}
	}
}

public class BTreeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BTree bt = new BTree();
		bt.traverse();
		bt.add(10);
		bt.add(2);
		bt.add(15);
		bt.add(5);
		bt.add(7);
		bt.traverse();

	}

}
