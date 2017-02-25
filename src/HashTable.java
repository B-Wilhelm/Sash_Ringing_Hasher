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
	int p, i;//p is the num of lists
	
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
		
		if(loadFactor() >= .7){
			//TODO resize the table
		}
	}
	
	ArrayList<Tuple> search(int k) {
		// Return list of Tuples with k == key, blank list otherwise
		ArrayList<Tuple> list = new ArrayList<Tuple>();
		for(int i = 0; i < p;i++) {
			for(int j = 0; j < buckets[i].size();j++)
			{
				if(buckets[i].get(j).getKey() == k)
				{
					list.add(buckets[i].get(j));
				}
			}
		}
		return list;
	}
	
	void remove(Tuple t) {
		// Remove t from hash table
	}
}
