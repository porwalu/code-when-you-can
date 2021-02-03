package com.porwau.playarea;

public class BinaryTreeTester {

	public static void main(String[] args) {
		BTree t1 = new BTree();
		t1.insert(10);
		t1.insert(20);
		t1.insert(2);
		t1.insert(30);

		t1.insert(17);
		t1.insert(16);
		//t1.insert(20);

		t1.inOrderTraversal();
		System.out.println("");
		System.out.println(t1.get(20));
		System.out.println(t1.getMax());
		System.out.println(t1.getMin());
		System.out.println(t1.delete(2));
		t1.inOrderTraversal();
		System.out.println("");



	}

}
