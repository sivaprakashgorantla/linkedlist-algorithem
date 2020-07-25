package com.gsp.linkedlist.impl;
public class ClientTest {
 
	public static void main(String[] args) {
		
		//Create LinkedList Instance
		LinkedList<Integer> linkedList = new LinkedList<>();
		
		linkedList.insert(new Node<Integer>(1));
		linkedList.insert(new Node<Integer>(2));
		linkedList.insert(new Node<Integer>(3));
		linkedList.insert(new Node<Integer>(4));
		System.out.println("Original LinkedList:::");
		linkedList.displayLinkedList();
		
		System.out.println();
		
		linkedList.reverseLinkedListInPairs();
		
		System.out.println("LinkedList after Reverse in Pairs:::");
		linkedList.displayLinkedList();
		
	}
}