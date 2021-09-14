package m;

public class MyQueue<E> {
	private m.MyDeque<E> md = new m.MyDeque<>();
	
	public void enqueue(E e) {
		md.add(e);
	}	
	public E dequeue() {
		return md.removeFirst();
	}
}
