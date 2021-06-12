package shivam.linkedlist;

import static shivam.linkedlist.UtilLinkedList.createLinkedList;
import static shivam.linkedlist.UtilLinkedList.printLinkedList;

import shivam.linkedlist.UtilLinkedList.Node;

public class MergeSortLinkedList13 {
	public static void main(String[] args) {
		int[] input1 = new int[] { 3, 5, 2, 4, 1 };
		Node list1 = createLinkedList(input1);
		System.out.println("Printing input linked list :");
		printLinkedList(list1);
		System.out.println("Sorting the linkedlist :");
		list1 = mergeSort(list1);
		System.out.println("Printing sorted linked list :");
		printLinkedList(list1);
	}

	static Node mergeSort(Node head) {
		int n = length(head);
		return mergeSort(head, 0, n - 1);
	}

	static Node mergeSort(Node head, int left, int right) {
		if (left == right)
			return head;
		int mid = left + (right - left) / 2, count = left;
		Node startFirst = head, cur = head, startSecond = null;
		while (count++ != mid)
			cur = cur.next;
		startSecond = cur.next;
		cur.next = null;
		startFirst = mergeSort(startFirst, left, mid);
		startSecond = mergeSort(startSecond, mid + 1, right);
		return merge(startFirst, startSecond);

	}

	static Node merge(Node head1, Node head2) {
		Node resultHead, resultCur;
		if (head1.val <= head2.val) {
			resultHead = head1;
			head1 = head1.next;
			resultHead.next = null;
		} else {
			resultHead = head2;
			head2 = head2.next;
			resultHead.next = null;
		}
		resultCur = resultHead;
		while (head1 != null && head2 != null) {
			if (head1.val <= head2.val) {
				resultCur.next = head1;
				head1 = head1.next;
				resultCur = resultCur.next;
				resultCur.next = null;
			} else {
				resultCur.next = head2;
				head2 = head2.next;
				resultCur = resultCur.next;
				resultCur.next = null;
			}
		}
		if (head1 != null)
			resultCur.next = head1;
		else
			resultCur.next = head2;
		return resultHead;
	}

	static int length(Node head) {
		int k = 0;
		while (head != null) {
			head = head.next;
			k++;
		}
		return k;
	}
}
