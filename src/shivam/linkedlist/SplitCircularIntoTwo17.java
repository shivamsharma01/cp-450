package shivam.linkedlist;

import static shivam.linkedlist.UtilLinkedList.createLinkedList;

import shivam.linkedlist.UtilLinkedList.Node;

public class SplitCircularIntoTwo17 {

	public static void main(String[] args) {

		int[] input1 = new int[] { 37, 58, 56, 54, 56, 47, 13, 10, 2, 3, 8, 51, 20, 24, 47, 1, 7, 53, 17, 12, 9, 28, 10,
				3, 51, 3, 44, 8, 56, 30, 43, 43, 19, 30, 28, 14, 17, 32, 23, 10, 34, 22, 60, 45, 38, 39, 45, 36, 31, 54,
				47, 32, 21, 57, 34, 3, 51, 17, 2, 46, 46, 45, 28, 57, 6, 47, 10, 14, 18, 25, 16, 43, 46, 15, 28, 15, 45,
				4, 51, 8, 49, 37, 39, 9 };
		Node list1 = createLinkedList(input1), prev = null, cur = list1;
		while (cur != null) {
			prev = cur;
			cur = cur.next;
		}
		prev.next = list1;
		circular_LinkedList cl = new circular_LinkedList();
		cl.head = list1;
		splitList(cl);
	}

	static void splitList(circular_LinkedList list) {
		int k = 1;
		list.head1 = list.head;
		Node cur = list.head1.next;
		while (list.head1 != cur) {
			cur = cur.next;
			k++;
		}
		k = (k - 1) / 2;
		cur = list.head1;
		while (k-- != 0)
			cur = cur.next;

		list.head2 = cur.next;
		cur.next = list.head1;
		cur = list.head2;
		while (cur.next != list.head1)
			cur = cur.next;
		cur.next = list.head2;
	}
}
