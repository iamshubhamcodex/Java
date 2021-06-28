package m;

public class MyDeque<E> {
	Node<E> head, tail;
	
	public void addToHead(E data) {
		Node<E> toAdd = new Node<>(data);
		
		if(head == null) {
			head = tail = toAdd;
			return;
		}
		head.next = toAdd;
		toAdd.prev = head;
		head = head.next;
	}
	
	public E removeLast() {
		if(head == null) {
			return null;
		}
		E temp = tail.data;
		tail = tail.next;
		
		if(tail == null) {
			head = null;
		}else {
			tail.prev = null;			
		}
		
		return temp;
	}
	
	public static class Node<E> {
		E data;
		Node<E> next, prev;
			
		
		public Node(E data){
			this.data = data;
			this.next = this.prev = null;
		}
	}
	
}
