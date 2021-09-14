package javaTut;

//import java.util.ArrayDeque;
//import m.MyDeque;

public class _31ArrayDeque {

	public static void main(String[] args) {
		//	ARRAY DOUBLY ENDED QUEUE
		/**
		 *	An ArrayDeque(also known as an "Array Doubly Ended Queue",pronounced as "ArrayDeck") is a special kind of a growable array that allows us to add or remove an element from both sides. 
		 *
		 *	An ArrayDeque implementation can be used as a Stack(Last-In-First-Out) or a Queue(First-In-First-Out).
		 **/
		
		/**	In a regular queue, elements are added from the rear and removed from the front. However, in a Deque, we can insert and remove elements from both front and rear.**/
		
		
		/**
		 * Methods
		 * 	[It has also have methods of Queue and Stack]
		 *	(throws exception)	    (return false/null)
		 *	addFirst(E e)				offerFirst(E e)
		 *	removeFirst()				pollFirst()
		 *	getFirst()					peekFirst()
		 *	addLast(E e)				offerLast(E e)
		 *	removeLast()				pollLast()
		 *	getLast()					peekLast()
		 * 
		 **/
	
//		ArrayDeque<Integer> ad = new ArrayDeque<>();
//		ad.add(45);
//		ad.push(85);
//		ad.addFirst(98);
//		ad.offerFirst(63);
//		
//		System.out.println(ad.poll());
		/**
		 *	ARRAYDEQUE AS A STACK 
		 * 
		 * 	To implement a LIFO(Last-In-First-Out) stacks in Java, it is recommended to use a deque over the Stack class. The ArrayDeque is likely to be faster than the stack class arrayDeque provides the following methods that can be used for implementing a stack.
		 * 
		 * push() - adds an elements to the top of the stack
		 * peek() - returns an element from the top of the stack.
		 * pop() - returns and removes an element from the top of the stack
		 **/
		
//		MyDeque<Integer> md = new MyDeque<>();
//		md.addToHead(65);
//		md.addToHead(36);
//		md.addToHead(366);
//		System.out.println(md.removeLast());
//		System.out.println(md.removeLast());
//		System.out.println(md.removeLast());
		
		
	}

}
