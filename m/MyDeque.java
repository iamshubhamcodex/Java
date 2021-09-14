package m;

public class MyDeque<E> {
	private Node<E> head, tail;

	public void add(E data) {
		addToTail(data);
	}
	
	public void addToHead(E data) {
		Node<E> toAdd = new Node<>(data);
		if (head == null) {
			head = tail = toAdd;
			return;
		}
		head.next = toAdd;
		toAdd.prev = head;
		head = head.next;
	}

	public void addToTail(E data) {
		Node<E> toAdd = new Node<>(data);
		if(tail == null) {
			head = tail = toAdd;
		}
		tail.next = toAdd;
		toAdd.prev = tail;
		tail = tail.next;
	}

	@SuppressWarnings("unchecked")
	public E removeLast() {
		if (head == null)
			return (E) "Can not remove from empty Deque";

		E dat = tail.data;
		tail = tail.next;

		if (tail == null) {
			head = null;
		} else {
			tail.prev = null;
		}
		return dat;
	}

	@SuppressWarnings("unchecked")
	public E removeFirst() {
		if (head == null)
			return (E) "Can not remove from empty Deque";
		if(head.next == null) {
			Node<E> h = head;
			head = tail = null;
			return h.data;
		}
		Node<E> tmp = head;
		Node<E> tp = head.next;
		tp.prev = null;
		head = head.next;
		return tmp.data;
	}

	public E getFirst() {
		return head.data;
	}

	public E getLast() {
		return tail.data;
	}

	public static class Node<E> {
		Node<E> next, prev;
		E data;

		public Node(E data) {
			this.data = data;
			next = prev = null;
		}
	}
	
}
