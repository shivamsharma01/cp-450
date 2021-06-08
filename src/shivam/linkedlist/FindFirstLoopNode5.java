package shivam.linkedlist;

import static shivam.linkedlist.UtilLinkedList.createLinkedList;
import static shivam.linkedlist.UtilLinkedList.printLinkedList;

import shivam.linkedlist.UtilLinkedList.Node;

public class FindFirstLoopNode5 {
	public static void main(String[] args) {
		int[] input = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };
		Node root = createLinkedList(input);
		System.out.println("Printing input linked list:");
		printLinkedList(root);
		System.out.println("Is Cycle Present : "+DetectLoop3.detectCycle(root));
		System.out.println("Creating a cycle");
		// cycle from 8 to 2
		root.next.next.next.next.next.next.next.next = root.next;
		Node loopFirst = removeLoop(root);
		if (loopFirst == null)
			System.out.println("No Cycle");
		else
			System.out.println(loopFirst.val);
	}

	public static Node removeLoop(Node head){
		Node slow = head, fast = head;
		while(slow != null && fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				return removeLoop(slow, head);
			}
		}
		return null;
	}

	private static Node removeLoop(Node slow, Node head) {
		int k = 1;
		Node ptr1 = slow, ptr2;
		while(ptr1.next != slow) {
			ptr1 = ptr1.next;
			k++;
		}
		ptr1 = head;
		while(k-- != 0)
			ptr1 = ptr1.next;
		ptr2 = head;
		while(ptr1 != ptr2) {
			ptr1 = ptr1.next;
			ptr2 = ptr2.next;
		}
		return ptr1;
	}
}
