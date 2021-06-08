package shivam.linkedlist;

import static shivam.linkedlist.UtilLinkedList.createLinkedList;
import static shivam.linkedlist.UtilLinkedList.printLinkedList;

import shivam.linkedlist.UtilLinkedList.Node;

public class AddTwoNumbers10 {
	public static void main(String[] args) {
		int[] input1 = new int[] { 5, 1, 9, 9 }, input2 = new int[] { 2, 1, 2 };
		Node list1 = createLinkedList(input1), list2 = createLinkedList(input2), addedList;
		System.out.println("Printing input linked list 1 :");
		printLinkedList(list1);
		System.out.println("Printing input linked list 2 :");
		printLinkedList(list2);
		addedList = addTwoLists(list1, list2);
		printLinkedList(addedList);
	}

	static Node addTwoLists(Node first, Node second) {
		first = Reverse1.iterativeReverse(first);
		second = Reverse1.iterativeReverse(second);
		Node head = new Node(0), newNode = head;

		int sum = 0, carry = 0;
		while (first != null && second != null) {
			sum = first.val + second.val + carry;
			carry = sum / 10;
			newNode.val = sum % 10;
			first = first.next;
			second = second.next;
			if (first != null || second != null) {
				newNode.next = new Node(0);
			    newNode = newNode.next;
			}
		}
		if (newNode != null) {
			while (first != null) {
				sum = first.val + carry;
				carry = sum / 10;
				newNode.val = sum % 10;
				first = first.next;
				if (first != null) {
					newNode.next = new Node(0);
				    newNode = newNode.next;
				}
			}
			while (second != null) {
				sum = second.val + carry;
				carry = sum / 10;
				newNode.val = sum % 10;
				second = second.next;
				if (second != null) {
					newNode.next = new Node(0);
				    newNode = newNode.next;
				}
			}
		}
		if (carry != 0) {
		    newNode.next = new Node(carry);
		}
		return Reverse1.iterativeReverse(head);
	}

}
