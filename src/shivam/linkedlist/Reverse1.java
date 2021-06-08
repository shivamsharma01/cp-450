package shivam.linkedlist;
import static shivam.linkedlist.UtilLinkedList.createLinkedList;
import static shivam.linkedlist.UtilLinkedList.printLinkedList;

import shivam.linkedlist.UtilLinkedList.Node;

public class Reverse1 {
	public static void main(String[] args) {
		int[] input = new int[] {1,2,3,4};
		Node root = createLinkedList(input);
		System.out.println("Printing input linked list:");
		printLinkedList(root);
		Node reversed = iterativeReverse(root);
		System.out.println("\nPrinting iterative output:");
		printLinkedList(reversed);
		reversed = recursiveReverse(createLinkedList(input));
		System.out.println("\nPrinting recursive output:");
		printLinkedList(reversed);
	}
	
	public static Node iterativeReverse(Node root) {
		Node cur = root, prev = null, next = null;
		while(cur != null) {
			next = cur.next;
			cur.next = prev;
			prev = cur;
			cur = next;
		}
		return prev;
	}
	
	private static Node recursiveReverse(Node head) {
		if (head == null || head.next == null)
			return head;
		Node rest = recursiveReverse(head.next);
		head.next.next = head;
		head.next = null;
		return rest;
	}

}
