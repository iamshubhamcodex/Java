package m;

public class MyStack<E> {
	
	private MyLinkedList<E> ll = new MyLinkedList<>();
	public void push(E e) {
		ll.add(e);
	}
	public E peek() throws Exception {
		if(ll.isEmpty()) throw new Exception("Popping from empty stack is not liable");
		return ll.getLast();
	}
	public E pop() throws Exception {
		if(ll.isEmpty()) throw new Exception("Popping from empty stack is not liable");
		return ll.removeLast();
	}
	
}
