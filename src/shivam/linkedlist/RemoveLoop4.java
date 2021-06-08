package shivam.linkedlist;

import static shivam.linkedlist.UtilLinkedList.createLinkedList;
import static shivam.linkedlist.UtilLinkedList.printLinkedList;

import shivam.linkedlist.UtilLinkedList.Node;

public class RemoveLoop4 {
	public static void main(String[] args) {
		int[] input = new int[] { 1, 2, 3, 4, 5, 6, 7 };
		Node root = createLinkedList(input);
		System.out.println("Printing input linked list:");
		printLinkedList(root);
		System.out.println("Is Cycle Present : "+DetectLoop3.detectCycle(root));
		System.out.println("Creating a cycle");
		// cycle from 7 to 3
		root.next.next.next.next.next.next.next = root.next.next;
		System.out.println("Is Cycle Present : "+DetectLoop3.detectCycle(root));
		removeLoop(root);
		System.out.println("Is Cycle Present : "+DetectLoop3.detectCycle(root));
		printLinkedList(root);
	}

	public static void removeLoop(Node head){
		Node slow = head, fast = head, ptr1, ptr2;
		while(slow != null && fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				removeLoop(slow, head);
			break;
			}
		}
	}

	private static void removeLoop(Node slow, Node head) {
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
		while(ptr1.next != ptr2)
			ptr1 = ptr1.next;
		ptr1.next = null;
	}
}
