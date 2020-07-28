package com.porwau.lcode.easy;

class Node{
	public Node(int value) {
		this.value = value;
	}
	Node next;
	int value;
	
}
class BinaryLinkedList{
	
	Node head;
	void insert(int value){//just after head
		Node newNode = new Node(value);
		if(head == null) {
			head = newNode;
			head.next = null;
		}else {
			newNode.next = head.next;
			head.next = newNode;
		}
		
	}
	
}

public class BinaryToDecimalViaLinkedlist {


    static int getDecimalValue(Node head) {
        Node currNode = head;
        int decimalNum = 0;
        //int counter = 0;
      while(currNode !=null){
          decimalNum = decimalNum*2+currNode.value;
          currNode = currNode.next;
      }
        return decimalNum;
        
    }
	
	public static void main(String[] args) {
		BinaryLinkedList bll = new BinaryLinkedList();
		bll.insert(1);
		bll.insert(1);
		bll.insert(0);
//ABove will be inserted as 101
		System.out.println("Binary to Decimal value is - "+ getDecimalValue(bll.head));

		

	}

}
