/** 
 * 
 * @author Brett W.
 *
 */

public class HelperClass {
	
	
	
	public int primeFind(int range) {	// Helper for constructor
		while(true) {
			if(isPrime(range)){
				return range;
			}
			range++;
		}
	}
	
	public boolean isPrime(int n) {	// Helper for constructor
	    if (n%2==0) return false;
	    
	    for(int i=3;i*i<=n;i+=2) {
	        if(n%i==0) return false;
	    }
	    return true;
	}
}
