/**
 * 
 * @author Brett W.
 *
 */

public class HashFunction {
	HelperClass h = new HelperClass();
	int a, b, p;
	
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
