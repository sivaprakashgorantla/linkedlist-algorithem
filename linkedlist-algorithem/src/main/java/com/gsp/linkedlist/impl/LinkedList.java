package com.gsp.linkedlist.impl;

public class LinkedList<T> {

	// head always point to first node
	private Node<T> head;
	

	/**
	 * Method to insert Node in Linked List
	 * 
	 * @param newNode insert to List
	 */
	public void insert(Node<T> newNode) {
		if(isEmpty()) {
			head = newNode;
		}else {
			Node<T> current = head;
			while(current.next!=null) {
				current.next = newNode;
			}
		}
	}

	private boolean isEmpty() {
		// TODO Auto-generated method stub
		
		return head==null;
	}
	
	/**
	 * Method which traverse Linked List and display all data.
	 */
	
	public void displayLinkedList() {
		Node<T> currentNode = head;
		while(currentNode !=null) {
			System.out.println(currentNode.date + "");
			currentNode = currentNode.next;
		}
	}
	
	/**
	 * This Method Reverse Singly LinkedList in Pairs
	 * @param head of LinkedList
	 * @return
	 */
	
	public void reverseLinkedListInPairs() {
		Node<T> tempNode = head;
		while(tempNode != null && tempNode.next !=null) {
			T k =tempNode.date;
			tempNode.date = tempNode.next.date;
			tempNode.next.date = k ;
			
			tempNode = tempNode.next.next;
		}
	}
}
