package shivam.linkedlist;

import static shivam.linkedlist.UtilLinkedList.createLinkedList;
import static shivam.linkedlist.UtilLinkedList.printLinkedList;

import shivam.linkedlist.UtilLinkedList.Node;

public class MoveLastToFront8 {
	public static void main(String[] args) {
		int[] input = new int[] { 5, 1, 2, 2, 4, 5, 7, 8, 8, 1 };
		Node root = createLinkedList(input);
		System.out.println("Printing input linked list:");
		printLinkedList(root);
		root = lastToFront(root);
		printLinkedList(root);
	}

	static Node lastToFront(Node head) {
		Node prev = null, cur = head;
		while (cur.next != null) {
			prev = cur;
			cur = cur.next;
		}
		prev.next = null;
		cur.next = head;
		return cur;
	}
}
