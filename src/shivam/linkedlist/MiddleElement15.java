package shivam.linkedlist;

import static shivam.linkedlist.UtilLinkedList.createLinkedList;
import static shivam.linkedlist.UtilLinkedList.printLinkedList;

import shivam.linkedlist.UtilLinkedList.Node;

public class MiddleElement15 {
	public static void main(String[] args) {
		int[] input1 = new int[] { 1, 2, 3, 4, 5, 6 };
		Node list1 = createLinkedList(input1);
		System.out.println("Printing input linked list :");
		printLinkedList(list1);
		System.out.println("Finding the middle element");
		list1 = middleElement(list1);
		System.out.println("Printing middle element :");
		System.out.println(list1.val);
	}

	private static Node middleElement(Node list1) {
		Node slow = list1, fast = list1;
		while (slow.next != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next;
			if (fast.next != null)
				fast = fast.next;
		}
		return slow;
	}
}
