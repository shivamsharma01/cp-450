package shivam.linkedlist;

import static shivam.linkedlist.UtilLinkedList.createLinkedList;
import static shivam.linkedlist.UtilLinkedList.printLinkedList;

import shivam.linkedlist.UtilLinkedList.Node;

public class IntersectionLinkedList11 {
	public static void main(String[] args) {
		int[] input1 = new int[] { 1, 2, 4, 9 }, input2 = new int[] { 2, 3, 9 };
		Node list1 = createLinkedList(input1), list2 = createLinkedList(input2), intersection;
		System.out.println("Printing input linked list 1 :");
		printLinkedList(list1);
		System.out.println("Printing input linked list 2 :");
		printLinkedList(list2);
		intersection = getIntersection(list1, list2);
		System.out.println("Printing the intersection :");
		printLinkedList(intersection);
	}

	private static Node getIntersection(Node list1, Node list2) {
		Node newHead = null, newCur = null;
		while(list1 != null && list2 != null) {
			if (list1.val == list2.val) {
				if (newHead == null) {
					newHead = new Node(list1.val);
					newCur = newHead;
				} else {
					newCur.next = new Node(list1.val);
					newCur = newCur.next;
				}
				list1 = list1.next;
				list2 = list2.next;
			} else if (list1.val < list2.val) {
				list1 = list1.next;
			} else {
				list2 = list2.next;
			}
		}
		return newHead;
	}
}
