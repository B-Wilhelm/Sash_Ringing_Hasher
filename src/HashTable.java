import java.util.ArrayList;

/**
 * 
 * @author Brett Wilhelm
 * @author Zach Johnson
 *
 */

public class HashTable {
	HelperClass h = new HelperClass();
	int p;
	
	HashTable(int size) {
		p = h.primeFind(size);
		
		// Create hash table of size p
	}
	
	int maxLoad() {
		// Return max load of table
		
		return 0;
	}
	
	int averageLoad() {
		// Return average load of table
		
		return 0;
	}
	
	int size() {
		// Return size of table
		
		return 0;
	}
	
	int numElements() {
		// Return number of elements in table
		
		return 0;
	}
	
	float loadFactor() { return (numElements()/size()); }
	
	void add(Tuple t) {
		// Adds t to the hash table, resizes table at load factor > .7 and rehashes
	}
	
	ArrayList<Tuple> search(int k) {
		// Return list of Tuples with k == key, blank list otherwise
		
		return new ArrayList<Tuple>();
	}
	
	void remove(Tuple t) {
		// Remove t from hash table
	}
}
