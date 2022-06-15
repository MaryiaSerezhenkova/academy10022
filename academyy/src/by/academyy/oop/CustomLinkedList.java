package by.academyy.oop;

public class CustomLinkedList<T> {

	private Node head;
	private int size = 0;

	public T get(int index) {
		Node current = head;
		int counter = 0;
		while (current != null) {
			if (counter == index) {
				return current.value;
			}
			current = current.next;
			counter++;
		}
		return null;
	}

	public T remove(int index) {
		return null;
	}

	public void add(int index, T value) {
		if (index < 0 || index > size + 1) {
			throw new IndexOutOfBoundsException();
		}
		if (head == null) {
			head = new Node(null, null, value);
			return;
		}
		Node current = head;
		int counter = 0;
		do {
			if (counter == index) {
				Node newNode = new Node(current.prev, current, value);
				Node next = current.next;
				if (next != null) {
					next.prev = newNode;
				}
				Node prev = current.prev;
				if (prev != null) {
					prev.next = newNode;
				}
				size++;
				return;

			}
			current = current.next;
			counter++;

		} while (current != null);

	}

	class Node {
		Node next;
		Node prev;
		T value;

		public Node(Node next, Node prev, T value) {
			super();
			this.next = next;
			this.prev = prev;
			this.value = value;
		}
	}

}
