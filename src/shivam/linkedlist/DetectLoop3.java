package shivam.linkedlist;

import static shivam.linkedlist.UtilLinkedList.createLinkedList;
import static shivam.linkedlist.UtilLinkedList.printLinkedList;

import shivam.linkedlist.UtilLinkedList.Node;

public class DetectLoop3 {
	public static void main(String[] args) {
		int[] input = new int[] { 1, 2, 3, 4, 5 };
		Node root = createLinkedList(input);
		System.out.println("Printing input linked list:");
		printLinkedList(root);
		System.out.println("Is Cycle Present : "+detectCycle(root));
		System.out.println("Creating a cycle");
		// cycle from 5 to 3
		root.next.next.next.next.next = root.next.next;
		System.out.println("Is Cycle Present : "+detectCycle(root));
	}

	public static boolean detectCycle(Node root) {
		Node slow = root, fast = root;
		while(slow != null && fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast)
				return true;
		}
		return false;
	}
}
