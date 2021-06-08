package shivam.linkedlist;

import static shivam.linkedlist.UtilLinkedList.createLinkedList;
import static shivam.linkedlist.UtilLinkedList.printLinkedList;

import shivam.linkedlist.UtilLinkedList.Node;

public class RemoveDuplicateInUnsorted7 {
	public static void main(String[] args) {
		int[] input = new int[] { 5, 1, 2, 2, 4, 5, 7, 8, 8, 1 };
		Node root = createLinkedList(input);
		System.out.println("Printing input linked list:");
		printLinkedList(root);
		// cycle from 8 to 2
		System.out.println("Removing duplicates");
		removeDuplicates(root);
		printLinkedList(root);
	}

	static Node removeDuplicates(Node head) {
		boolean[] arr = new boolean[10000 + 1];
		Node prev = null, cur = head;
		while (cur != null) {
			if (arr[cur.val])
				prev.next = cur.next;
			else {
				prev = cur;
				arr[cur.val] = true;
			}
			cur = cur.next;
		}
		return head;
	}
}
