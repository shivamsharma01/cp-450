package shivam.linkedlist;

import static shivam.linkedlist.UtilLinkedList.createLinkedList;
import static shivam.linkedlist.UtilLinkedList.printLinkedList;

import shivam.linkedlist.UtilLinkedList.Node;

public class RemoveDuplicateInSorted6 {

	public static void main(String[] args) {
		int[] input = new int[] { 1, 1, 2, 2, 4, 5, 5, 7, 8, 8 };
		Node root = createLinkedList(input);
		System.out.println("Printing input linked list:");
		printLinkedList(root);
		// cycle from 8 to 2
		System.out.println("Removing duplicates");
		removeDuplicates(root);
		printLinkedList(root);
	}

	static Node removeDuplicates(Node head) {
		Node prev = head, cur = head.next;
		while (cur != null) {
			if (prev.val == cur.val)
				prev.next = cur.next;
			else
				prev = cur;
			cur = cur.next;
		}
		return head;
	}

}
