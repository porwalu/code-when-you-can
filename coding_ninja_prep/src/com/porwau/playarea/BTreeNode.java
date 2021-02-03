package com.porwau.playarea;

public class BTreeNode {

	private int data;
	private BTreeNode leftchild;
	private BTreeNode rightchild;

	public BTreeNode(int data) {
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public BTreeNode getLeftchild() {
		return leftchild;
	}

	public void setLeftchild(BTreeNode leftchild) {
		this.leftchild = leftchild;
	}

	public BTreeNode getRightchild() {
		return rightchild;
	}

	public void setRightchild(BTreeNode rightchild) {
		this.rightchild = rightchild;
	}

	@Override
	public String toString() {
		return "Data = " + data;
	}
}
