package m;

public class MyStack<E> {
	
	private MyLinkedList<E> ll = new MyLinkedList<>();
	public void push(E e) {
		ll.add(e);
	}
	@SuppressWarnings("unchecked")
	public E peek()  {
		if(ll.isEmpty()) return (E)("Popping from empty stack is not liable");
		return ll.getLast();
	}
	@SuppressWarnings("unchecked")
	public E pop() {
		if(ll.isEmpty()) return (E)("Popping from empty stack is not liable");
		return ll.removeLast();
	}

	public static void main(String[] args) {
		MyStack<Integer> ms = new MyStack<>();
		ms.push(5);
		ms.push(25);
		ms.push(5);
		ms.push(55);
		ms.peek();
		
	}
}
