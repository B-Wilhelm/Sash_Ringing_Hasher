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
		int numNonEmptyBuckets = 0;
		for(int i = 0; i<p;i++){
			if(buckets[i] != null){
				numNonEmptyBuckets++;
			}
		}
		return (numElements()/numNonEmptyBuckets);
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
		int bucket = f.hash(t.getKey());
//		System.out.println(bucket);
		buckets[bucket].add(t);
		if(loadFactor() >= .7){
			ArrayList<Tuple> oldTable = new ArrayList<Tuple>();
			for(int i = 0; i < p; i++) {
				oldTable.addAll(buckets[i]);
			}
			new HashTable(2*p);
			for(int i = 0; i < oldTable.size(); i++){
				bucket = f.hash(oldTable.get(i).getKey());
				buckets[bucket].add(oldTable.get(i));
			}
			
		}
	}
	
	ArrayList<Tuple> search(int k) {
		// Return list of Tuples with k == key, blank list otherwise
		System.out.println(k);
		int bucket = f.hash(k);
		System.out.println(bucket);
		return buckets[bucket];
	}
	
	void remove(Tuple t) {
		int bucket = f.hash(t.getKey());
		for(int i=0;i<buckets[bucket].size();i++) {
			if(t.equals(buckets[bucket].get(i))) {
				buckets[bucket].remove(i);//potential out of bounds error
			}
		}
	}
}
