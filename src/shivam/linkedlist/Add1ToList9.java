package shivam.linkedlist;

import static shivam.linkedlist.UtilLinkedList.createLinkedList;
import static shivam.linkedlist.UtilLinkedList.printLinkedList;

import shivam.linkedlist.UtilLinkedList.Node;

public class Add1ToList9 {
	public static void main(String[] args) {
		int[] input = new int[] { 9, 9, 9 };
		Node root = createLinkedList(input);
		System.out.println("Printing input linked list:");
		printLinkedList(root);
		root = lastToFront(root);
		System.out.println("Printing input linked list after adding 1:");
		printLinkedList(root);
	}

	static Node lastToFront(Node head) {
		int carry = lastToFrontRec(head);
		if (carry == 0)
			return head;
		Node newHead = new Node(carry);
		newHead.next = head;
		return newHead;
	}
	static int lastToFrontRec(Node head) {
		if (head == null)
			return 1;
		head.val += lastToFrontRec(head.next);
		int carry = head.val / 10;
		// System.out.println("carry = "+carry);
		head.val = head.val % 10;
		return carry;
	}
}
