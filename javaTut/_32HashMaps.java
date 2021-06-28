package javaTut;

//import java.util.*;
//import java.util.Map.Entry;

public class _32HashMaps {

	public static void main(String[] args) {
		// MAPS
		
		/**
		 *	In Java, elements of Map are stored in key/value pairs. keys are unique values associated with individual Values. A map cannot contain duplicate keys. And, each key is associated with a single value.
		 *
		 *	We can access and modify values using the keys associated with them. In the above diagram, we have value United States, Brazil and Spain. And we have corresponding keys: us, br and sp. Now, we can access those values using their corresponding keys.
		 * 
		 * 
		 * 	METHODS
		 * 	put(K, V) - Inserts the association of a key K and a value V into the map. If the key is already present, the new value replaces the old value.
		 * 	putAll() - Insrts all the entries from the specified map to this map
		 * 	putIfAbsent(K, V) - Inserts the association if the key K is not already associated with the value V.
		 * 	get(K) - Returns the value associated with the specified key K. If the key is not found, it will return null.
		 * 	getOrDefault(K, defaultValue) - Return the value associated with the specified key K. If the key is not found, it returns the defaultValue
		 * 	containsKey(K) - Checks if the specified key K is present in the map or not.
		 * 	containsValue(V) - Checks if the specified value V is present in the map or not.
		 * 	replace(K, V) - Replace the value of the key with the new specified value v.
		 *	replace(K,oldValue, newValue)- Replaces the old value of key with newValue only if oldValueOfKey == oldValue
		 *	remove(K) - Removes the entry from the map represented by the  
		 **/

//		Map<String, Integer> mp  = new HashMap<>();
//		mp.put("one", 1);
//		mp.put("two", 2);
//		
//		mp.put("one", 7);		//	replaces the prev value of "one"
//		mp.putIfAbsent("one", 1);
//		System.out.println(mp);
//		System.out.println(mp.keySet());
//		System.out.println(mp.values());
//		System.out.println(mp.entrySet());
//		
//		Set<Entry<String, Integer>> entries = mp.entrySet();
//		for(Entry<String, Integer> entry:entries) {
//			entry.setValue(entry.getValue() * 100);
//		}
//		System.out.println(mp);
	
//		String s = "Hi";
//		int l = s.hashCode();
//		double f = (double)l%(double)20;
//		System.out.println(l);
	
		
//		System.out.println(getHash("CAT")%5);
//		System.out.println(getHash("DOG")%5);
//		System.out.println(getHash("BALL")%5);
//		System.out.println(getHash("GOD")%5);
		
	
	
	/**
	 *	INTERNAL WORKING OF HASHMAP
	 *
	 * 	HashMap uses an array table to store its key value pairs. Each element of the array holds the head of a LinkedList to avoid collision. The hash of every key is calculated and the elements are placed in the array using this hash function.
	 * 
	 * The default capacity is kept at 16 and the load factor at 0.75
	 * 
	 * 
	 * 
	 * 
	 **/
	
	
	
	
	
	
	
	}
//	public static int getHash(String s) {
//		int hash = 0;
//		for(int i = 0; i < s.length(); i++) {
//			hash += (s.charAt(i)* 31) ^ (5-i);
//			System.out.println(s.charAt(i) + 1);	//	if you will add s.charAt(i) with a number (int) then s.charAt(i) will be converted to ASCII NUMBER
//		}
//		return hash;
//	}

}
