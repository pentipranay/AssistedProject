//Write a program to create and perform operations on the circular linked list.
package assistedProjects;

public class Circular_Linkedlist_27 {
public class Node {
			int data;
			Node next;

			public Node(int data) {
				this.data = data;
			}
		}

		public Node head = null;
		public Node tail = null;

		public void add(int data) {
			Node newNode = new Node(data);
			if (head == null) {
				head = newNode;
				tail = newNode;
				newNode.next = head;
			} else {
				tail.next = newNode;
				tail = newNode;
				tail.next = head;
			}
		}

		public void display() {
			Node current = head;
			if (head == null) {
				System.out.println(" Given that list is empty");
			} else {
				System.out.println(" The number of nodes of the circular linked list are: ");
				do {
					System.out.print(" " + current.data);
					current = current.next;
				} while (current != head);
				System.out.println();
			}
		}

		public static void main(String[] args) {
			Circular_Linkedlist_27 cl = new Circular_Linkedlist_27();
			cl.add(1);
			cl.add(4);
			cl.add(3);
			cl.add(2);
			cl.display();
		}
}
