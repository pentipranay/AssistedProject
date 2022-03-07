//Write a program to create and perform operations on the doubly linked list.
package assistedProjects;

public class Double_Linkedlist_28 {
		class Node {
			String data;
			Node prev;
			Node next;

			public Node(String data) {
				this.data = data;
			}
		}

		Node head = null;
		Node tail = null;

		public void addNewNode(String data) {

			Node newNode = new Node(data);

			if (head == null) {
				head = newNode;
				tail = newNode;
				head.prev = null;
				tail.next = null;
			} else {

				tail.next = newNode;
				newNode.prev = tail;
				tail = newNode;
				tail.next = null;
			}
		}

		public void showData() {
			Node current = head;
			if (head == null) {
				System.out.println("List is empty");
				return;
			}
			System.out.println("Nodes of doubly linked list: ");
			while (current != null) {
				System.out.print(current.data + "\n");
				current = current.next;
			}
		}

		public static void main(String[] args) {

			Double_Linkedlist_28 obj = new Double_Linkedlist_28();

			obj.addNewNode("Ramu ");
			obj.addNewNode("Suddu");
			obj.addNewNode("Mani");
			obj.addNewNode("Pardhu");
			obj.addNewNode("Remo");
			obj.showData();
		}

}
