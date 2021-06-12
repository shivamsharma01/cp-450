package shivam.linkedlist;

import static shivam.linkedlist.UtilLinkedList.createLinkedList;
import static shivam.linkedlist.UtilLinkedList.printLinkedList;

import shivam.linkedlist.UtilLinkedList.Node;

public class IntersectionPoint12 {
	public static void main(String[] args) {
		int[] input1 = new int[] { 1, 2, 4, 9 }, input2 = new int[] { 1, 2, 5, 2, 6 },
				common = new int[] { 1, 2, 3, 4 };
		Node list1 = createLinkedList(input1), list2 = createLinkedList(input2),
				intersectionPointList = createLinkedList(common), tempNode, tempList;
		tempList = tempNode = Reverse1.iterativeReverse(list1);
		Reverse1.iterativeReverse(tempList);
		tempNode.next = intersectionPointList;
		tempList = tempNode = Reverse1.iterativeReverse(list2);
		Reverse1.iterativeReverse(tempList);
		tempNode.next = intersectionPointList;
		System.out.println("Printing input linked list 1 :");
		printLinkedList(list1);
		System.out.println("Printing input linked list 2 :");
		printLinkedList(list2);
		System.out.println(intersectPoint(list1, list2));
	}

	static int intersectPoint(Node head1, Node head2) {
		int k1 = 0, k2 = 0;
		Node list1 = head1, list2 = head2;
		while (list1 != null) {
			k1++;
			list1 = list1.next;
		}
		while (list2 != null) {
			k2++;
			list2 = list2.next;
		}
		list1 = head1;
		list2 = head2;
		if (k1 > k2) {
			while (k1-- != k2)
				list1 = list1.next;
		} else if (k1 < k2) {
			while (k1 != k2--)
				list2 = list2.next;
		}
		while (list1 != list2) {
			list1 = list1.next;
			list2 = list2.next;
		}
		return list1.val;
	}

}
