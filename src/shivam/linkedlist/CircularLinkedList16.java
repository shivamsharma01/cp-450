package shivam.linkedlist;

import static shivam.linkedlist.UtilLinkedList.createLinkedList;

import shivam.linkedlist.UtilLinkedList.Node;

public class CircularLinkedList16 {
	public static void main(String[] args) {
		int[] input1 = new int[] { 1, 2, 3, 4, 5, 6 };
		Node list1 = createLinkedList(input1), firstNode = list1;
		list1 = Reverse1.iterativeReverse(list1);
		firstNode.next = list1;
		System.out.println("isCycle: " + isCircular(list1));
	}

	static boolean isCircular(Node head) {
		Node slow = head, fast = head;
		while(slow != null && fast != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast)
				return true;
		}
		return false;
	}
}
