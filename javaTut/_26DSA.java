package javaTut;

public class _26DSA {
		//	DSA
	
	/**
	 *	Data Structure is a way to locate memory to all programme or to store data in memory 
	 *	in such a way that App or Programme uses best of memory allocated  
	 **/
	
	
	//	COLLECTION FRAMEWORK
	/**
	 *	These are some framework for Data Structure that is built by Java Developer 
	 *	In Collection Framework there are three types first COLLECTION INTERFACE second MAP INTERFACE third ITERATOR INTERFACE
	 *
	 *	COLLECTION FRAMEWORK includes:-
	 *		List
	 *		Set
	 *		Queue
	 *		Map
	 *		Natural Ordering and Sorting
	 *		 Comparators
	 **/
	
		//	COLLECTION INTERFACE IMPLEMENTS COLLECTON FREAMEWORK
		/**
		 *	The Collection interface is the root interface of the collections framework hierarchy.
		 *	Java does not provide direct implementations of the Collection Interface but provides implementations of its 
	 	 *	like List, Set, Queue.	
	 	 *
	 	 *	We can not make object of Collection framework but we can make object of their children
		 * 	METHODS OF COLLECTION:-
		 * 		add()- inserts the specified element to the collection
		 *  	size() - returns the size of the collection	
		 *   	remove() - removes the specified element from the collection	
		 *    	iterator() - returns an iterator to access elements of the collection
		 *     	addAll() - adds all the elements of a specified collection to the collection
		 *      removeAll() - removes all the elements of the specified collection form the collection
		 *      clear() - removes all the elements of the collection
		 *        		
		 *   these methods are methods of collection framework means the interface which implements collection framework
		 *   will have these methods       		
		 *
		 **/
		
			//	LIST IMPLEMENTS COLLECTION INTERFACE
			/**
			 *	In Java, the List interface is an ordered collection that allows us to store and access elements sequentially. 
			 * 	It extends the Collection Interface.
			 * 
			 * 	Since List is an interface, we cannot create objects of it. In order to use functionalities of the List Interface, 
			 *  we can use these classes:
			 *  	ArrayList
			 *  	LinkedList
			 *  	Vector
			 *  	Stack
			 * 
			 **/
			
			//	SET  IMPLEMENTS COLLECTION INTERFACE
			/**
			 *	The Set interface of the Java Collection framework provides the features of the mathematical set in Java.
			 * 	It extends the Collection Interface. Unlike the List interface, Sets cannot contains duplicate elements
			 * 
			 * 	Since Set is an interface, we cannot create objects of it. In order to use functionalities of the Set Interface, 
			 *  we can use these classes:
			 *  	HashSet
			 *  	LinkedHashSet
			 *  	EnumSet
			 *  	TreeSet
			 * 
			 **/
			
		//	QUEUE IMPLEMENTS COLLECTION INTERFACE
			/**
			 *	The Set interface of the Java Collection framework provides the functionality of the queue data structure.
			 * 	It extends the Collection Interface.
			 * 
			 * 	Since Queue is an interface, we cannot create objects of it. In order to use functionalities of the Queue Interface, 
			 *  we can use these classes:
			 *  	ArrayDeque
			 *  	LinkedList
			 *  	PriorityQueue
			 * 
			 **/

	//	MAP INTERFACE
		/**
		 *	The Map interface of the Java collections framework provides the functionalities of the map data structure 
		 *	Since map is an interface, we cannot create object from it
		 *
		 * 	In order to use functionalities of the Map Interface, we can use these classes:
		 * 		HashMap
		 *  	EnumMap
		 *   	LinkedHashMap
		 *    	WeakHashMap
		 *    	TreeMap
		 **/
		
}
