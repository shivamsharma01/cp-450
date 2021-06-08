package shivam.linkedlist;

import static shivam.linkedlist.UtilLinkedList.createLinkedList;
import static shivam.linkedlist.UtilLinkedList.printLinkedList;

import shivam.linkedlist.UtilLinkedList.Node;

public class ReverseKGroups2 {
	public static void main(String[] args) {
		int[] input = new int[] { 1, 2, 3, 4, 5 };
		Node root = createLinkedList(input);
		System.out.println("Printing input linked list:");
		printLinkedList(root);
		int k = 3;
		Node reversed = kGroupReverse(root, k);
		System.out.println("\nPrinting reversed k-group output:");
		printLinkedList(reversed);
	}

	private static Node kGroupReverse(Node root, int k) {
		if (k == 1)
			return root;
		Node cur = root, next = null, mainHead = null, originalLinkedListLocalKGroupHead = null,
				modifiedLinkedPreviousLocalKGroupLast = null;
		int count = 1;
		while (cur != null) {
			if (count == 1)
				originalLinkedListLocalKGroupHead = cur;
			else if (count == k) {
				next = cur.next;
				cur.next = null;
				if (mainHead == null) {
					mainHead = reverse(originalLinkedListLocalKGroupHead);
					System.out.println(mainHead.val);
				} else {
					modifiedLinkedPreviousLocalKGroupLast.next = reverse(originalLinkedListLocalKGroupHead);
				}
				modifiedLinkedPreviousLocalKGroupLast = originalLinkedListLocalKGroupHead;
				count = 1;
				cur = next;
				continue;
			}
			cur = cur.next;
			count++;
		}
		if (count != 1) {
			if (mainHead == null) {
				mainHead = reverse(originalLinkedListLocalKGroupHead);
			} else {
				modifiedLinkedPreviousLocalKGroupLast.next = reverse(originalLinkedListLocalKGroupHead);
			}
		}
		return mainHead;
	}

	private static Node reverse(Node head) {
		if (head == null || head.next == null)
			return head;
		Node rest = reverse(head.next);
		head.next.next = head;
		head.next = null;
		return rest;
	}
}
