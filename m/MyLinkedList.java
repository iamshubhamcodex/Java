package m;

public class MyLinkedList<E> {

	transient Node<E> head;
	transient int size = 1;

	public static class Node<E> {
		E data;
		Node<E> next;

		Node(E data) {
			this.data = data;
			next = null;
		}
	}

	public boolean isEmpty() {
		return (head == null);
	}

	public int size() {
		return size;
	}

	public void clear() {
		head = null;
	}

	public boolean contains(E e) {
		return (indexOf(e) >= 0);
	}

	public int indexOf(E o) {
		int index = 0;
		if (head == null)
			return -1;
		if (head.next == null && o.equals(head.data))
			return 0;
		Node<E> temp = head;
		while (temp != null) {
			if (o.equals(temp.data))
				return index;
			index++;
			temp = temp.next;
		}
		return -1;
	}

	public void add(E data) {
		addLast(data);
	}

	public void add(int index, E data) {
		Node<E> x = node(index - 1);
		Node<E> tmp = new Node<>(data);
		Node<E> las = x.next;
		x.next = tmp;
		tmp.next = las;
		size++;
	}

	public void addFirst(E data) {
		Node<E> ta = new Node<>(data);
		Node<E> temp = head;
		ta.next = temp;
		head = ta;
		size++;
	}

	public void addLast(E data) {
		Node<E> ta = new Node<>(data);
		Node<E> temp = head;
		if (head == null) {
			head = ta;
			return;
		}
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = ta;
		size++;
	}

	public void addAll(MyLinkedList<E> t) {
		Node<E> temp = head;
		this.size += t.size;
		if (head == null) {
			head = t.head;
			return;
		}
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = t.head;
	}

	public boolean remove(Object tm) {
		Node<E> temp = head;
		while (temp != null) {
			if (head.data == tm) {
				Node<E> t = head;
				t.next = head;
				t = null;
				size--;
				return true;
			}
			if (tm.equals(temp.next.data)) {
				Node<E> nt = temp.next.next;
				temp.next = nt;
				size--;
				return true;
			}
			temp = temp.next;
		}
		size--;
		return false;
	}

	@SuppressWarnings("unchecked")
	public E removeFirst() {
		if (head == null)
			return (E) "Can not remove from Empty List";
		Node<E> h = head;
		E rt = h.data;
		h.next = head;
		h = null;
		size--;
		return rt;
	}

	@SuppressWarnings("unchecked")
	public E removeLast() {
		Node<E> temp = head;
		if (head == null)
			return (E) "Can not remove from Empty List";
		if (head.next == null) {
			E rt = head.data;
			head = null;
			size--;
			return rt;
		}
		while (temp.next.next != null) {
			temp = temp.next;
		}
		E ret = temp.next.data;
		temp.next = null;
		return ret;
	}

	@SuppressWarnings("unchecked")
	public E get(int index) {
		if (node(index) == null)
			return (E) "Index out of Range";
		return node(index).data;
	}

	public E getFirst() {
		if (head == null)
			return null;
		return head.data;
	}

	public E getLast() {
		Node<E> temp = head;
		if (head == null)
			return null;
		if (head.next == null) {
			return head.data;
		}
		while (temp.next.next != null) {
			temp = temp.next;
		}
		return temp.next.data;
	}

	public E set(int index, E elem) {
		Node<E> x = node(index);
		E temp = x.data;
		x.data = elem;
		return temp;
	}

	private Node<E> node(int index) {
		if (index > size)
			return null;
		Node<E> temp = head;
		int i = 0;
		while (i++ != index) {
			temp = temp.next;
		}
		return temp;
	}

	public void print() {
		Node<E> temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

	public Object[] toArray() {
		Object[] arr = new Object[size];
		int i = 0;
		for (Node<E> n = head; n != null; n = n.next) {
			arr[i++] = n.data;
		}
		return arr;
	}

	public Object[] toArray(Object[] t) {
		if (t.length < size)
			t = (Object[]) java.lang.reflect.Array.newInstance(t.getClass().getComponentType(), size);

		int i = 0;
		for (Node<E> n = head; n != null; n = n.next) {
			t[i++] = n.data;
		}
		return t;
	}

}
