package com.porwau.lcode.medium;

import com.porwau.datastructures.SLinkedList;
import com.porwau.datastructures.Node;

/**
 * lcode - 2. Add Two Numbers
 * @author Utkarsh
 *
 */
public class SumViaLinkedList {

	public static void main(String[] args) {
		SLinkedList sll2 = new SLinkedList();
		SLinkedList sll3 = new SLinkedList();
		sll2.add(7);
		sll2.add(3);
		// sll2.add(9);
		sll2.printList();
		sll3.add(2);
		// sll3.add(3);
		sll3.add(9);
		sll3.printList();

		Node n1 = sll2.getHead().getNext();
		Node n2 = sll3.getHead().getNext();
		Node n3 = new Node();
		Node orign3 = n3;
		int q1 = 0;
		while (n1 != null && n2 != null) {// This will by itself handle case of same length LinkedLists
			int sum = n1.getData() + n2.getData() + q1;
			int rem = 0;
			int quotient = 0;
			if (sum >= 10) {
				rem = sum % 10;
				quotient = sum / 10;
			} else {
				rem = sum;
			}
			n3.setNext(new Node(rem));
			n1 = n1.getNext();
			n2 = n2.getNext();
			n3 = n3.getNext();
			q1 = quotient;
		}
		if (q1 != 0 && n1 != null && n2 != null) {
			n3.setNext(new Node(q1));
		}
		if (n1 == null) {// case 3 where n2 is not null. continue stuff of n2 into n3
			while (n2 != null) {
				if (q1 + n2.getData() >= 10) {
					n3.setNext(new Node((q1 + n2.getData()) % 10));
				} else {
					n3.setNext(new Node(q1 + n2.getData()));
				}
				q1 = (q1 + n2.getData()) / 10;
				n2 = n2.getNext();
				n3 = n3.getNext();
			}
		}
		if (n2 == null) {// case 1 where n1 is not null
			while (n1 != null) {
				if (q1 + n1.getData() >= 10) {
					n3.setNext(new Node((q1 + n1.getData()) % 10));
					q1 = (q1 + n1.getData()) / 10;
				} else {
					n3.setNext(new Node(q1 + n1.getData()));
				}
				n1 = n1.getNext();
				n3 = n3.getNext();
			}
		}
		if (q1 != 0) {
			n3.setNext(new Node(q1));
		}
		while (orign3 != null) {
			System.out.print("[" + orign3.getData() + "]");
			orign3 = orign3.getNext();
		}
	}
}
