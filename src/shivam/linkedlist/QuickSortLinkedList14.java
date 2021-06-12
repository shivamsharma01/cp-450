package shivam.linkedlist;

import static shivam.linkedlist.UtilLinkedList.createLinkedList;
import static shivam.linkedlist.UtilLinkedList.printLinkedList;

import shivam.linkedlist.UtilLinkedList.Node;

public class QuickSortLinkedList14 {
	public static void main(String[] args) {
		int[] input1 = new int[] { 3, 5, 2, 4, 1 };
		Node list1 = createLinkedList(input1);
		System.out.println("Printing input linked list :");
		printLinkedList(list1);
		System.out.println("Sorting the linkedlist :");
		//list1 = QuickSort(list1);
		System.out.println("Printing sorted linked list :");
		printLinkedList(list1);
	}
//
//	static Node QuickSort(Node head) {
//		int n = length(head);
//		return QuickSort(head, 0, n - 1);
//	}
//
//	static Node QuickSort(Node head, int left, int right) {
//		if (left == right)
//			return head;
//		int mid = left + (right - left) / 2, count = left;
//		Node startFirst = head, cur = head, startSecond = null;
//		while (count++ != mid)
//			cur = cur.next;
//		startSecond = cur.next;
//		cur.next = null;
//		startFirst = mergeSort(startFirst, left, mid);
//		startSecond = mergeSort(startSecond, mid + 1, right);
//		return merge(startFirst, startSecond);
//
//	}
//
//	static int partition(Node head, int low, int high) {
//		int pivot = head.val, index = low;
//		while() {
//			
//		}
//	}

	static int length(Node head) {
		int k = 0;
		while (head != null) {
			head = head.next;
			k++;
		}
		return k;
	}
}
