package com.porwau.lcode.medium;

import com.porwau.datastructures.SLinkedList;
import com.porwau.datastructures.Node;

public class SumViaLinkedList {
	
	public static void main(String[] args) {
		SLinkedList sll2 = new SLinkedList();
		SLinkedList sll3 = new SLinkedList();
		sll2.add(3);
		sll2.add(4);
		sll2.add(2);
		sll2.printList();

		sll3.add(4);
		sll3.add(6);
		sll3.add(5);
		sll3.printList();

		Node n1 = sll2.getHead().getNext();
		Node n2 = sll3.getHead().getNext();
		Node n3 = new Node();
		Node orign3 = n3;
		int q1 = 0;
		while (n1 != null && n2 != null) {//This will by itsef handle case of same length LinkedLists
			int sum = n1.getData() + n2.getData();
			int rem = 0;
			int quotient = 0;
			if (sum >= 10) {
				rem = sum % 10;
				quotient = sum / 10;
			} else {
				rem = sum;
			}
			n3.setNext(new Node(rem + q1));
			n1 = n1.getNext();
			n2 = n2.getNext();
			n3=n3.getNext();
			q1 = quotient;			
		}
		

		while (orign3 != null) {
			System.out.print("[" + orign3.getData() + "]");
			orign3 = orign3.getNext();
		}

	}

}
