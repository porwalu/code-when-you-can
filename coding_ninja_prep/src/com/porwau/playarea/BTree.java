package com.porwau.playarea;

public class BTree {

	private BTreeNode root;
	
	public BTreeNode delete(int value) {
	if(root == null) {
		return null;
	}
		return deleteRec(root,value);
	}
	
	
	private BTreeNode deleteRec(BTreeNode node, int value) {

		if(node.getData() == value) {
			System.out.println("Found the node to delete");
			if(node.getLeftchild() == null && node.getRightchild() == null) {
				System.out.println("About to to delete");

				BTreeNode deletedNode = node;
				System.out.println(node);
				node = null;
				System.out.println(deletedNode);

				return deletedNode;
			}
		}else if(value < node.getData()) {				
			if(node.getLeftchild() == null) {
				System.out.println("node not found"); 
				return null;
			}else {
				return deleteRec(node.getLeftchild(),value);
			}
		}
		if(value > node.getData()) {				
			if(node.getRightchild() == null) {
				System.out.println("node not found"); 
				return null;
			}else {
				return deleteRec(node.getRightchild(),value);
			}
		}
		
		return null;
	}


	public BTreeNode get(int value) {
		if(root == null) {
			return null;
		}
		return getRec(root,value);
		//return null;
	}
	public BTreeNode getMax() {
		return  root == null ? null:getMaxRec(root);
	}

	private BTreeNode getMaxRec(BTreeNode node) {
		if(node.getRightchild() == null ) {
			System.out.println("Max node value - " + node.getData());
			return node;
		} 
		return getMaxRec(node.getRightchild());
	}
	
	public BTreeNode getMin() {
		return  root == null ? null:getMinRec(root);
	}

	private BTreeNode getMinRec(BTreeNode node) {
		if(node.getLeftchild() == null ) {
			System.out.println("Min node value - " + node.getData());
			return node;
		} 
		return getMinRec(node.getLeftchild());
	}
	private BTreeNode getRec(BTreeNode node, int value) {
		if(value == node.getData()) {
			return node;
		}else if(value<node.getData()) {
			//Search on LHS
		    if(node.getLeftchild() == null) {
		    	return null;//We dont have it
		    } else {
		    	return getRec(node.getLeftchild(),value);
		    }
		} else if(value > node.getData()) {
			//search on RHS
		    if(node.getRightchild() == null) {
		    	return null;//We dont have it
		    } else {
		    	return getRec(node.getRightchild(),value);
		    }			
		}
	return null;
	}

	void insertRec(BTreeNode tmp, int value) {

		if (value == tmp.getData()) {// nothing to do
			return;
		}

		if (value < tmp.getData()) {// check left
			if (tmp.getLeftchild() == null) {// insert here
				System.out.println("Setting to the left of " + tmp.getData() + " a node with value " + value);
				tmp.setLeftchild(new BTreeNode(value));
				return;
			} else {
				insertRec(tmp.getLeftchild(), value);
			}
		} else {// check right
			if (tmp.getRightchild() == null) {// insert here
				tmp.setRightchild(new BTreeNode(value));
				System.out.println("Setting to the right of " + tmp.getData() + " a node with value " + value);

				return;
			} else {
				insertRec(tmp.getRightchild(), value);
			}
		}
	}

	void insert(int data) {
		if (root == null) {// new tree
			System.out.println("Setting root to " + data);
			root = new BTreeNode(data);
			return;
		}
		insertRec(root, data);
	}
	
	void inOrderTraversal() {
		if(root == null) {
			System.out.println("Tree is empyty");
			return;
		}
		inOrderRec(root);
		
	}

	private void inOrderRec(BTreeNode tmpRoot) {
		if(tmpRoot.getLeftchild() != null) {
			inOrderRec(tmpRoot.getLeftchild());
		}
			System.out.print(tmpRoot.getData()+"->");				
		if(tmpRoot.getRightchild() != null) {
			inOrderRec(tmpRoot.getRightchild());
		}		
	}
}