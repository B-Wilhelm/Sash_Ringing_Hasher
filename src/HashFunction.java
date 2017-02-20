/**
 * 
 * @author Brett W.
 *
 */

public class HashFunction {
	int a, b, p;
	HelperClass h = new HelperClass();
	
	HashFunction(int range) {
		p = h.primeFind(range);
	}
	
	float hash(int x) {
		return (a*x+b/p);	// We need a good hash function here
	}
	
	int getA() {
		return a;
	}
	
	void setA(int a) {
		this.a = a;
	}
	
	int getB() {
		return b;
	}
	
	void setB(int b) {
		this.b = b;
	}
	
	int getP() {
		return p;
	}
	
	void setP(int p) {
		this.p = h.primeFind(p);
	}
}
