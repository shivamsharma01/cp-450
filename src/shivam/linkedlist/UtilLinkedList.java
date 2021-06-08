package shivam.linkedlist;

public class UtilLinkedList {

	static class Node {
		int val;
		Node next;
		Node (int v) {
			this.val = v;
		}
	}

	public static void printLinkedList(Node root) {
		while (root.next != null) {
			System.out.print(root.val + " --> ");
			root = root.next;
		}
		System.out.print(root.val + "\n");
	}

	public static Node createLinkedList(int[] arr) {
		Node root = new Node(arr[0]), cur = root;
		for (int i=1; i< arr.length; i++) {
			cur.next = new Node(arr[i]);
			cur = cur.next;
		}
		return root;
	}
}
