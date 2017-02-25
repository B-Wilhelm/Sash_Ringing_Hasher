import java.util.ArrayList;

/**
 * 
 * @author Brett Wilhelm
 * @author Zach Johnson
 *
 */

public class HashTable {
	HelperClass h = new HelperClass();
	HashFunction f;
	ArrayList<Tuple>[] cols;
	int p;
	
	@SuppressWarnings("unchecked")
	HashTable(int size) {
		p = h.primeFind(size);
		f = new HashFunction(p);
		cols = new ArrayList[p];
		
		for (int i = 0; i< p; i++) {
			cols[i] = new ArrayList<Tuple>();
		}
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
