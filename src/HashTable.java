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
	ArrayList<Tuple>[] buckets;
	int p, i;
	
	@SuppressWarnings("unchecked")
	HashTable(int size) {
		p = h.primeFind(size);
		f = new HashFunction(p);
		buckets = new ArrayList[p];
		
		for (i = 0; i < p; i++) {
			buckets[i] = new ArrayList<Tuple>();
		}
	}
	
	int maxLoad() {
		// Return max load of table
		int max = 0;
		
		for (i = 0; i < p; i++) {
			if(buckets[i].size() > max) {
				max = buckets[i].size();
			}
		}
		
		return max;
	}
	
	int averageLoad() {
		// Return average load of table

		return (numElements()/p);
	}
	
	int size() {
		return p;
	}
	
	int numElements() {
		// Return number of elements in table
		int total = 0;
		
		for (i = 0; i < p; i++) {
			total += buckets[i].size();
		}
		
		return total;
	}
	
	float loadFactor() {
		return (numElements()/size());
	}
	
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
